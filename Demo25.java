package com.github.jlran;

import java.util.Scanner;

/**
 * ������ʽ
 * @author jlran
 *
 */
/*
 *  ������ʽ����ʵһ�ֹ������Լ������Ӧ��,�����þ���������ַ������в�����
	���򣺾������ڲ����ַ����Ĺ���,������Щ����ʹ����һЩ�ַ���ʾ��*/

public class Demo25 {
	public static void main(String[] args) {
		/*
		 *  . 	�κ��ַ������н���������ƥ��Ҳ���ܲ�ƥ�䣩 
			\d 	���֣�[0-9] 
			\D 	�����֣� [^0-9] 
			\s 	�հ��ַ���[ \t\n\x0B\f\r] 
			\S 	�ǿհ��ַ���[^\s] 
			\w 	�����ַ���[a-zA-Z_0-9] 
			\W 	�ǵ����ַ���[^\w]
			System.out.println("a".matches("."));
					System.out.println("1".matches("\\d"));
					System.out.println("%".matches("\\D"));
					System.out.println("\r".matches("\\s"));
					System.out.println("^".matches("\\S"));
					System.out.println("a".matches("\\w"));
			
			Greedy ������
			X?	X��һ�λ�һ��Ҳû��
			X*	X����λ���
			X+	X��һ�λ���
			X{n}	X��ǡ��n��
			X{n,}	X������n��
			X{n,m}	X������n�Σ����ǲ�����m��
			System.out.println( "a".matches(".") );
			System.out.println( "a".matches("a") );
			System.out.println("a".matches("a?") );
			System.out.println( "aaa".matches("a*") );
			System.out.println( "".matches("a+") );
			System.out.println( "aaaaa".matches("a{5}") );
			System.out.println( "aaaaaaaaa".matches("a{5,8}") );
			System.out.println( "aaa".matches("a{5,}") );
			System.out.println( "aaaaab".matches("a{5,}") );
			
			��Χ��ʾ
			[abc]	a��b �� c�����ࣩ 
			[^abc]	�κ��ַ������� a��b �� c���񶨣� 
			[a-zA-Z]	a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ�� 
			[a-d[m-p]]	a �� d �� m �� p��[a-dm-p]�������� 
			[a-z&&[def]]	d��e �� f�������� 
			[a-z&&[^bc]]	a �� z������ b �� c��[ad-z]����ȥ�� 
			[a-z&&[^m-p]]	a �� z������ m �� p��[a-lq-z]����ȥ��
	
			System.out.println( "a".matches("[a]") );
			System.out.println( "aa".matches("[a]+") );
			System.out.println( "abc".matches("[abc]{3,}") );
			System.out.println( "abc".matches("[abc]+") );
			System.out.println( "dshfshfu1".matches("[^abc]+") );
			System.out.println( "abcdsaA".matches("[a-z]{5,}") );
			System.out.println( "abcdsaA12".matches("[a-zA-Z]{5,}") );
			System.out.println( "abcdsaA12".matches("[a-zA-Z0-9]{5,}") );
			System.out.println( "abdxyz".matches("[a-c[x-z]]+"));
			System.out.println( "bcbcbc".matches("[a-z&&[b-c]]{5,}"));
			System.out.println( "tretrt".matches("[a-z&&[^b-c]]{5,}"));
		 */
		
		Scanner in = new Scanner(System.in);
//		System.out.println("�������ֻ����룺");
//		while(true){
//			String str = in.nextLine();
//			Boolean tel = str.matches("[1][34578][0-9]{9}");
//			if(tel){
//				System.out.println(str + " �ֻ�����ȷ��");
//				break;
//			}else{
//				System.out.println("������ֻ�����������������룡");
//			}
//		}
		
		while(true){
			String str = in.nextLine();
			Boolean pw = str.matches("[a-zA-z]{1,}\\S*");
			if(pw){
				System.out.println(pw + "������ȷ��");
			}else{
				System.out.println("�������");
			}
		}
	}
}
