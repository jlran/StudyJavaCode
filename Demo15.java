package com.github.jlran;

import java.util.ArrayList;

/**
 * ArrayList
 * @author jlran
 *
 */
/*
 * ArrayList:实现原理：
	数组实现, 查找快, 增删慢
	数组为什么是查询快?
		因为数组的内存空间地址是连续的.
	ArrayList底层维护了一个Object[] 用于存储对象，默认数组的长度是10。
	可以通过 new ArrayList(20)显式的指定用于存储对象的数组的长度。
	当默认的或者指定的容量不够存储对象的时候，容量自动增长为原来的容量的1.5倍。
	由于ArrayList是数组实现, 在增和删的时候会牵扯到数组增容, 以及拷贝元素. 所以慢。数组是可以直接按索引查找, 所以查找时较快
	可以考虑,假设向数组的0角标未知添加元素,那么原来的角标位置的元素需要整体往后移,并且数组可能还要增容,一旦增容,就需要要将老数组
	的内容拷贝到新数组中.所以数组的增删的效率是很低的.
 */
class Person03{
	//这里没有对数据进行封装
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
		Person03 p1 = new Person03("张三", 12);
		Person03 p2 = new Person03("李四", 16);
		Person03 p3 = new Person03("王五", 18);
		Person03 p4 = new Person03("王五", 18);
		
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
