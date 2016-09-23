package com.github.jlran;

/**
 * 后台线程
 * @author jlran
 *
 */

class MyThread3 implements Runnable{
	int i = 0;
	@Override
	public void run() {
		//
		while((i++) < 1000)
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("后台运行....");
	}
}
public class Demo11 {
	
	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();
		Thread thread = new Thread(myThread3);
		
		thread.setDaemon(true);
		thread.start();
		System.out.println(thread.isDaemon());
	}
}

/**
 * 后台线程：就是隐藏起来一直在默默运行的线程，直到进程结束。
	 实现：
	      setDaemon(boolean on)
	 特点：
		当所有的非后台线程结束时，程序也就终止了同时还会杀死进程中的所有后台线程，也就是说，只要有非后台线程还在运行，程序就不会终止，
		执行main方法的主线程就是一个非后台线程。
	       必须在启动线程之前（调用start方法之前）调用setDaemon（true）方法，才可以把该线程设置为后台线程。
	       一旦main（）执行完毕，那么程序就会终止，JVM也就退出了。
	       可以使用isDaemon() 测试该线程是否为后台线程（守护线程）。
 */