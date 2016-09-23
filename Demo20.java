package com.github.jlran;

import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author jlran
 *
 */

class Person04 implements Comparable<Person04>{
	String name;
	int age;
	public Person04(String name, int age){
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
		if(obj instanceof Person04){
			Person04 p = (Person04)obj;
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

	@Override
	public int compareTo(Person04 o) {
		if(this.age > o.age){
			return 1;
		}
		if(this.age < o.age){
			return -1;
		}
		return this.name.compareTo(o.name);	//字符
	}
}
public class Demo20 {
	public static void main(String[] args) {
		Person04 p1 = new Person04("张三", 12);
		Person04 p2 = new Person04("哈哈", 20);
		Person04 p3 = new Person04("张三", 15);
		Person04 p4 = new Person04("化为", 12);
		
		Set<Person04> ts = new TreeSet<Person04>();
		ts.add(p4);
		ts.add(p3);
		ts.add(p2);
		ts.add(p1);
		
		System.out.println(ts);
	}

}
