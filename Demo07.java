package com.github.jlran;

/**
 * 常见线程的方法
 */
/*
 *   Thread(String name)     初始化线程的名字
	 getName()               返回线程的名字
	 setName(String name)    设置线程对象名
	 sleep()                 线程睡眠指定的毫秒数。
	 getPriority()           返回当前线程对象的优先级   默认线程的优先级是5
	 setPriority(int newPriority) 设置线程的优先级    虽然设置了线程的优先级，但是具体的实现取决于底层的操作系统的实现（最大的优先级是10 ，最小的1 ， 默认是5）。
	 currentThread()         返回CPU正在执行的线程的对象
 */
public class Demo07 extends Thread{
	public Demo07(){
		
	}
	public Demo07(String name){
		super(name);
	}
	
	//重写run方法
	@Override
	public void run() {
		int i = 0;
			while(i < 10){
			System.out.println("getName() :" + this.getName() + " " + i);
			System.out.println("currentThread(): " + Thread.currentThread().getName() + " " + i);
			System.out.println("Thread.currentThread() == this ? " + (Thread.currentThread() == this));
			
			System.out.println("getPriority() :" + super.getPriority() + " " + i);
			System.out.println("getId(): " + super.getId() + " " + i);
			System.out.println("getId(): " + this.getId() + " " + i);
			i++;
		}
		
	}
	public static void main(String[] args) {
		Demo07 thread1 = new Demo07("one");
		Demo07 thread2 = new Demo07("two");
		thread1.setName("线程1");
		thread1.setPriority(7);
		thread2.setPriority(2);
		
		thread1.start();
		thread2.start();
		//如果想要结果看得更清楚 可添加“锁”
		
	}
}
