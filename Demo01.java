package com.github.jlran;

/**
 * Object对象
 * @author jlran
 */
//自定义一个Person类
class Person{
	//封装
	private String name;
	private int age;
	private int id;
	
	//无参
	public Person(){
	}
	//有参
	public Person(String name, int age, int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	//实现get和set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	//重写toString方法
	//开发者要对自定义的类重写toString()
	@Override
	public String toString() {
		return "名字:" + this.name + " 年龄:" + this.age;
	}
	/**
	 * hashCode() 返回该对象的哈希码值： 采用操作系统底层实现的哈希算法。 同一个对象的哈希码值是唯一的。
	 *java规定如果两个对象equals返回true，那么这两个对象的hashCode码必须一致。
	 */
	@Override
	public int hashCode() {
		return (this.name.hashCode() + this.id);
	}
	/**
	 * 开发者要对自定义的类重写equals()，使得比较两个对象的时候比较对象的属性是否相等，而不是内存地址。
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person){
			Person p = (Person)obj;
			if(this.id == p.id){
				return true;
			}
		}
		return false;
	}
}

//测试 所以没有仔细的写
class Pig{
	String name;
	int age;
	int id;
	public Pig(String name, int age, int id){
		this.id = id; this.age = age; this.name = name;
	}
}

public class Demo01 {

	public static void main(String[] args) {
		Person p1 = new Person("小明", 12, 1111);
		Person p2 = new Person("小辉", 21, 1111);
		Person p3 = new Person("小辉", 21, 2222);
		
		System.out.println(p1);
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		//这里的false 你知道是那句代码坚守着这么光荣的使命？
		Pig pig = new Pig("小辉", 21, 2222);
		System.out.println(p3.equals(pig));
	}

}
