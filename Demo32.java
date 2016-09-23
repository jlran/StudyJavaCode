package com.github.jlran;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节缓冲流	未进行详细的异常处理
 * @author jlran
 *
 */
/*
 *  提高流的使用效率,自定义了字节数组,作为缓冲区.Java提供了专门的字节流缓冲来提高效率.
	BufferedInputStream和BufferedOutputStream
	BufferedOutputStream和BufferedOutputStream类可以通过减少读写次数来提高输入和输出的速度。它们内部有一个缓冲区，
	用来提高处理效率。查看API文档，发现可以指定缓冲区的大小。其实内部也是封装了字节数组。没有指定缓冲区大小，默认的字节是8192。
	显然缓冲区输入流和缓冲区输出流要配合使用。首先缓冲区输入流会将读取到的数据读入缓冲区，当缓冲区满时，或者调用flush方法，
	缓冲输出流会将数据写出。
	注意：当然使用缓冲流来进行提高效率时，对于小文件可能看不到性能的提升。但是文件稍微大一些的话，就可以看到实质的性能提升了。
 */
public class Demo32 {
	public static void main(String[] args) {
		File fileInVideo = new File("T:/work/平台后台/平台操作视频2/3.1如何创建题库分类.mp4");
		File fileOuVideo = new File("T:/a.mp4");
		
		try {
			BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileInVideo));
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileOuVideo));
			
			int len =0;
			while((len = bufferedInputStream.read()) != -1){
				bufferedOutputStream.write(len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
