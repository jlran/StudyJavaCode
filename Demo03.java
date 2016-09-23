package com.github.jlran;

/**
 * StringBuffer 和 StringBuilder
 * @author jlran
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		/**
		 * StringBuffer : 由于String是不可变的，所以导致String对象泛滥，在频繁改变字符串对象的应用中，
		        需要使用可变的字符串缓冲区类
			特点：
			1.默认缓冲区的容量是16 （initial capacity of 16 characters） 
			2.StringBuffer  ： 线程安全的所有的缓冲区操作方法都是同步的。效率很低
		 */
		StringBuffer buffer = new StringBuffer("jlran");
		buffer.append(" Hello ");
		buffer.append(1245);
		System.out.println(buffer);
		
		/*
		 *  toString() 返回这个容器的字符串
			indexOf(String str) 返回第一次出现的指定子字符串在该字符串中的索引。
			substring(int start) 从开始的位置开始截取字符串
		 */
		System.out.println(buffer.toString());
		System.out.println(buffer.substring(2));
		/*
		 *
			replace(int start , int end, String str)  
			setCharAt(int index ,char ch)  指定索引位置替换一个字符
		 */
		System.out.println(buffer.replace(0, 5, "hahah"));
		/*
		 * delete(start, end)
		 * deleteCharAt(index)
		 */
		System.out.println(buffer.delete(0, 5));
		System.out.println(buffer.deleteCharAt(5));
		/*
		 * reverse() 
		 */
		System.out.println(buffer.reverse());
		
		/**
		 *  StringBuilder
			StringBuilder 是JDK1.5之后提出的，线程不安全，但是效率要高。用法与StringBuffer类似。
		 */
		System.out.println("=============和上面的用法类似=================");
		StringBuilder builder = new StringBuilder("jlran");
		builder.append(12);
		System.out.println(builder);
	}
}
