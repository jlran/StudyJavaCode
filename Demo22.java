package com.github.jlran;
/**
 * Collections与Arrays
 * @author jlran
 *
 */
public class Demo22 {
	public static void main(String[] args) {
		/*
		 * Collections：常见方法：
			1，对list进行二分查找：
				前提该集合一定要有序。
				int binarySearch(list,key);
				//必须根据元素自然顺序对列表进行升级排序
				//要求list 集合中的元素都是Comparable 的子类。
				int binarySearch(list,key,Comparator);
			2，对list集合进行排序。
				sort(list); 
				//对list进行排序,其实使用的事list容器中的对象的compareTo方法
				sort(list,comaprator);
				//按照指定比较器进行排序
			3，对集合取最大值或者最小值。
				max(Collection)
				max(Collection,comparator)
				min(Collection)
				min(Collection,comparator)
			4，对list集合进行反转。
				reverse(list);
			5，对比较方式进行强行逆转。
				Comparator reverseOrder();
				Comparator reverseOrder(Comparator);
			6，对list集合中的元素进行位置的置换。
				swap(list,x,y);
			7，对list集合进行元素的替换。如果被替换的元素不存在，那么原集合不变。
				replaceAll(list,old,new);
			8，可以将不同步的集合变成同步的集合。
				Set synchronizedSet(Set<T> s)
				Map synchronizedMap(Map<K,V> m)
				List synchronizedList(List<T> list)
			9. 如果想要将集合变数组：
				可以使用Collection 中的toArray 方法。注意：是Collection不是Collections工具类
				传入指定的类型数组即可，该数组的长度最好为集合的size。
				
			Arrays:用于对数组操作的工具类
			1，二分查找,数组需要有序
				binarySearch(int[])
				binarySearch(double[])
				
			2，数组排序
				sort(int[])
				sort(char[])……
			2，将数组变成字符串。
			 	toString(int[])
			3，复制数组。
			 	copyOf();
			4，复制部分数组。
				copyOfRange():
			5，比较两个数组是否相同。
				equals(int[],int[]);
			6，将数组变成集合。
				List asList(T[]);
			这样可以通过集合的操作来操作数组中元素，
			但是不可以使用增删方法，add，remove。因为数组长度是固定的，会出现
			UnsupportOperationExcetion。
			可以使用的方法：contains，indexOf。。。
			如果数组中存入的基本数据类型，那么asList会将数组实体作为集合中的元素。
			如果数组中的存入的引用数据类型，那么asList会将数组中的元素作为集合中
			的元素。
		 */
	}
}
