package com.github.jlran;

/**
 * ��������������
 * @author jlran
 *
 */
/*
 *  wait�����ߵ�ǰ�̷߳���ִ��Ȩ������������������������������״̬��ֱ�������̳߳��л��ִ��Ȩ������������ͬ�ļ�����������������notifyΪֹ��
	notify�����ѳ���ͬһ���������������е���wait�ĵ�һ���̣߳����磬�͹��п�λ�ú󣬵Ⱥ�Ͳ���õĹ˿���������
	ע�⣺�����ѵ��߳��ǽ����˿�����״̬���ȴ�cpuִ��Ȩ��
	notifyAll�����ѳ���ͬһ�������е���wait�����е��̡߳�
 */
class Person01{
	private String name;
	private int age;
	private int food; 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person01(){
		food = 0;
	}
	
	public Person01(String name, int age){
		this.name = name; 
		this.age = age;
		food = 0;
	}
	boolean flag = false;	//flag == true ˵���Ѿ������� û������
	
	public synchronized void Pro(){
		
		if(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		food++;
		System.out.println("������..." + food);
		flag =true;
		notify();
	}
	
	public synchronized void Eat(){
		if(!flag){	//û�н�������
			try {
				wait();
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		food--;
		System.out.println("������..." + food);
		flag =false;
		notify();
	}
}

class Producer implements Runnable{
	Person01 p;
	public Producer(Person01 p){
		this.p = p;
	}
	@Override
	public void run() {
		while(true){
			p.Pro();
		}
	}
}

class Consumer implements Runnable{
	Person01 p;
	public Consumer(Person01 p){
		this.p = p;
	}
	@Override
	public void run() {
		while(true){
			p.Eat();
		}
	}
} 

public class Demo10 {
	
	public static void main(String[] args) {
		Person01 person01 = new Person01("����", 12);
		Producer producer = new Producer(person01);
		Consumer consumer = new Consumer(person01);
		
		Thread th1 = new Thread(producer);
		Thread th2 = new Thread(consumer);
		
		th1.start();
		th2.start();
	}
}
/*
 *  �̼߳�ͨ����ʵ���Ƕ���߳��ڲ���ͬһ����Դ��������������ͬ��wait��notify������notifyAll()��ʹ����ͬ���У�
 *  ��ΪҪ�Գ��м��������������̲߳���������Ҫʹ����ͬ���У���Ϊֻ��ͬ���ž�������
	Ϊʲô��Щ����������Object����
	��Ϊ��Щ�����ڲ����߳�ʱ��������Ҫ��ʶ�����������̳߳��е�����ֻ��ͬһ�����ϵı��ȴ��̣߳����Ա�ͳһ����notify���ѣ�
	�����ԶԲ�ͬ���е��߳̽��л��ѣ����ǵȴ��ͻ��ѱ�����ͬһ�������������ڿ���ʹ����������Կ��Ա����������õķ���������Object����
	wait() �� sleep()��ʲô����
	wait():�ͷ���Դ���ͷ�������Object�ķ���
	sleep():�ͷ���Դ�����ͷ�������Thread�ķ���
	������notifyΪʲô��Ҫ����notifyAll����Ϊֻ��notify���׳���ֻ���ѱ����߳���������³����е������̶߳��ڵȴ���
 * */
