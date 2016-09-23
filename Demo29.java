package com.github.jlran;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * IO 	字节流   FileInputStream 未进行详细的异常处理
 * @author jlran
 *
 */
/*
 * 什么是字节流
	    计算机中都是二进制数据,一个字节是8个2进制位.字节可以表示所有的数据,比如文本,音频,视频.图片,都是作为字节存在的.也就是说字节流处理的数据非常多。
	在文本文件中存储的数据是以我们能读懂的方式表示的。而在二进制文件中存储的数据是用二进制形式表示的。我们是读不懂二进制文件的，因为二进制文件是为了让程序来读取而设计的。例如，Java的源程序(.java源文件)存储在文本文件中,可以使用文本编辑器阅读,但是Java的类(字节码文件)存储在二进制文件中,可以被Java虚拟机阅读。二进制文件的优势在于它的处理效率比文本文件高。
		我们已经知道File对象封装的是文件或者路径属性，但是不包含向（从）文件读（写）数据的方法。为了实现对文件的读和写操作需要学会正确的使用Java的IO创建对象。
	字节流的抽象基类：
		输入流：java.io.InputStream
		输出流：java.io.OutputStream
	特点：
			字节流的抽象基类派生出来的子类名称都是以其父类名作为子类名的后缀。
			如：FileInputStream, ByteArrayInputStream等。
	说明：
			字节流处理的单元是一个字节，用于操作二进制文件（计算机中所有文件都是二进制文件）
			
	public class FileInputStreamextends InputStream
	FileInputStream 从文件系统中的某个文件中获得输入字节。哪些文件可用取决于主机环境。 
	FileInputStream 用于读取诸如图像数据之类的原始字节流。要读取字符流，请考虑使用 FileReader。 

 */

public class Demo29 {
	public static void main(String[] args) {
		File file = new File("D:/javaCode/JavaNote/a.txt");
		//FirstInput(file);
		SecInput(file);
	}

	private static void SecInput(File file) {
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			byte[] in  = new byte[1024];
			int len = 0;
			while((len = fileInputStream.read(in)) != -1){
				System.out.println(new String(in, 0, len));
			}
			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void FirstInput(File file) {
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			int len ;
			while((len = fileInputStream.read()) != -1){
				System.out.print((char)len);
			}
			fileInputStream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
