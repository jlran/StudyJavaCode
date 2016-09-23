package com.github.jlran;

/**
 * �����̵߳ķ���
 */
/*
 *   Thread(String name)     ��ʼ���̵߳�����
	 getName()               �����̵߳�����
	 setName(String name)    �����̶߳�����
	 sleep()                 �߳�˯��ָ���ĺ�������
	 getPriority()           ���ص�ǰ�̶߳�������ȼ�   Ĭ���̵߳����ȼ���5
	 setPriority(int newPriority) �����̵߳����ȼ�    ��Ȼ�������̵߳����ȼ������Ǿ����ʵ��ȡ���ڵײ�Ĳ���ϵͳ��ʵ�֣��������ȼ���10 ����С��1 �� Ĭ����5����
	 currentThread()         ����CPU����ִ�е��̵߳Ķ���
 */
public class Demo07 extends Thread{
	public Demo07(){
		
	}
	public Demo07(String name){
		super(name);
	}
	
	//��дrun����
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
		thread1.setName("�߳�1");
		thread1.setPriority(7);
		thread2.setPriority(2);
		
		thread1.start();
		thread2.start();
		//�����Ҫ������ø���� ����ӡ�����
		
	}
}
