package com.github.jlran;

/**
 * StringBuffer �� StringBuilder
 * @author jlran
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		/**
		 * StringBuffer : ����String�ǲ��ɱ�ģ����Ե���String�����ģ���Ƶ���ı��ַ��������Ӧ���У�
		        ��Ҫʹ�ÿɱ���ַ�����������
			�ص㣺
			1.Ĭ�ϻ�������������16 ��initial capacity of 16 characters�� 
			2.StringBuffer  �� �̰߳�ȫ�����еĻ�����������������ͬ���ġ�Ч�ʺܵ�
		 */
		StringBuffer buffer = new StringBuffer("jlran");
		buffer.append(" Hello ");
		buffer.append(1245);
		System.out.println(buffer);
		
		/*
		 *  toString() ��������������ַ���
			indexOf(String str) ���ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е�������
			substring(int start) �ӿ�ʼ��λ�ÿ�ʼ��ȡ�ַ���
		 */
		System.out.println(buffer.toString());
		System.out.println(buffer.substring(2));
		/*
		 *
			replace(int start , int end, String str)  
			setCharAt(int index ,char ch)  ָ������λ���滻һ���ַ�
		 */
		System.out.println(buffer.replace(0, 5, "hahah"));
		/*
		 * delete(start, end)
		 * deleteCharAt(index)
		 */
		System.out.println(buffer.delete(0, 5));
		System.out.println(buffer.deleteCharAt(5));
		/*
		 * reverse() 
		 */
		System.out.println(buffer.reverse());
		
		/**
		 *  StringBuilder
			StringBuilder ��JDK1.5֮������ģ��̲߳���ȫ������Ч��Ҫ�ߡ��÷���StringBuffer���ơ�
		 */
		System.out.println("=============��������÷�����=================");
		StringBuilder builder = new StringBuilder("jlran");
		builder.append(12);
		System.out.println(builder);
	}
}
