package com.github.jlran;

import java.util.ArrayList;

/**
 * ArrayList
 * @author jlran
 *
 */
/*
 * ArrayList:ʵ��ԭ��
	����ʵ��, ���ҿ�, ��ɾ��
	����Ϊʲô�ǲ�ѯ��?
		��Ϊ������ڴ�ռ��ַ��������.
	ArrayList�ײ�ά����һ��Object[] ���ڴ洢����Ĭ������ĳ�����10��
	����ͨ�� new ArrayList(20)��ʽ��ָ�����ڴ洢���������ĳ��ȡ�
	��Ĭ�ϵĻ���ָ�������������洢�����ʱ�������Զ�����Ϊԭ����������1.5����
	����ArrayList������ʵ��, ������ɾ��ʱ���ǣ������������, �Լ�����Ԫ��. �������������ǿ���ֱ�Ӱ���������, ���Բ���ʱ�Ͽ�
	���Կ���,�����������0�Ǳ�δ֪���Ԫ��,��ôԭ���ĽǱ�λ�õ�Ԫ����Ҫ����������,����������ܻ�Ҫ����,һ������,����ҪҪ��������
	�����ݿ�������������.�����������ɾ��Ч���Ǻܵ͵�.
 */
class Person03{
	//����û�ж����ݽ��з�װ
	String name;
	int age;
	public Person03(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode()+this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person03){
			Person03 p = (Person03)obj;
			if(this.name.equals(p.name) && this.age == p.age){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.name + "->" + this.age;
	}
}
public class Demo15 {
	public static void main(String[] args) {
		Person03 p1 = new Person03("����", 12);
		Person03 p2 = new Person03("����", 16);
		Person03 p3 = new Person03("����", 18);
		Person03 p4 = new Person03("����", 18);
		
		ArrayList<Person03> arrayList = new ArrayList<Person03>();
		arrayList.add(p1);
		arrayList.add(p2);
		arrayList.add(p3);
		arrayList.add(p4);
		
		System.out.println(arrayList);
		
		ArrayList<Person03> list = new ArrayList<Person03>();
		for(int i = 0; i < arrayList.size(); i++){
			if(! (list.contains(arrayList.get(i)))){
				list.add(arrayList.get(i));
			}
		}
		System.out.println(list);

	}

}
