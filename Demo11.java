package com.github.jlran;

/**
 * ��̨�߳�
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
		System.out.println("��̨����....");
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
 * ��̨�̣߳�������������һֱ��ĬĬ���е��̣߳�ֱ�����̽�����
	 ʵ�֣�
	      setDaemon(boolean on)
	 �ص㣺
		�����еķǺ�̨�߳̽���ʱ������Ҳ����ֹ��ͬʱ����ɱ�������е����к�̨�̣߳�Ҳ����˵��ֻҪ�зǺ�̨�̻߳������У�����Ͳ�����ֹ��
		ִ��main���������߳̾���һ���Ǻ�̨�̡߳�
	       �����������߳�֮ǰ������start����֮ǰ������setDaemon��true���������ſ��԰Ѹ��߳�����Ϊ��̨�̡߳�
	       һ��main����ִ����ϣ���ô����ͻ���ֹ��JVMҲ���˳��ˡ�
	       ����ʹ��isDaemon() ���Ը��߳��Ƿ�Ϊ��̨�̣߳��ػ��̣߳���
 */