package com.github.jlran;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ������
 * @author jlran
 *
 */
/*
 * ������Ҫ���ڱ������϶��󣬸��������˱������ϵĳ�������
	java.lang. Itreable  
			 Itreable      �ӿ� ʵ�ָýӿڿ���ʹ����ǿforѭ��
				Collection		�������м��Ϲ��ԵĽӿ�
					 List�ӿ�	    �������ظ�Ԫ�صļ���
					 Set�ӿ�	    ���������ظ�Ԫ�صļ���
 */
public class Demo17 {
	/*
	 * Itreator	�ýӿ��Ǽ��ϵĵ������ӿ��࣬�����˳����ĵ�������
		1��boolean hasNext()�жϼ������Ƿ���Ԫ�أ������Ԫ�ؿ��Ե������ͷ���true
		2�� E next() ���ص�������һ��Ԫ�أ�ע�⣺ ���û����һ��Ԫ��ʱ������nextԪ�ػ��׳�NoSuchElementException
		3�� void remove()�ӵ�����ָ��ļ������Ƴ����������ص����һ��Ԫ�أ���ѡ������
	 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("����");
		arrayList.add("����");
		Iterator<String> it = arrayList.iterator();
		
		for(  ; it.hasNext() ; ){
			String str = (String)it.next();
			System.out.println(str);
		}
		/*
		 * ��Ҫȡ������Ԫ��ʱ������ͨ��ѭ����java ����ʹ��for ѭ������Ϊ���Զ��ڴ����һ���Ż���
		 */
		
//		while(it.hasNext()){
//			System.out.println(it.next());
//			it.remove();
//		}
		System.out.println(arrayList);
		/*
		 * ϸ��һ��
			�����������ָ���Ѿ�ָ���˼��ϵ�ĩβ����ô����ٵ���next()�᷵��NoSuchElementException�쳣
		       ϸ�ڶ���
 			�������remove֮ǰû�е���next�ǲ��Ϸ��ģ����׳�IllegalStateException
 			
 		ע���ڶԼ��Ͻ��е��������У���������ֵ���������Ķ�Ԫ�صĲ�������Ϊ�����������ȫ������java���׳��쳣��
 		���޸��쳣��ConcurrentModificationException������ͨ������ֻ֧���ڵ��������е�ɾ��������
		ע�⣺ConcurrentModificationException: ��һ��������ѭ���м�ʹ�����ñ�������������ʹ�õ�������
		�����϶��� ���׳����쳣��
		
		�����List���ϣ���Ҫ�ڵ����в���Ԫ�ؿ���ʹ��List���ϵ����е�����ListIterator���õ�����֧���ڵ�
		�������У����Ԫ�غ��޸�Ԫ�ء�
		 */
	}
}
