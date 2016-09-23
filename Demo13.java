package com.github.jlran;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合  -->Collection接口的共性方法
 * @author jlran
 *
 */
/*
 * 集合和数组中存放的都是对象的引用而非对象本身
 */
/*
	Collection	我们需要保存若干个对象的时候使用集合
	List
	
		如果我们需要保留存储顺序, 并且保留重复元素, 使用List.
		如果查询较多, 那么使用ArrayList
		如果存取较多, 那么使用LinkedList
		如果需要线程安全, 那么使用Vector
	Set
		如果我们不需要保留存储顺序, 并且需要去掉重复元素, 使用Set.
		如果我们需要将元素排序, 那么使用TreeSet
		如果我们不需要排序, 使用HashSet, HashSet比
		TreeSet效率高.
		如果我们需要保留存储顺序, 又要过滤重复元素, 那么使用LinkedHashSet
*/
/*Collection接口的共性方法
	 增加：
			1：add()	将指定对象存储到容器中
	                      add 方法的参数类型是Object 便于接收任意对象
			2：addAll() 将指定集合中的元素添加到调用该方法和集合中
	删除：
			3：remove() 将指定的对象从集合中删除
			4：removeAll() 将指定集合中的元素删除
	修改
			5：clear() 清空集合中的所有元素
	判断
			6：isEmpty() 判断集合是否为空
			7：contains() 判断集合何中是否包含指定对象
	            
			8：containsAll() 判断集合中是否包含指定集合
	                            使用equals()判断两个对象是否相等  
	获取:   9：int size()    返回集合容器的大小
	
	转成数组 10： toArray()   集合转换数组
 */

class Person02{
	//以下就没有对 数据进行封装
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
		person02.add(new Person02("张三", 12));
		person02.add(new Person02("李四", 21));
		person02.add(new Person02("张三", 15));
		
		Person02 per = new Person02("哈哈", 12);
		person02.add(per);
		
		for (Person02 p: person02) {
			System.out.println(p);
			if(p.equals(new Person02("李四", 20))){
				System.out.println("ok");
			}
			if(p.equals(new Person02("黄务", 20))){
				System.out.println("OK");
			}
		}
		
		System.out.println("=====================");
		person02.remove(new Person02("张三", 12));	//为啥这句删除不了 ？？而下面那句可以
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
 * 重写hashCode和equals方法
		1：如果不重写，调用Object类的equals方法，判断内存地址，为false
			1：如果是Person类对象，并且姓名和年龄相同就返回true
		2：如果不重写，调用父类hashCode方法
			1：如果equals方法相同，那么hashCode也要相同，需要重写hashCode方法
		3：重写toString方法
			1：不重写，直接调用Object类的toString方法，打印该对象的内存地址
 */

