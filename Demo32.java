package com.github.jlran;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ֽڻ�����	δ������ϸ���쳣����
 * @author jlran
 *
 */
/*
 *  �������ʹ��Ч��,�Զ������ֽ�����,��Ϊ������.Java�ṩ��ר�ŵ��ֽ������������Ч��.
	BufferedInputStream��BufferedOutputStream
	BufferedOutputStream��BufferedOutputStream�����ͨ�����ٶ�д��������������������ٶȡ������ڲ���һ����������
	������ߴ���Ч�ʡ��鿴API�ĵ������ֿ���ָ���������Ĵ�С����ʵ�ڲ�Ҳ�Ƿ�װ���ֽ����顣û��ָ����������С��Ĭ�ϵ��ֽ���8192��
	��Ȼ�������������ͻ����������Ҫ���ʹ�á����Ȼ������������Ὣ��ȡ�������ݶ��뻺����������������ʱ�����ߵ���flush������
	����������Ὣ����д����
	ע�⣺��Ȼʹ�û��������������Ч��ʱ������С�ļ����ܿ��������ܵ������������ļ���΢��һЩ�Ļ����Ϳ��Կ���ʵ�ʵ����������ˡ�
 */
public class Demo32 {
	public static void main(String[] args) {
		File fileInVideo = new File("T:/work/ƽ̨��̨/ƽ̨������Ƶ2/3.1��δ���������.mp4");
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
