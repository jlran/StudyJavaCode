package com.github.jlran;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO 未进行详细的异常处理
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
		 * IO流简介：（Input/Output）
			I/O类库中使用“流”这个抽象概念。Java对设备中数据的操作是通过流的方式。
			表示任何有能力产出数据的数据源对象，或者是有能力接受数据的接收端对象。“流”屏蔽了实际的I/O设备中处理数据的细节。
			IO流用来处理设备之间的数据传输。设备是指硬盘、内存、键盘录入、网络等。
			Java用于操作流的对象都在IO包中。IO流技术主要用来处理设备之间的数据传输。
			由于Java用于操作流的对象都在IO包中。所以使用IO流需要导包如：import java.io.*;
		   IO流的分类
			流按操作数据类型的不同分为两种：字节流与字符流。
			流按流向分为：输入流，输出流（以程序为参照物，输入到程序，或是从程序输出）
		 */
		
	}
}
