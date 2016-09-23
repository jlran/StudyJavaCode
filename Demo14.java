package com.github.jlran;

import java.util.ArrayList;
import java.util.List;

/**
 * List�������з���
 * @author jlran
 *
 */
/*
 *  1������
        void add(int index, E element) ָ��λ�����Ԫ��            
        boolean addAll(int index, Collection c) ָ��λ����Ӽ���  
	2��ɾ��
	E remove(int index) ɾ��ָ��λ��Ԫ��
	
	3���޸�
			E set(int index, E element)    ���ص�����Ҫ�滻�ļ����е�Ԫ��
	4�����ң�
	        E get(int index)             ע�⣺ IndexOutOfBoundsException
			int indexOf(Object o)         // �Ҳ�������-1
			lastIndexOf(Object o) 
	5�����Ӽ���
			 List<E> subList(int fromIndex, int toIndex) // ������toIndex   
 */
public class Demo14 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("����");
		
		{
			list.add(1, "����");
			System.out.println(list);	
		}
		
		{
			list.remove(1);
			System.out.println(list);	
		}
		
		{
			String ele = list.set(1, "����");
			System.out.println(ele);
			System.out.println(list);
		}
		
		{
			System.out.println(list.get(1));
			System.out.println(list.indexOf("����"));
			System.out.println(list.lastIndexOf("����"));
		}
		
		{
			List<String> str = list.subList(0, 2);
			System.out.println(str);
		}
	}
	
}
