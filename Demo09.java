package com.github.jlran;

/**
 * ������
 * @author jlran
 *
 */


//��Ҫ ��Ҫ������һ��ֻ��20����Դ���� ģ��
class MyThread2 implements Runnable{
	String name;
	static int i = 0; 
	public MyThread2(String name){
		this.name = name;
	}
	@Override
	public void run() {
		while(i < 20){
			synchronized (MyThread2.class) {	//��
				System.out.println(this.name + Integer.toString(i));
			}
			i++;
		}
	}
	
}
public class Demo09 {
	
	public static void main(String[] args) {
		MyThread2 my1 = new MyThread2("����");
		MyThread2 my2 = new MyThread2("����");
		Thread th1 = new Thread(my1);
		Thread th2 = new Thread(my2);
		
		th1.start();
		th2.start();
	}
}
/*
 * 1��ֻ��ͬ������������飩������ͬ������������
	2��ÿ������ֻ��һ����
	3������ͬ�����е����з����������ͬʱ����ͬ�������ͷ�ͬ������
	4����������߳�Ҫִ��һ�����е�һ��ͬ����������������ʹ�õ��������ͬһ��ʵ�������������÷�������ôһ��ֻ��һ���߳��ܹ�ִ�и÷�������һ���߳���Ҫ�ȴ���ֱ����һ���߳���ɷ������ã��ܽ���ǣ�һ���̻߳���˶�������������̲߳����Խ���ö����ͬ��������
	5�������ͬʱ����ͬ�������ͷ�ͬ����������ô����߳���Ȼ���Է��ʸ���ķ�ͬ������
                ͬ����Ӱ�����ܣ����������������ȿ���ͬ�������
	6������߳̽���sleep���� ˯��״̬�����̻߳�����������������ͷ�
*/
