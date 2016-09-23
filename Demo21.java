package com.github.jlran;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author jlran
 *
 */

class Person05{
	String name;
	int age;
	public Person05(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person05){
			Person05 p = (Person05)obj;
			if(this.name.equals(p.name) && this.age == p.age){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode() + this.age;
	}
}

class MyComparator implements Comparator<Person05>{

	@Override
	public int compare(Person05 o1, Person05 o2) {
		if(o1.age > o2.age){
			return 1;
		}
		if(o1.age < o2.age){
			return -1;
		}
		return o1.name.compareTo(o2.name);
	}
	
}
public class Demo21 {
	public static void main(String[] args) {
		Set<Person05> ts = new TreeSet<Person05>(new MyComparator());
		Person05 p1 = new Person05("张三", 12);
		Person05 p2 = new Person05("哈哈", 20);
		Person05 p3 = new Person05("张三", 15);
		Person05 p4 = new Person05("化为", 12);
		
		ts.add(p4);
		ts.add(p3);
		ts.add(p2);
		ts.add(p1);
		
		System.out.println(ts);
	}
}
