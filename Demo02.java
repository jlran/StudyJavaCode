package com.github.jlran;

/**
 * String类
 * @author jlran
 *
 */
public class Demo02 {
	
	public static void main(String[] args) {
		//字符串对象的比较
		/**
		 * String Str = “jlran”这个语句会先检查字符串常量池是否存放这个”jlran”这个字符串对象，
		 * 如果没有存在，那么就会在字符串常量池中创建这个字符串对象，如果存在直接返回该字符串的内存地址值。
		 * String str3 = new String(“jlran”) 该语句会创建两个对象,首先会先检查字符串常量池中存不
		 * 存在jlran这个字符串对象，如果不存在就会创建，如果存在就返回内存地址值。创建了出来之后，
		 * new String这个语句就会在堆内存中开辟一个字符串对象。总共两个对象。
		 * 来源：传智播客笔记
		 */
		String str1 = "jlran";
		String str2 = "jlran";
		String str3 = new String("jlran");
		String str4 = new String("jlran");
		System.out.println(str1 == str2); //true
		System.out.println(str1 == str3); //false
		System.out.println(str3 == str4); //false
		
		/**
		 *  int length()  
			char charAt(int index) 
			int indexOf(String str) 
			int lastIndexOf(int ch) 
		 */
		
		String str = new String("Hello World");
		System.out.println("获取字符串的长度  " + str.length());
		System.out.println("获取特定位置的字符  " + str.charAt(1));
		System.out.println("获取特定字符的位置 " + str.indexOf("ll"));
		System.out.println("获取特定字符的位置 " + str.indexOf("lo"));
		System.out.println("获取最后一个字符的位置 " + str.lastIndexOf("o"));
		
		/**
		 *  boolean endsWith(String str) 
			boolean isEmpty()
			boolean contains(CharSequences) 
			boolean equals(Object anObject) 
			boolean equalsIgnoreCase(String anotherString)
		 */	
		str = "";
		System.out.println("是否长度为0[长度为0返回true] " + str.isEmpty());
		str = "Hello World";
		System.out.println("是否以指定字符结束 " + str.endsWith("ld"));
		System.out.println("是否包含指定序列 应用：搜索 " + str.contains("o"));
		//为什么这么写？
		System.out.println("是否相等 " + "123".equals("123"));
		System.out.println(" 忽略大小写是否相等 " + "Abc".equalsIgnoreCase("aBc"));
		
		/**
		 * String(char[] value) 将字符数组转换为字符串
			String(char[] value, int offset, int count)
			Static String valueOf(char[] data)
			static String valueOf(char[] data, int offset, int count)
			char[] toCharArray()  将字符串转换为字符数组
		 */
//		
//		String replace(char oldChar, char newChar) 替换
//		String[] split(String regex) 切割
//		String substring(int beginIndex) 
//		String substring(int beginIndex, int endIndex)截取字串
//		String toUpperCase() 转大写
//		String toLowerCase() 转小写
//		String trim() 去除空格
		
		str ="   Hello World   ";
		System.out.println("去除空格前：" + str);
		System.out.println("去除空格后：" + str.trim());
		System.out.println("去除空格后并转换小写：" +str.trim().toLowerCase());
		System.out.println("去除空格后并转换大写：" +str.trim().toUpperCase());
	}
}	
