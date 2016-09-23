package com.github.jlran;

import java.io.File;
import java.io.IOException;

/**
 * File��
 * @author jlran
 *
 */
/*
 *  �洢�ڱ���,����Ͷ����е���������ʱ��,��������ֹʱ���Ǿͻᶪʧ.Ϊ���ܹ���
	�õı�������д���������,��Ҫ�����Ǵ洢��Ӳ�̻���̵��ļ���.��Щ�ļ������ƶ�,����,����Ա���������ʹ��.
	�������ݴ洢���ļ���,����������Ҫѧϰһ�����ļ������й�ϵ����,����File��,��Ҫ���ջ�ȡ�ļ��������Լ�ɾ
	�����������ļ�.����������ļ���д�����ݺʹ��ļ��ж�ȡ����.
	��ôFile����ĵ����ڴ������ļ��Ĵ洢.
	File����������һ���ļ����ļ��С����ļ���Ҳ���Գ�ΪĿ¼��
	����ĳ����Ƕ��ļ�ϵͳ���е��ļ��Լ��ļ��н��ж���ķ�װ������ͨ�������˼���������ļ��Լ��ļ��С�
		�������������Ĵ������⣬ͨ���ö���ķ��������Եõ��ļ����ļ��е���Ϣ�����˶��ļ����ļ��е�������Ϣ���в�����
		�ļ������ܶ����Ϣ:���ļ����������޸�ʱ�䡢��С���ɶ���д���Եȡ�
		
File����Ҳ���Ա�ʾ�����ڵ��ļ�����ʵ������һ������·��
����һ��File���ʵ���������ڻ����ϴ���һ���ļ�.�����ļ��Ƿ���ڶ����Դ��������ļ�����Fileʵ��,���Ե���Fileʵ����
exists�����ж��ļ���Ŀ¼�Ƿ����
 */
public class Demo26 {
	public static void main(String[] args) {
		File file = new File("D:/javaCode/JavaNote/a.txt");
		System.out.println(file.exists());
		
		if(!file.exists()){	//������ �򴴽�
			try {
				file.createNewFile();	//����һ���µ��ļ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(file.isDirectory());	//�Ƿ���Ŀ¼
		System.out.println(file.isFile());	//�Ƿ����ļ�
		System.out.println(file.getName());	//��ȡ����
		System.out.println(file.length());//��ȡ�ļ��Ĵ�С
		System.out.println(file.isHidden());//�Ƿ��������ļ�
		System.out.println(file.delete());	//ɾ��
		/*
		 * ������
		createNewFile()	��ָ��λ�ô���һ�����ļ����ɹ��ͷ���true������Ѵ��ھͲ�����Ȼ�󷵻�false
		mkdir()			��ָ��λ�ô���Ŀ¼����ֻ�ᴴ�����һ��Ŀ¼������ϼ�Ŀ¼�����ھ����쳣��
		mkdirs()		��ָ��λ�ô���Ŀ¼����ᴴ��·�������в����ڵ�Ŀ¼��
		renameTo(File dest)	�������ļ����ļ��У�Ҳ���Բ����ǿյ��ļ��У��ļ���ͬʱ�൱���ļ��ļ���,����ʱ��
							���ܲ����ǿյ��ļ��С��ƶ�/�������ɹ��򷵻�true��ʧ���򷵻�false��

	
	ɾ����
		delete()		ɾ���ļ���һ�����ļ��У�������ļ����Ҳ�Ϊ�գ�����ɾ�����ɹ�����true��ʧ�ܷ���false��
		deleteOnExit()	���������ֹʱ������ɾ���˳���·������ʾ���ļ���Ŀ¼����֤�����쳣ʱ��������ʱ�ļ�Ҳ���Ա�ɾ��

		
	�жϣ�
		exists()		�ļ����ļ����Ƿ���ڡ�
		isFile()		�Ƿ���һ���ļ�����������ڣ���ʼ��Ϊfalse��
		isDirectory()	�Ƿ���һ��Ŀ¼����������ڣ���ʼ��Ϊfalse��
		isHidden()		�Ƿ���һ�����ص��ļ����Ƿ������ص�Ŀ¼��
		isAbsolute()	���Դ˳���·�����Ƿ�Ϊ����·������

		
	��ȡ��
	getName()		��ȡ�ļ����ļ��е����ƣ��������ϼ�·����
	getPath()       ���ؾ���·�������������·��������Ŀ¼Ҫָ��
	getAbsolutePath()	��ȡ�ļ��ľ���·�������ļ��Ƿ����û��ϵ
	length()		��ȡ�ļ��Ĵ�С���ֽ�����������ļ��������򷵻�0L��������ļ���Ҳ����0L��
	getParent()		���ش˳���·������Ŀ¼��·�����ַ����������·����û��ָ����Ŀ¼���򷵻�null��
	lastModified()	��ȡ���һ�α��޸ĵ�ʱ�䡣
		�ļ�����أ�
	staic File[] listRoots()	�г����еĸ�Ŀ¼��Window�о�������ϵͳ���̷���
	list()						����Ŀ¼�µ��ļ�����Ŀ¼�������������ļ��������ļ����������᷵��null��
	list(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��
	listFiles()					����Ŀ¼�µ��ļ�����Ŀ¼����File��ʵ���������������ļ��������ļ����������᷵��null��
	listFiles(FilenameFilter filter)	����ָ����ǰĿ¼�з��Ϲ������������ļ�����Ŀ¼�������ļ����������᷵��null��
	*/
	}
}