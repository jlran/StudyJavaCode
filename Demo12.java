package com.github.jlran;

/**
 * Thread的join方法
 * @author jlran
 *
 */
/*
 * 当A线程执行到了B线程Join方法时A就会等待，等B线程都执行完A才会执行，Join可以用来临时加入线程执行
 */


class MyThread implements Runnable{
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("启动了...");
	}
}

public class Demo12 {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread th = new Thread(myThread);
		
		th.start();
		
		int i = 0;
		while(i < 1000){
			try {
				th.join();
				System.out.println("======================>");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("-------------------->");
			i++;
		}
	}

}
