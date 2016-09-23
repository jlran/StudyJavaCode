package com.github.jlran;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流拷贝文件 未进行异常处理
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
		 * 注意：
			在使用缓冲区对象时，要明确，缓冲的存在是为了增强流的功能而存在，所以在建立缓冲区对象时，要先有流对象存在.
			缓冲区的出现提高了对流的操作效率。原理：其实就是将数组进行封装。
		 */
	}
}
