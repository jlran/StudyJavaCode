package com.github.jlran;

import java.io.File;
import java.io.IOException;

/**
 * File类
 * @author jlran
 *
 */
/*
 *  存储在变量,数组和对象中的数据是暂时的,当程序终止时他们就会丢失.为了能够永
	久的保存程序中创建的数据,需要将他们存储到硬盘或光盘的文件中.这些文件可以移动,传送,亦可以被其他程序使用.
	由于数据存储在文件中,所以我们需要学习一个和文件有密切关系的类,叫做File类,将要掌握获取文件的属性以及删
	除和重命名文件.最终如何向文件中写入数据和从文件中读取数据.
	那么File类关心的是在磁盘上文件的存储.
	File类描述的是一个文件或文件夹。（文件夹也可以称为目录）
	该类的出现是对文件系统的中的文件以及文件夹进行对象的封装。可以通过对象的思想来操作文件以及文件夹。
		可以用面向对象的处理问题，通过该对象的方法，可以得到文件或文件夹的信息方便了对文件与文件夹的属性信息进行操作。
		文件包含很多的信息:如文件名、创建修改时间、大小、可读可写属性等。
		
File对象也可以表示不存在的文件。其实代表了一个抽象路径
构建一个File类的实例并不会在机器上创建一个文件.不管文件是否存在都可以创建任意文件名的File实例,可以调用File实例的
exists方法判断文件或目录是否存在
 */
public class Demo26 {
	public static void main(String[] args) {
		File file = new File("D:/javaCode/JavaNote/a.txt");
		System.out.println(file.exists());
		
		if(!file.exists()){	//不存在 则创建
			try {
				file.createNewFile();	//创建一个新的文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(file.isDirectory());	//是否是目录
		System.out.println(file.isFile());	//是否是文件
		System.out.println(file.getName());	//获取名字
		System.out.println(file.length());//获取文件的大小
		System.out.println(file.isHidden());//是否是隐藏文件
		System.out.println(file.delete());	//删除
		/*
		 * 创建：
		createNewFile()	在指定位置创建一个空文件，成功就返回true，如果已存在就不创建然后返回false
		mkdir()			在指定位置创建目录，这只会创建最后一级目录，如果上级目录不存在就抛异常。
		mkdirs()		在指定位置创建目录，这会创建路径中所有不存在的目录。
		renameTo(File dest)	重命名文件或文件夹，也可以操作非空的文件夹，文件不同时相当于文件的剪切,剪切时候
							不能操作非空的文件夹。移动/重命名成功则返回true，失败则返回false。

	
	删除：
		delete()		删除文件或一个空文件夹，如果是文件夹且不为空，则不能删除，成功返回true，失败返回false。
		deleteOnExit()	在虚拟机终止时，请求删除此抽象路径名表示的文件或目录，保证程序异常时创建的临时文件也可以被删除

		
	判断：
		exists()		文件或文件夹是否存在。
		isFile()		是否是一个文件，如果不存在，则始终为false。
		isDirectory()	是否是一个目录，如果不存在，则始终为false。
		isHidden()		是否是一个隐藏的文件或是否是隐藏的目录。
		isAbsolute()	测试此抽象路径名是否为绝对路径名。

		
	获取：
	getName()		获取文件或文件夹的名称，不包含上级路径。
	getPath()       返回绝对路径，可以是相对路径，但是目录要指定
	getAbsolutePath()	获取文件的绝对路径，与文件是否存在没关系
	length()		获取文件的大小（字节数），如果文件不存在则返回0L，如果是文件夹也返回0L。
	getParent()		返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回null。
	lastModified()	获取最后一次被修改的时间。
		文件夹相关：
	staic File[] listRoots()	列出所有的根目录（Window中就是所有系统的盘符）
	list()						返回目录下的文件或者目录名，包含隐藏文件。对于文件这样操作会返回null。
	list(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。
	listFiles()					返回目录下的文件或者目录对象（File类实例），包含隐藏文件。对于文件这样操作会返回null。
	listFiles(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null。
	*/
	}
}
