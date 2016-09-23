package com.github.jlran;

/**
 * 锁对象
 * @author jlran
 *
 */


//需要 我要两人抢一共只有20个资源数据 模拟
class MyThread2 implements Runnable{
	String name;
	static int i = 0; 
	public MyThread2(String name){
		this.name = name;
	}
	@Override
	public void run() {
		while(i < 20){
			synchronized (MyThread2.class) {	//锁
				System.out.println(this.name + Integer.toString(i));
			}
			i++;
		}
	}
	
}
public class Demo09 {
	
	public static void main(String[] args) {
		MyThread2 my1 = new MyThread2("张三");
		MyThread2 my2 = new MyThread2("李四");
		Thread th1 = new Thread(my1);
		Thread th2 = new Thread(my2);
		
		th1.start();
		th2.start();
	}
}
/*
 * 1：只能同步方法（代码块），不能同步变量或者类
	2：每个对象只有一个锁
	3：不必同步类中的所有方法，类可以同时具有同步方法和非同步方法
	4：如果两个线程要执行一个类中的一个同步方法，并且他们使用的是了类的同一个实例（对象）来调用方法，那么一次只有一个线程能够执行该方法，另一个线程需要等待，直到第一个线程完成方法调用，总结就是：一个线程获得了对象的锁，其他线程不可以进入该对象的同步方法。
	5：如果类同时具有同步方法和非同步方法，那么多个线程仍然可以访问该类的非同步方法
                同步会影响性能（甚至死锁），优先考虑同步代码块
	6：如果线程进入sleep（） 睡眠状态，该线程会继续持有锁，不会释放
*/
