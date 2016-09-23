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
 *Set:ע�ض�һ�޶�������,����ϵ���Ͽ���֪��ĳ���Ƿ��ѽ������ڼ�����,����洢�ظ���Ԫ��
	���ڴ洢����(�����ȡ����˳��һ����ͬ)Ԫ�أ�ֵ�����ظ���
	����������
	���õ�����ͬһ�������������������ȵġ�������������õ���hashCode��������õ���ͬ�Ľ�����������������
	��û�и���Object��hashCode�����Ļ���hashCode�᷵��ÿ���������е���ţ�java�����ݶ�����ڴ��ַ����
	���Ĵ���ţ�������������ͬ�Ķ����hashCodeֵ�ǲ�������ȵġ�
		�����Ҫ��������ͬ��Person������Ϊ��ȵģ��ͱ��븲��Object��������hashCode������equals������
		��ΪObject  hashCode�������ص��Ǹö�����ڴ��ַ�����Ա�����дhashCode���������ܱ�֤������ͬ
		�Ķ��������ͬ��hashCode��ͬʱҲ��Ҫ������ͬ����Ƚ�equals�����᷵��true
	�ü�����û�����еķ�����ֱ�Ӽ̳���Collection��
	---| Itreable      �ӿ� ʵ�ָýӿڿ���ʹ����ǿforѭ��
					---| Collection		�������м��Ϲ��ԵĽӿ�
						---| List�ӿ�	    �������ظ�Ԫ�صļ���
	                            ---| ArrayList   
	                            ---|  LinkedList
						---| Set�ӿ�	    ���������ظ�Ԫ�صļ��� 
 */
public class Demo18 {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<String>();
		hs.add("����");
		hs.add("����");
		hs.add("����");
		
		System.out.println(hs);
		hs.add("����");
		System.out.println(hs);
		Iterator<String> it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		/*
		 * HashSet
			��ϣ��ߴ�ŵ��ǹ�ϣֵ��HashSet�洢Ԫ�ص�˳�򲢲��ǰ��մ���ʱ��˳�򣨺�List��Ȼ��ͬ�� �ǰ��չ�ϣֵ���������ȡ����Ҳ��
			���չ�ϣֵȡ�á�
			HashSet�������ظ�Ԫ�صĹ���.ʹ��hashcode��equals
			����Set�����ǲ��ܴ����ظ�Ԫ�صļ��ϡ���ôHashSetҲ�Ǿ߱���һ���Եġ�HashSet��μ���ظ���HashSet��ͨ��Ԫ��
			��hashcode������equals���������ж�Ԫ��ʦ���ظ���
			������ͼ�Ѷ������HashSetʱ��HashSet��ʹ�ö����hashCode���ж϶�������λ�á�ͬʱҲ���������Ѿ�����Ķ���
			��hashCode���бȽϣ����û����ȵ�hashCode��HashSet�ͻ�������û���ظ����֡�
			��һ�仰����������hashCodeֵ�ǲ�ͬ�ģ���ôHashSet����Ϊ�����ǲ�������ȵġ�
			��������Զ������ʱ����Ҫ��дhashCode����ȷ�����������ͬ��hashCodeֵ��
			���Ԫ��(����)��hashCodeֵ��ͬ,�ǲ��Ǿ��޷�����HashSet����? ��Ȼ����,�����ʹ��equals ���бȽ�.��� 
			equalsΪtrue ��ôHashSet��Ϊ�¼���Ķ����ظ���,���Լ���ʧ�ܡ����equals Ϊfalse��ôHashSet ��Ϊ��
			����Ķ���û���ظ�.��Ԫ�ؿ��Դ���.
			�ܽ᣺
			Ԫ�صĹ�ϣֵ��ͨ��Ԫ�ص�hashcode���� ����ȡ��, HashSet�����ж�����Ԫ�صĹ�ϣֵ�������ϣֵһ�������Ż�Ƚ�
			equals���� ��� equls���Ϊtrue ��HashSet����Ϊͬһ��Ԫ�ء����equals Ϊfalse�Ͳ���ͬһ��Ԫ�ء�
			��ϣֵ��ͬequalsΪfalse��Ԫ������ô�洢��,������ͬ���Ĺ�ϣֵ��˳�ӣ�������Ϊ��ϣֵ��ͬ��Ԫ�ط���һ����
			ϣͰ�У���Ҳ���ǹ�ϣһ���Ĵ�һ�С�
		 */
	}

}
