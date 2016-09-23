package com.github.jlran;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO δ������ϸ���쳣����
 * @author jlran
 *
 */
public class Demo28 {
	public static void main(String[] args) {
		File file = new File("D:/javaCode/JavaNote/a.txt");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write('H');
			fileOutputStream.write('e');
			fileOutputStream.write('l');
			fileOutputStream.write('l');
			fileOutputStream.write('o');
			fileOutputStream.close();
			
			FileInputStream  fileInputStream = new FileInputStream(file);
			int ch;
			while((ch = fileInputStream.read()) != -1){
				System.out.print((char)ch);
			}
			fileInputStream.close();
			//file.delete();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * IO����飺��Input/Output��
			I/O�����ʹ�á��������������Java���豸�����ݵĲ�����ͨ�����ķ�ʽ��
			��ʾ�κ��������������ݵ�����Դ���󣬻������������������ݵĽ��ն˶��󡣡�����������ʵ�ʵ�I/O�豸�д������ݵ�ϸ�ڡ�
			IO�����������豸֮������ݴ��䡣�豸��ָӲ�̡��ڴ桢����¼�롢����ȡ�
			Java���ڲ������Ķ�����IO���С�IO��������Ҫ���������豸֮������ݴ��䡣
			����Java���ڲ������Ķ�����IO���С�����ʹ��IO����Ҫ�����磺import java.io.*;
		   IO���ķ���
			���������������͵Ĳ�ͬ��Ϊ���֣��ֽ������ַ�����
			���������Ϊ������������������Գ���Ϊ��������뵽���򣬻��Ǵӳ��������
		 */
		
	}
}
