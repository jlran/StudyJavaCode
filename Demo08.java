package com.github.jlran;

//创建线程的方式二  推荐使用

/*
 * 创建线程的第二种方式.使用Runnable接口.
	该类中的代码就是对线程要执行的任务的定义.
	1：定义了实现Runnable接口
	2：重写Runnable接口中的run方法，就是将线程运行的代码放入在run方法中
	3：通过Thread类建立线程对象
	4：将Runnable接口的子类对象作为实际参数，传递给Thread类构造方法
	5：调用Thread类的start方法开启线程，并调用Runable接口子类run方法
	为什么要将Runnable接口的子类对象传递给Thread的构造函数?
	因为自定义的run方法所属对象是Runnable接口的子类对象，所以要让线程去执行指定对象的run方法
	
	理解Runnable:
       Thread类可以理解为一个工人,而Runnable的实现类的对象就是这个工人的工作(通过构造方法传递).
       Runnable接口中只有一个方法run方法,该方法中定义的事会被新线程执行的代码.当我们把Runnable
                 的子类对象传递给Thread的构造时,实际上就是让给Thread取得run方法,就是给了Thread一项任务.
 */

public class Demo08 {
	public static void main(String[] args) {
		MyThread1 mT1 = new MyThread1("张三");
		MyThread1 mT2 = new MyThread1("李四");
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


