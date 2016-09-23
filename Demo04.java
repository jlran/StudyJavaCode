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
		//System ���Ի�ȡϵͳ������
		Properties ps = System.getProperties();	//��ȡϵͳ����
		System.out.println(ps);
		System.out.println("================================================");
		ps.list(System.out);	//���ϵͳ����
		
		System.out.println("================================================");
		//��ֵ��
		String name = ps.getProperty("os.name");
		String version = System.getProperty("os.version");
		System.out.println(name);
		System.out.println(version);
		
		System.out.println("================================================");
		//Runtime  ����Ҫ��������Ӧ�ó������еĻ���
		Runtime run = Runtime.getRuntime();
		System.out.println(run.freeMemory());	//��ȡ���õ��ڴ���
		System.out.println(run.maxMemory()); 	//JVM��ͼʹ�õ�����ڴ���
		System.out.println(run.totalMemory()); 	//��ȡJVMֻ��ʹ�õ�������
		
		try {
			run.exec("notepad");	//���м��±�
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}	
}
