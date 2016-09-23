package com.github.jlran;

import java.io.File;

/**
 * File类
 * @author jlran
 *
 */
/*
 * 返回一个目录下的所有文件
 */

public class Demo27 {
	public static void isListFile(File file){
		File[] dir = file.listFiles();
		for (File file2 : dir) {
			System.out.println(file2.getName());
			if(file2.isHidden()){
				continue;
			}
			if(file2.isDirectory()){
				isListFile(file2);
			}
		}
	}
	
	public static void main(String[] args) {
		File root = new File("F:/");
		if(root.isDirectory()){
			isListFile(root);
		}
	}
}
