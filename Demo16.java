package com.github.jlran;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * @author jlran
 *
 */
/*
 * LinkedList:����ʵ��, ��ɾ��, ������
	����LinkedList:���ڴ��еĵ�ַ������,��Ҫ����һ��Ԫ�ؼ�ס��һ��Ԫ��.����ÿ��Ԫ���б��������һ��Ԫ�ص�λ��.
	��ȻҲ�нǱ�,���ǲ��ҵ�ʱ��,��Ҫ��ͷ������,��Ȼ��û��������ҿ��.����,�����ڲ�����Ԫ�ص�ʱ��,ֻ��Ҫ��ǰһ��
	Ԫ�ؼ�ס��Ԫ��,����Ԫ�ؼ�ס��һ��Ԫ�ؾͿ�����.���Բ���ܿ�.
	��������ʵ��, ����ʱֻҪ��ǰһ��Ԫ�ؼ�ס�Լ��Ϳ���, ɾ��ʱ��ǰһ��Ԫ�ؼ�ס��һ��Ԫ��, ��һ��Ԫ�ؼ�סǰһ��Ԫ��.
	 ��������ɾЧ�ʽϸߡ�����ѯʱ��Ҫһ��һ���ı���, ����Ч�ʽϵ͡�
 */
public class Demo16 {

	/*
	 * 1����������
            addFirst(E e) 
			addLast(E e) 
			getFirst() 
			getLast() 
			removeFirst() 
			removeLast() 
			���������û��Ԫ�أ���ȡ����ɾ��Ԫ
			���ף�NoSuchElementException
		2�����ݽṹ
			1��ջ ��1.6��
				�Ƚ����
				push() 
				pop()
			2�����У�˫�˶���1.5��
				�Ƚ��ȳ�
				offer()
				poll()
		3����������ĵ���������      
			descendingIterator()   ��������ĵ���������
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("����");
		linkedList.add("����");
		linkedList.add("����");
		
		System.out.println(linkedList);
		
		{
			linkedList.addFirst("����");
			linkedList.addLast("��β");
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
 * ArrayList �� LinkedList�Ĵ洢���ҵ���ȱ�㣺
	1��ArrayList �ǲ��ö�̬�������洢Ԫ�صģ�������ֱ�����±����ֱ�Ӳ��Ҷ�Ӧ��Ԫ�ء����ǣ����ǲ�
	��Ԫ��Ҫ�漰����Ԫ���ƶ����ڴ�Ĳ������ܽ᣺�����ٶȿ죬�����������
	2��LinkedList �ǲ���˫������ʵ�ִ洢�����������������Ҫ����ǰ��������������ǲ�������ʱֻ��
	Ҫ��¼�����ǰ����ɣ����Բ����ٶȽϿ�
*/
