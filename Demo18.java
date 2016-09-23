package com.github.jlran;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set
 * @author jlran
 *
 */
/*
 *Set:注重独一无二的性质,该体系集合可以知道某物是否已近存在于集合中,不会存储重复的元素
	用于存储无序(存入和取出的顺序不一定相同)元素，值不能重复。
	对象的相等性
	引用到堆上同一个对象的两个引用是相等的。如果对两个引用调用hashCode方法，会得到相同的结果，如果对象所属的
	类没有覆盖Object的hashCode方法的话，hashCode会返回每个对象特有的序号（java是依据对象的内存地址计算
	出的此序号），所以两个不同的对象的hashCode值是不可能相等的。
		如果想要让两个不同的Person对象视为相等的，就必须覆盖Object继下来的hashCode方法和equals方法，
		因为Object  hashCode方法返回的是该对象的内存地址，所以必须重写hashCode方法，才能保证两个不同
		的对象具有相同的hashCode，同时也需要两个不同对象比较equals方法会返回true
	该集合中没有特有的方法，直接继承自Collection。
	---| Itreable      接口 实现该接口可以使用增强for循环
					---| Collection		描述所有集合共性的接口
						---| List接口	    可以有重复元素的集合
	                            ---| ArrayList   
	                            ---|  LinkedList
						---| Set接口	    不可以有重复元素的集合 
 */
public class Demo18 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("张三");
		hs.add("李四");
		hs.add("王五");
		
		System.out.println(hs);
		hs.add("王五");
		System.out.println(hs);
		Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		/*
		 * HashSet
			哈希表边存放的是哈希值。HashSet存储元素的顺序并不是按照存入时的顺序（和List显然不同） 是按照哈希值来存的所以取数据也是
			按照哈希值取得。
			HashSet不存入重复元素的规则.使用hashcode和equals
			由于Set集合是不能存入重复元素的集合。那么HashSet也是具备这一特性的。HashSet如何检查重复？HashSet会通过元素
			的hashcode（）和equals方法进行判断元素师否重复。
			当你试图把对象加入HashSet时，HashSet会使用对象的hashCode来判断对象加入的位置。同时也会与其他已经加入的对象
			的hashCode进行比较，如果没有相等的hashCode，HashSet就会假设对象没有重复出现。
			简单一句话，如果对象的hashCode值是不同的，那么HashSet会认为对象是不可能相等的。
			因此我们自定义类的时候需要重写hashCode，来确保对象具有相同的hashCode值。
			如果元素(对象)的hashCode值相同,是不是就无法存入HashSet中了? 当然不是,会继续使用equals 进行比较.如果 
			equals为true 那么HashSet认为新加入的对象重复了,所以加入失败。如果equals 为false那么HashSet 认为新
			加入的对象没有重复.新元素可以存入.
			总结：
			元素的哈希值是通过元素的hashcode方法 来获取的, HashSet首先判断两个元素的哈希值，如果哈希值一样，接着会比较
			equals方法 如果 equls结果为true ，HashSet就视为同一个元素。如果equals 为false就不是同一个元素。
			哈希值相同equals为false的元素是怎么存储呢,就是在同样的哈希值下顺延（可以认为哈希值相同的元素放在一个哈
			希桶中）。也就是哈希一样的存一列。
		 */
	}

}
