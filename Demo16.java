package com.github.jlran;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * @author jlran
 *
 */
/*
 * LinkedList:链表实现, 增删快, 查找慢
	由于LinkedList:在内存中的地址不连续,需要让上一个元素记住下一个元素.所以每个元素中保存的有下一个元素的位置.
	虽然也有角标,但是查找的时候,需要从头往下找,显然是没有数组查找快的.但是,链表在插入新元素的时候,只需要让前一个
	元素记住新元素,让新元素记住下一个元素就可以了.所以插入很快.
	由于链表实现, 增加时只要让前一个元素记住自己就可以, 删除时让前一个元素记住后一个元素, 后一个元素记住前一个元素.
	 这样的增删效率较高。但查询时需要一个一个的遍历, 所以效率较低。
 */
public class Demo16 {

	/*
	 * 1：方法介绍
            addFirst(E e) 
			addLast(E e) 
			getFirst() 
			getLast() 
			removeFirst() 
			removeLast() 
			如果集合中没有元素，获取或者删除元
			素抛：NoSuchElementException
		2：数据结构
			1：栈 （1.6）
				先进后出
				push() 
				pop()
			2：队列（双端队列1.5）
				先进先出
				offer()
				poll()
		3：返回逆序的迭代器对象      
			descendingIterator()   返回逆序的迭代器对象
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("张三");
		linkedList.add("李四");
		linkedList.add("王五");
		
		System.out.println(linkedList);
		
		{
			linkedList.addFirst("插首");
			linkedList.addLast("插尾");
			System.out.println(linkedList);
			System.out.println(linkedList.removeFirst());
			System.out.println(linkedList.removeLast());
			System.out.println(linkedList);
		}
		
		{
			Iterator<String> it = linkedList.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		}
		System.out.println("===============================");
		{
			Iterator<String> deit = linkedList.descendingIterator();
			while(deit.hasNext()){
				System.out.println(deit.next());
			}
		}
	}
}

/*
 * ArrayList 和 LinkedList的存储查找的优缺点：
	1、ArrayList 是采用动态数组来存储元素的，它允许直接用下标号来直接查找对应的元素。但是，但是插
	入元素要涉及数组元素移动及内存的操作。总结：查找速度快，插入操作慢。
	2、LinkedList 是采用双向链表实现存储，按序号索引数据需要进行前向或后向遍历，但是插入数据时只需
	要记录本项的前后项即可，所以插入速度较快
*/
