package com.github.jlran;

import java.io.IOException;
import java.util.Properties;

/**
 * System Runtime
 * @author jlran
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		//System 可以获取系统的属性
		Properties ps = System.getProperties();	//获取系统属性
		System.out.println(ps);
		System.out.println("================================================");
		ps.list(System.out);	//输出系统属性
		
		System.out.println("================================================");
		//键值对
		String name = ps.getProperty("os.name");
		String version = System.getProperty("os.version");
		System.out.println(name);
		System.out.println(version);
		
		System.out.println("================================================");
		//Runtime  类主要描述的是应用程序运行的环境
		Runtime run = Runtime.getRuntime();
		System.out.println(run.freeMemory());	//获取可用的内存数
		System.out.println(run.maxMemory()); 	//JVM试图使用的最大内存数
		System.out.println(run.totalMemory()); 	//获取JVM只能使用的总容量
		
		try {
			run.exec("notepad");	//运行记事本
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}	
}
