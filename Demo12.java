package com.github.jlran;

/**
 * Thread��join����
 * @author jlran
 *
 */
/*
 * ��A�߳�ִ�е���B�߳�Join����ʱA�ͻ�ȴ�����B�̶߳�ִ����A�Ż�ִ�У�Join����������ʱ�����߳�ִ��
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
		System.out.println("������...");
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
