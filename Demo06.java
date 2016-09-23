package com.github.jlran;

/*
 * 创建线程的方式一
 * 继承Thread类
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
				Thread.sleep(100);	//让该线程睡100毫秒  嘿嘿嘿
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}	 
	}
	
	public static void main(String[] args) {
		Demo06 demo1 = new Demo06("张三");
		Demo06 demo2 = new Demo06("李四");
		demo1.print();
		demo2.print();
		System.out.println("=============================");
		//需要复写run方法，把要执行的任务放在run方法中
		demo1.run();
		demo2.run();
		//调用start()方法启动线程
		System.out.println("=============================");
		demo1.start();
		demo2.start();
		
		/**
		 * 线程的使用细节：
			1.线程的启动使用父类的start()方法
			2.如果线程对象直接调用run()，那么JVN不会当作线程来运行，会认为是普通的方法调用
			3.线程的启动只能由一次，否则抛出异常
			4.可以直接创建Thread类的对象并启动该线程，但是如果没有重写run()，什么也不执行
			5.匿名内部类的线程实现方式
		 */
		
	}

}
