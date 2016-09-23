package com.github.jlran;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����  -->Collection�ӿڵĹ��Է���
 * @author jlran
 *
 */
/*
 * ���Ϻ������д�ŵĶ��Ƕ�������ö��Ƕ�����
 */
/*
	Collection	������Ҫ�������ɸ������ʱ��ʹ�ü���
	List
	
		���������Ҫ�����洢˳��, ���ұ����ظ�Ԫ��, ʹ��List.
		�����ѯ�϶�, ��ôʹ��ArrayList
		�����ȡ�϶�, ��ôʹ��LinkedList
		�����Ҫ�̰߳�ȫ, ��ôʹ��Vector
	Set
		������ǲ���Ҫ�����洢˳��, ������Ҫȥ���ظ�Ԫ��, ʹ��Set.
		���������Ҫ��Ԫ������, ��ôʹ��TreeSet
		������ǲ���Ҫ����, ʹ��HashSet, HashSet��
		TreeSetЧ�ʸ�.
		���������Ҫ�����洢˳��, ��Ҫ�����ظ�Ԫ��, ��ôʹ��LinkedHashSet
*/
/*Collection�ӿڵĹ��Է���
	 ���ӣ�
			1��add()	��ָ������洢��������
	                      add �����Ĳ���������Object ���ڽ����������
			2��addAll() ��ָ�������е�Ԫ����ӵ����ø÷����ͼ�����
	ɾ����
			3��remove() ��ָ���Ķ���Ӽ�����ɾ��
			4��removeAll() ��ָ�������е�Ԫ��ɾ��
	�޸�
			5��clear() ��ռ����е�����Ԫ��
	�ж�
			6��isEmpty() �жϼ����Ƿ�Ϊ��
			7��contains() �жϼ��Ϻ����Ƿ����ָ������
	            
			8��containsAll() �жϼ������Ƿ����ָ������
	                            ʹ��equals()�ж����������Ƿ����  
	��ȡ:   9��int size()    ���ؼ��������Ĵ�С
	
	ת������ 10�� toArray()   ����ת������
 */

class Person02{
	//���¾�û�ж� ���ݽ��з�װ
	String name;
	int age;
	
	public Person02(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.age;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.age;
	}
	
	
	public boolean equals(Person02 p) {
		return (this.name == p.name);
	}
}
public class Demo13 {
	public static void main(String[] args) {
	/*	Collection<String> collection = new ArrayList<String>();
		collection.add("Hello");
		collection.add(" ");
		collection.add("Hello");
		collection.add("World!");
		
		{
			System.out.println(collection);
			System.out.println(collection.size());
			Object[] str = collection.toArray();
			for (Object object : str) {
				System.out.println(object);
			}
			
		}
		
		collection.remove("Hello");
		System.out.println(collection);
		collection.clear();
		System.out.println(collection.isEmpty());
		System.out.println(collection);
		*/
		
		Collection<Person02> person02 = new ArrayList<Person02>();
		person02.add(new Person02("����", 12));
		person02.add(new Person02("����", 21));
		person02.add(new Person02("����", 15));
		
		Person02 per = new Person02("����", 12);
		person02.add(per);
		
		for (Person02 p: person02) {
			System.out.println(p);
			if(p.equals(new Person02("����", 20))){
				System.out.println("ok");
			}
			if(p.equals(new Person02("����", 20))){
				System.out.println("OK");
			}
		}
		
		System.out.println("=====================");
		person02.remove(new Person02("����", 12));	//Ϊɶ���ɾ������ �����������Ǿ����
		person02.remove(per);	
		for (Person02 p : person02) {
			System.out.println(p);
		}
		System.out.println("==========ok=========");
		person02.clear();
		for (Person02 p : person02) {
			System.out.println(p);
		}
		System.out.println(person02.isEmpty());
	}
}

/*
 * ��дhashCode��equals����
		1���������д������Object���equals�������ж��ڴ��ַ��Ϊfalse
			1�������Person����󣬲���������������ͬ�ͷ���true
		2���������д�����ø���hashCode����
			1�����equals������ͬ����ôhashCodeҲҪ��ͬ����Ҫ��дhashCode����
		3����дtoString����
			1������д��ֱ�ӵ���Object���toString��������ӡ�ö�����ڴ��ַ
 */

