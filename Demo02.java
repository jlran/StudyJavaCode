package com.github.jlran;

/**
 * String��
 * @author jlran
 *
 */
public class Demo02 {
	
	public static void main(String[] args) {
		//�ַ�������ıȽ�
		/**
		 * String Str = ��jlran����������ȼ���ַ����������Ƿ��������jlran������ַ�������
		 * ���û�д��ڣ���ô�ͻ����ַ����������д�������ַ��������������ֱ�ӷ��ظ��ַ������ڴ��ֵַ��
		 * String str3 = new String(��jlran��) �����ᴴ����������,���Ȼ��ȼ���ַ����������д治
		 * ����jlran����ַ���������������ھͻᴴ����������ھͷ����ڴ��ֵַ�������˳���֮��
		 * new String������ͻ��ڶ��ڴ��п���һ���ַ��������ܹ���������
		 * ��Դ�����ǲ��ͱʼ�
		 */
		String str1 = "jlran";
		String str2 = "jlran";
		String str3 = new String("jlran");
		String str4 = new String("jlran");
		System.out.println(str1 == str2); //true
		System.out.println(str1 == str3); //false
		System.out.println(str3 == str4); //false
		
		/**
		 *  int length()  
			char charAt(int index) 
			int indexOf(String str) 
			int lastIndexOf(int ch) 
		 */
		
		String str = new String("Hello World");
		System.out.println("��ȡ�ַ����ĳ���  " + str.length());
		System.out.println("��ȡ�ض�λ�õ��ַ�  " + str.charAt(1));
		System.out.println("��ȡ�ض��ַ���λ�� " + str.indexOf("ll"));
		System.out.println("��ȡ�ض��ַ���λ�� " + str.indexOf("lo"));
		System.out.println("��ȡ���һ���ַ���λ�� " + str.lastIndexOf("o"));
		
		/**
		 *  boolean endsWith(String str) 
			boolean isEmpty()
			boolean contains(CharSequences) 
			boolean equals(Object anObject) 
			boolean equalsIgnoreCase(String anotherString)
		 */	
		str = "";
		System.out.println("�Ƿ񳤶�Ϊ0[����Ϊ0����true] " + str.isEmpty());
		str = "Hello World";
		System.out.println("�Ƿ���ָ���ַ����� " + str.endsWith("ld"));
		System.out.println("�Ƿ����ָ������ Ӧ�ã����� " + str.contains("o"));
		//Ϊʲô��ôд��
		System.out.println("�Ƿ���� " + "123".equals("123"));
		System.out.println(" ���Դ�Сд�Ƿ���� " + "Abc".equalsIgnoreCase("aBc"));
		
		/**
		 * String(char[] value) ���ַ�����ת��Ϊ�ַ���
			String(char[] value, int offset, int count)
			Static String valueOf(char[] data)
			static String valueOf(char[] data, int offset, int count)
			char[] toCharArray()  ���ַ���ת��Ϊ�ַ�����
		 */
//		
//		String replace(char oldChar, char newChar) �滻
//		String[] split(String regex) �и�
//		String substring(int beginIndex) 
//		String substring(int beginIndex, int endIndex)��ȡ�ִ�
//		String toUpperCase() ת��д
//		String toLowerCase() תСд
//		String trim() ȥ���ո�
		
		str ="   Hello World   ";
		System.out.println("ȥ���ո�ǰ��" + str);
		System.out.println("ȥ���ո��" + str.trim());
		System.out.println("ȥ���ո��ת��Сд��" +str.trim().toLowerCase());
		System.out.println("ȥ���ո��ת����д��" +str.trim().toUpperCase());
	}
}	
