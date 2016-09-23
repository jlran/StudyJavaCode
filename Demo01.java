package com.github.jlran;

/**
 * Object����
 * @author jlran
 */
//�Զ���һ��Person��
class Person{
	//��װ
	private String name;
	private int age;
	private int id;
	
	//�޲�
	public Person(){
	}
	//�в�
	public Person(String name, int age, int id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	//ʵ��get��set����
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
	
	//��дtoString����
	//������Ҫ���Զ��������дtoString()
	@Override
	public String toString() {
		return "����:" + this.name + " ����:" + this.age;
	}
	/**
	 * hashCode() ���ظö���Ĺ�ϣ��ֵ�� ���ò���ϵͳ�ײ�ʵ�ֵĹ�ϣ�㷨�� ͬһ������Ĺ�ϣ��ֵ��Ψһ�ġ�
	 *java�涨�����������equals����true����ô�����������hashCode�����һ�¡�
	 */
	@Override
	public int hashCode() {
		return (this.name.hashCode() + this.id);
	}
	/**
	 * ������Ҫ���Զ��������дequals()��ʹ�ñȽ����������ʱ��Ƚ϶���������Ƿ���ȣ��������ڴ��ַ��
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

//���� ����û����ϸ��д
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
		Person p1 = new Person("С��", 12, 1111);
		Person p2 = new Person("С��", 21, 1111);
		Person p3 = new Person("С��", 21, 2222);
		
		System.out.println(p1);
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		//�����false ��֪�����Ǿ�����������ô���ٵ�ʹ����
		Pig pig = new Pig("С��", 21, 2222);
		System.out.println(p3.equals(pig));
	}

}
