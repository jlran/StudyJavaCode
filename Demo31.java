package com.github.jlran;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO �ֽ���  ������Ƶ ���忽�� + �쳣����
 * @author jlran
 *
 */
public class Demo31 {
	public static void main(String[] args) {
		File fileInVideo = new File("T:/work/ƽ̨��̨/ƽ̨������Ƶ2/3.1��δ���������.mp4");
		File fileOuVideo = new File("T:/a.mp4");
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileInputStream = new FileInputStream(fileInVideo);
			fileOutputStream = new FileOutputStream(fileOuVideo);
			byte[] buffer = new byte[1024];
			int len = 0;
			while((len = fileInputStream.read(buffer)) != -1){
				fileOutputStream.write(buffer, 0, len);
			}
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		}finally{
			try {
				if(fileInputStream != null)
					fileInputStream.close();
				
			} catch (IOException e) {
				throw new RuntimeException(e);
			}finally{
				if(fileOutputStream != null)
					try {
						fileOutputStream.close();
					} catch (IOException e) {
						throw new RuntimeException(e);
					}
			}
		}
	}
}
