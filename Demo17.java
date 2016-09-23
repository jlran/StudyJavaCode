package com.github.jlran;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 迭代器
 * @author jlran
 *
 */
/*
 * 该类主要用于遍历集合对象，该类描述了遍历集合的常见方法
	java.lang. Itreable  
			 Itreable      接口 实现该接口可以使用增强for循环
				Collection		描述所有集合共性的接口
					 List接口	    可以有重复元素的集合
					 Set接口	    不可以有重复元素的集合
 */
public class Demo17 {
	/*
	 * Itreator	该接口是集合的迭代器接口类，定义了常见的迭代方法
		1：boolean hasNext()判断集合中是否有元素，如果有元素可以迭代，就返回true
		2： E next() 返回迭代的下一个元素，注意： 如果没有下一个元素时，调用next元素会抛出NoSuchElementException
		3： void remove()从迭代器指向的集合中移除迭代器返回的最后一个元素（可选操作）
	 */
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("张三");
		arrayList.add("张四");
		arrayList.add("张无");
		arrayList.add("张六");
		Iterator<String> it = arrayList.iterator();
		
		for(  ; it.hasNext() ; ){
			String str = (String)it.next();
			System.out.println(str);
		}
		/*
		 * 需要取出所有元素时，可以通过循环，java 建议使用for 循环。因为可以对内存进行一下优化。
		 */
		
//		while(it.hasNext()){
//			System.out.println(it.next());
//			it.remove();
//		}
		System.out.println(arrayList);
		/*
		 * 细节一：
			如果迭代器的指针已经指向了集合的末尾，那么如果再调用next()会返回NoSuchElementException异常
		       细节二：
 			如果调用remove之前没有调用next是不合法的，会抛出IllegalStateException
 			
 		注意在对集合进行迭代过程中，不允许出现迭代器以外的对元素的操作，因为这样会产生安全隐患，java会抛出异常并
 		发修改异常（ConcurrentModificationException），普通迭代器只支持在迭代过程中的删除动作。
		注意：ConcurrentModificationException: 当一个集合在循环中即使用引用变量操作集合又使用迭代器操
		作集合对象， 会抛出该异常。
		
		如果是List集合，想要在迭代中操作元素可以使用List集合的特有迭代器ListIterator，该迭代器支持在迭
		代过程中，添加元素和修改元素。
		 */
	}
}
