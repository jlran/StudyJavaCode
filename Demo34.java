package com.github.jlran;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ַ��������ļ� δ�����쳣����
 * @author jlran
 *
 */
public class Demo34 {
	public static void main(String[] args) throws IOException {
		File fileIn = new File("D:/javaCode/JavaNote/src/com/github/jlran/Demo01.java");
		File fileOu = new File("D:/javaCode/JavaNote/copy.java");
		FileReader fileReader = new FileReader(fileIn);
		FileWriter fileWriter = new FileWriter(fileOu);
		
		char[] buffer = new char[1024];
		int len = 0;
		while((len = fileReader.read(buffer)) != -1){
			fileWriter.write(buffer, 0, len);
		}
		fileReader.close();
		fileWriter.close();
		
		//****************************************
		FileReader reader = new FileReader(fileOu);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String str = null;
		while((str = bufferedReader.readLine()) != null){
			System.out.println(str);
		}
		bufferedReader.close();
		/*
		 * ע�⣺
			��ʹ�û���������ʱ��Ҫ��ȷ������Ĵ�����Ϊ����ǿ���Ĺ��ܶ����ڣ������ڽ�������������ʱ��Ҫ�������������.
			�������ĳ�������˶����Ĳ���Ч�ʡ�ԭ����ʵ���ǽ�������з�װ��
		 */
	}
}
