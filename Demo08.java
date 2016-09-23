package com.github.jlran;

//�����̵߳ķ�ʽ��  �Ƽ�ʹ��

/*
 * �����̵߳ĵڶ��ַ�ʽ.ʹ��Runnable�ӿ�.
	�����еĴ�����Ƕ��߳�Ҫִ�е�����Ķ���.
	1��������ʵ��Runnable�ӿ�
	2����дRunnable�ӿ��е�run���������ǽ��߳����еĴ��������run������
	3��ͨ��Thread�ཨ���̶߳���
	4����Runnable�ӿڵ����������Ϊʵ�ʲ��������ݸ�Thread�๹�췽��
	5������Thread���start���������̣߳�������Runable�ӿ�����run����
	ΪʲôҪ��Runnable�ӿڵ�������󴫵ݸ�Thread�Ĺ��캯��?
	��Ϊ�Զ����run��������������Runnable�ӿڵ������������Ҫ���߳�ȥִ��ָ�������run����
	
	���Runnable:
       Thread��������Ϊһ������,��Runnable��ʵ����Ķ������������˵Ĺ���(ͨ�����췽������).
       Runnable�ӿ���ֻ��һ������run����,�÷����ж�����»ᱻ���߳�ִ�еĴ���.�����ǰ�Runnable
                 ��������󴫵ݸ�Thread�Ĺ���ʱ,ʵ���Ͼ����ø�Threadȡ��run����,���Ǹ���Threadһ������.
 */

public class Demo08 {
	public static void main(String[] args) {
		MyThread1 mT1 = new MyThread1("����");
		MyThread1 mT2 = new MyThread1("����");
		Thread th1 = new Thread(mT1);
		Thread th2 = new Thread(mT2);
		th1.start();
		th2.start();
	}
}

class MyThread1 implements Runnable{
	
	String name;
	public MyThread1(String name){
		this.name = name;
	}
	@Override
	public void run() {
		int i = 0;
		while((i++) < 20){
			System.out.println(this.name + Integer.toString(i));
		}
	}
}


