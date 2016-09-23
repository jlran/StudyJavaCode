package com.github.jlran;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * IO 	�ֽ���   FileInputStream δ������ϸ���쳣����
 * @author jlran
 *
 */
/*
 * ʲô���ֽ���
	    ������ж��Ƕ���������,һ���ֽ���8��2����λ.�ֽڿ��Ա�ʾ���е�����,�����ı�,��Ƶ,��Ƶ.ͼƬ,������Ϊ�ֽڴ��ڵ�.Ҳ����˵�ֽ�����������ݷǳ��ࡣ
	���ı��ļ��д洢���������������ܶ����ķ�ʽ��ʾ�ġ����ڶ������ļ��д洢���������ö�������ʽ��ʾ�ġ������Ƕ������������ļ��ģ���Ϊ�������ļ���Ϊ���ó�������ȡ����Ƶġ����磬Java��Դ����(.javaԴ�ļ�)�洢���ı��ļ���,����ʹ���ı��༭���Ķ�,����Java����(�ֽ����ļ�)�洢�ڶ������ļ���,���Ա�Java������Ķ����������ļ��������������Ĵ���Ч�ʱ��ı��ļ��ߡ�
		�����Ѿ�֪��File�����װ�����ļ�����·�����ԣ����ǲ������򣨴ӣ��ļ�����д�����ݵķ�����Ϊ��ʵ�ֶ��ļ��Ķ���д������Ҫѧ����ȷ��ʹ��Java��IO��������
	�ֽ����ĳ�����ࣺ
		��������java.io.InputStream
		�������java.io.OutputStream
	�ص㣺
			�ֽ����ĳ�����������������������ƶ������丸������Ϊ�������ĺ�׺��
			�磺FileInputStream, ByteArrayInputStream�ȡ�
	˵����
			�ֽ�������ĵ�Ԫ��һ���ֽڣ����ڲ����������ļ���������������ļ����Ƕ������ļ���
			
	public class FileInputStreamextends InputStream
	FileInputStream ���ļ�ϵͳ�е�ĳ���ļ��л�������ֽڡ���Щ�ļ�����ȡ�������������� 
	FileInputStream ���ڶ�ȡ����ͼ������֮���ԭʼ�ֽ�����Ҫ��ȡ�ַ������뿼��ʹ�� FileReader�� 

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
