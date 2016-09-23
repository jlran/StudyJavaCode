package com.github.jlran;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合特有方法
 * @author jlran
 *
 */
/*
 *  1：增加
        void add(int index, E element) 指定位置添加元素            
        boolean addAll(int index, Collection c) 指定位置添加集合  
	2：删除
	E remove(int index) 删除指定位置元素
	
	3：修改
			E set(int index, E element)    返回的是需要替换的集合中的元素
	4：查找：
	        E get(int index)             注意： IndexOutOfBoundsException
			int indexOf(Object o)         // 找不到返回-1
			lastIndexOf(Object o) 
	5：求子集合
			 List<E> subList(int fromIndex, int toIndex) // 不包含toIndex   
 */
public class Demo14 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		
		{
			list.add(1, "哈哈");
			System.out.println(list);	
		}
		
		{
			list.remove(1);
			System.out.println(list);	
		}
		
		{
			String ele = list.set(1, "哈哈");
			System.out.println(ele);
			System.out.println(list);
		}
		
		{
			System.out.println(list.get(1));
			System.out.println(list.indexOf("王五"));
			System.out.println(list.lastIndexOf("张三"));
		}
		
		{
			List<String> str = list.subList(0, 2);
			System.out.println(str);
		}
	}
	
}
