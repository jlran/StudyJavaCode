package com.github.jlran;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet
 * @author jlran
 *
 */
/*
 * Itreable      �ӿ� ʵ�ָýӿڿ���ʹ����ǿforѭ��
		Collection		�������м��Ϲ��ԵĽӿ�
			List�ӿ�	    ���򣬿����ظ����нǱ�ļ���
                ArrayList   
                LinkedList
			Set�ӿ�	    ���򣬲������ظ��ļ���
                HashSet  �̲߳���ȫ����ȡ�ٶȿ졣�ײ�����hash��ʵ�ֵġ�
                TreeSet  ��-����(������)�����ݽṹ��Ĭ�϶�Ԫ�ؽ�����Ȼ����String��������ڱȽϵ�ʱ���������󷵻�ֵΪ0����ôԪ���ظ���
 */
public class Demo19 {
	public static void main(String[] args) {
		Set<String> ts = new TreeSet<String>();
		ts.add("aaaa");
		ts.add("cccc");
		ts.add("dddd");
		ts.add("bbbb");
		
		System.out.println(ts);
		Iterator<String> it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		/*
		 * ������㷨�Ĺ���: ��С�Ҵ�
			��ȻTreeSet������Ȼ����,��ôTreeSet�ض������������ġ�
			1:�ô����Ԫ���Զ���ȽϹ���
			2:��TreeSetָ���������
			��ʽһ��Ԫ������߱��Ƚ���
			Ԫ������߱��Ƚ��ԣ���ҪԪ��ʵ��Comparable�ӿڣ���дcompareTo������Ҳ������Ԫ������߱��Ƚ��ԣ����ַ�ʽ����Ԫ�ص���Ȼ����Ҳ����Ĭ������
			��ʽ���������߱��Ƚ���
			��Ԫ�������߱��Ƚ��ԣ���������߱��ıȽ��Բ�������Ҫ�ġ���ô��ʱ��������������߱�����Ҫ����һ����ʵ�ֽӿ�Comparator����дcompare�����������ýӿڵ�����ʵ��������Ϊ�������ݸ�TreeMap���ϵĹ��췽����
			ע�⣺��Comparable�ȽϷ�ʽ��Comparator�ȽϷ�ʽͬʱ����ʱ����Comparator�ıȽϷ�ʽΪ����
			ע�⣺����дcompareTo����compare����ʱ������Ҫ��ȷ�Ƚϵ���Ҫ�������ʱҪ�Ƚϴ�Ҫ����������������������һֱ����Ϊ��ͬ���ˣ������Ҫ���˰�������Ĵ�С���������������ͬ���ˣ���Ҫ��δ�������ֱ��return 0����Ϊ����������ͬ��������ͬ������ͬ�����ǲ�ͬ���ˣ�����ʱ����Ҫ���д�Ҫ�����жϣ���Ҫ�ж���������ֻ������������ͬʱ��ȵĲſ��Է���0.��
			ͨ��return 0���ж�Ψһ�ԡ�
			
			����:Ϊʲôʹ��TreeSet�����ַ���,�ַ���Ĭ������ǰ��������е�?��Ϊ�ַ���ʵ����һ���ӿ�,����Comparable �ӿ�.�ַ�����д�˸ýӿڵ�compareTo ����,����String����߱��˱Ƚ���.��ôͬ������,�ҵ��Զ���Ԫ��(����Person��,Book��)��Ҫ����TreeSet����,����Ҫʵ�ָýӿ�,Ҳ����Ҫ���Զ������߱��Ƚ���.
			����TreeSet�����е�Ԫ��Ҫ�߱��Ƚ���.
			�Ƚ���Ҫʵ��Comparable�ӿڣ���д�ýӿڵ�compareTo����
			TreeSet����Set���ϣ��ü��ϵ�Ԫ���ǲ����ظ��ģ�TreeSet��α�֤Ԫ�ص�Ψһ��
			ͨ��compareTo����compare�����е�����֤Ԫ�ص�Ψһ�ԡ�
			��ӵ�Ԫ�ر���Ҫʵ��Comparable�ӿڡ���compareTo()��������ֵΪ0ʱ��˵������������ȣ���ʱ�ö��󲻻���ӽ�����
			�Ƚ����ӿ�
				Comparable
			       		compareTo(Object o)     Ԫ������߱��Ƚ���
			    Comparator
			       		compare( Object o1, Object o2 )	����������Ƚ���
		 */
	}
}
