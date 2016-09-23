package com.github.jlran;

/**
 * 消费者与生产者
 * @author jlran
 *
 */
/*
 *  wait：告诉当前线程放弃执行权，并放弃监视器（锁）并进入阻塞状态，直到其他线程持有获得执行权，并持有了相同的监视器（锁）并调用notify为止。
	notify：唤醒持有同一个监视器（锁）中调用wait的第一个线程，例如，餐馆有空位置后，等候就餐最久的顾客最先入座
	注意：被唤醒的线程是进入了可运行状态。等待cpu执行权。
	notifyAll：唤醒持有同一监视器中调用wait的所有的线程。
 */
class Person01{
	private String name;
	private int age;
	private int food; 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person01(){
		food = 0;
	}
	
	public Person01(String name, int age){
		this.name = name; 
		this.age = age;
		food = 0;
	}
	boolean flag = false;	//flag == true 说明已经生产了 没有消费
	
	public synchronized void Pro(){
		
		if(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		food++;
		System.out.println("生产了..." + food);
		flag =true;
		notify();
	}
	
	public synchronized void Eat(){
		if(!flag){	//没有进行生产
			try {
				wait();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		food--;
		System.out.println("消费了..." + food);
		flag =false;
		notify();
	}
}

class Producer implements Runnable{
	Person01 p;
	public Producer(Person01 p){
		this.p = p;
	}
	@Override
	public void run() {
		while(true){
			p.Pro();
		}
	}
}

class Consumer implements Runnable{
	Person01 p;
	public Consumer(Person01 p){
		this.p = p;
	}
	@Override
	public void run() {
		while(true){
			p.Eat();
		}
	}
} 

public class Demo10 {
	
	public static void main(String[] args) {
		Person01 person01 = new Person01("张三", 12);
		Producer producer = new Producer(person01);
		Consumer consumer = new Consumer(person01);
		
		Thread th1 = new Thread(producer);
		Thread th2 = new Thread(consumer);
		
		th1.start();
		th2.start();
	}
}
/*
 *  线程间通信其实就是多个线程在操作同一个资源，但操作动作不同，wait，notify（），notifyAll()都使用在同步中，
 *  因为要对持有监视器（锁）的线程操作，所以要使用在同步中，因为只有同步才具有锁。
	为什么这些方法定义在Object类中
	因为这些方法在操作线程时，都必须要标识他们所操作线程持有的锁，只有同一个锁上的被等待线程，可以被统一锁上notify唤醒，
	不可以对不同锁中的线程进行唤醒，就是等待和唤醒必须是同一个锁。而锁由于可以使任意对象，所以可以被任意对象调用的方法定义在Object类中
	wait() 和 sleep()有什么区别？
	wait():释放资源，释放锁。是Object的方法
	sleep():释放资源，不释放锁。是Thread的方法
	定义了notify为什么还要定义notifyAll，因为只用notify容易出现只唤醒本方线程情况，导致程序中的所有线程都在等待。
 * */
