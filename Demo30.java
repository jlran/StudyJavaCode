package com.github.jlran;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO �ֽ���   OutputStream δ������ϸ���쳣����
 * @author jlran
 *
 */

/*
 * ע�⣺ʹ��write(int b)��������Ȼ���յ���int���Ͳ���������write �ĳ���Э���ǣ��������д��һ���ֽڡ�
 * Ҫд����ֽ��ǲ��� b �İ˸���λ��b �� 24 ����λ�������ԡ�
 * 
 *  public class FileOutputStreamextends 
 *  OutputStream�ļ�����������ڽ�����д�� File �� FileDescriptor ����������ļ��Ƿ���û��ܷ���Ա�����ȡ���ڻ���ƽ̨��
 *  �ر���ĳЩƽ̨һ��ֻ����һ�� FileOutputStream���������ļ�д����󣩴��ļ�����д�롣����������£�������漰���ļ��Ѿ�
 *  �򿪣�������еĹ��췽����ʧ�ܡ� 
	FileOutputStream ����д������ͼ������֮���ԭʼ�ֽڵ�����Ҫд���ַ������뿼��ʹ�� FileWriter�� 

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
