package com.github.jlran;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO 字节流   OutputStream 未进行详细的异常处理
 * @author jlran
 *
 */

/*
 * 注意：使用write(int b)方法，虽然接收的是int类型参数，但是write 的常规协定是：向输出流写入一个字节。
 * 要写入的字节是参数 b 的八个低位。b 的 24 个高位将被忽略。
 * 
 *  public class FileOutputStreamextends 
 *  OutputStream文件输出流是用于将数据写入 File 或 FileDescriptor 的输出流。文件是否可用或能否可以被创建取决于基础平台。
 *  特别是某些平台一次只允许一个 FileOutputStream（或其他文件写入对象）打开文件进行写入。在这种情况下，如果所涉及的文件已经
 *  打开，则此类中的构造方法将失败。 
	FileOutputStream 用于写入诸如图像数据之类的原始字节的流。要写入字符流，请考虑使用 FileWriter。 

 */
public class Demo30 {
	public static void main(String[] args) {
		File file = new File("D:/javaCode/JavaNote/a.txt");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			//FirstOutput(fileOutputStream);
			SecOutput(fileOutputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void SecOutput(FileOutputStream fileOutputStream)
			throws IOException {
		byte[] bt = "Hello World".getBytes();
		fileOutputStream.write(bt);
		fileOutputStream.close();
	}

	private static void FirstOutput(FileOutputStream fileOutputStream)
			throws IOException {
		fileOutputStream.write('A');
		fileOutputStream.write('b');
		fileOutputStream.write('c');
		fileOutputStream.write('d');
		fileOutputStream.close();
	}
}
