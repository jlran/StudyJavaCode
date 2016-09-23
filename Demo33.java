package com.github.jlran;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流  未进行异常处理
 * @author jlran
 *
 */
/*
 * 计算机并不区分二进制文件与文本文件。所有的文件都是以二进制形式来存储的，因此，从本质上说，所有的文件都是二进制文件。
 * 所以字符流是建立在字节流之上的，它能够提供字符层次的编码和解码。例如，在写入一个字符时，Java虚拟机会将字符转为文件
 * 指定的编码（默认是系统默认编码），在读取字符时，再将文件指定的编码转化为字符。
	常见的码表如下：
	ASCII：		美国标准信息交换码。用一个字节的7位可以表示。
	ISO8859-1：	拉丁码表。欧洲码表，用一个字节的8位表示。又称Latin-1(拉丁编码)或“西欧语言”。ASCII码是包含的仅仅是英文字母，并且没有完全占满256个编码位置，所以它以ASCII为基础，在空置的0xA0-0xFF的范围内，加入192个字母及符号，
	藉以供使用变音符号的拉丁字母语言使用。从而支持德文，法文等。因而它依然是一个单字节编码，只是比ASCII更全面。
	GB2312：	 英文占一个字节，中文占两个字节.中国的中文编码表。
	GBK：		中国的中文编码表升级，融合了更多的中文文字符号。
	Unicode：  国际标准码规范，融合了多种文字。所有文字都用两个字节来表示，Java语言使用的就是unicode。
	UTF-8：		最多用三个字节来表示一个字符。
	（我们以后接触最多的是iso8859-1、gbk、utf-8）
	查看上述码表后，很显然中文的‘中’在iso8859-1中是没有对映的编码的。或者一个字符在2中码表中对应的编码不同，例如有一些字在不同
	的编码中是有交集的，例如bjg5 和gbk 中的汉字简体和繁体可能是一样的，就是有交集，但是在各自码表中的数字不一样。
	
	ISO8859-1：一个字节
	GBK： 两个字节包含了英文字符和扩展的中文 	ISO8859-1+中文字符
	UTF-8 万国码，推行的。是1~3个字节不等长。英文存的是1个字节，中文存的是3个字节，是为了节省空间。
	
	字符流就是：字节流 + 编码表，为了更便于操作文字数据。字符流的抽象基类：Reader ， Writer。
	由这些类派生出来的子类名称都是以其父类名作为子类名的后缀，如FileReader、FileWriter。
 */
public class Demo33 {
	public static void main(String[] args) {
		File file = new File("D:/javaCode/JavaNote/b.txt");
		try {
			FileReader fileReader = new FileReader(file);
			int len = 0;
			while((len = fileReader.read()) != -1){
				System.out.print((char)len);
			}
			fileReader.close();
			
			
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("hello，中国！");
			fileWriter.close();
			
			FileWriter fileWriterTrue = new FileWriter(file, true);	//追加
			fileWriterTrue.write("\r\n对不对 ，追加了！");	// \r\n 换行
			fileWriterTrue.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

/*
 * Reader
		方法：
		1，int read()：
		读取一个字符。返回的是读到的那个字符。如果读到流的末尾，返回-1.
		2，int read(char[])：
		将读到的字符存入指定的数组中，返回的是读到的字符个数，也就是往数组里装的元素的个数。如果读到流的末尾，返回-1.
		3，close()
		读取字符其实用的是window系统的功能，就希望使用完毕后，进行资源的释放
		由于Reader也是抽象类，所以想要使用字符输入流需要使用Reader的实现类。查看API文档。找到了FileReader。
		1，用于读取文本文件的流对象。
		2，用于关联文本文件。
		构造函数：在读取流对象初始化的时候，必须要指定一个被读取的文件。
		如果该文件不存在会发生FileNotFoundException.
	Writer
		Writer中的常见的方法：
		1，write(ch): 将一个字符写入到流中。
		2，write(char[]): 将一个字符数组写入到流中。
		3，write(String): 将一个字符串写入到流中。
		4，flush():刷新流，将流中的数据刷新到目的地中，流还存在。
		5，close():关闭资源：在关闭前会先调用flush()，刷新流中的数据去目的地。然流关闭。
		发现基本方法和OutputStream 类似，有write方法，功能更多一些。可以接收字符串。
		同样道理Writer是抽象类无法创建对象。查阅API文档，找到了Writer的子类FileWriter
		1：将文本数据存储到一个文件中。
		
	追加文件：
		默认的FileWriter方法新值会覆盖旧值，想要实现追加功能需要
		使用如下构造函数创建输出流 append值为true即可。
		FileWriter(String fileName, boolean append)
		FileWriter(File file, boolean append)
*
*/
