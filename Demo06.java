package com.github.jlran;

/*
 * �����̵߳ķ�ʽһ
 * �̳�Thread��
 */
public class Demo06 extends Thread{
	
	String name;
	
	@Override
	public void run() {
		print();
	}
	
	public Demo06(String name){
		this.name = name;
	}
	
	public void print(){
		for(int i = 0; i < 20; i++)
			System.out.println(this.name + Integer.toString(i));
		
			try {
				Thread.sleep(100);	//�ø��߳�˯100����  �ٺٺ�
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}	 
	}
	
	public static void main(String[] args) {
		Demo06 demo1 = new Demo06("����");
		Demo06 demo2 = new Demo06("����");
		demo1.print();
		demo2.print();
		System.out.println("=============================");
		//��Ҫ��дrun��������Ҫִ�е��������run������
		demo1.run();
		demo2.run();
		//����start()���������߳�
		System.out.println("=============================");
		demo1.start();
		demo2.start();
		
		/**
		 * �̵߳�ʹ��ϸ�ڣ�
			1.�̵߳�����ʹ�ø����start()����
			2.����̶߳���ֱ�ӵ���run()����ôJVN���ᵱ���߳������У�����Ϊ����ͨ�ķ�������
			3.�̵߳�����ֻ����һ�Σ������׳��쳣
			4.����ֱ�Ӵ���Thread��Ķ����������̣߳��������û����дrun()��ʲôҲ��ִ��
			5.�����ڲ�����߳�ʵ�ַ�ʽ
		 */
		
	}

}
