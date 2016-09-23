package com.github.jlran;

import java.util.Scanner;

/**
 * 正则表达式
 * @author jlran
 *
 */
/*
 *  正则表达式：其实一种规则，有自己特殊的应用,其作用就是针对于字符串进行操作。
	正则：就是用于操作字符串的规则,其中这些规则使用了一些字符表示。*/

public class Demo25 {
	public static void main(String[] args) {
		/*
		 *  . 	任何字符（与行结束符可能匹配也可能不匹配） 
			\d 	数字：[0-9] 
			\D 	非数字： [^0-9] 
			\s 	空白字符：[ \t\n\x0B\f\r] 
			\S 	非空白字符：[^\s] 
			\w 	单词字符：[a-zA-Z_0-9] 
			\W 	非单词字符：[^\w]
			System.out.println("a".matches("."));
					System.out.println("1".matches("\\d"));
					System.out.println("%".matches("\\D"));
					System.out.println("\r".matches("\\s"));
					System.out.println("^".matches("\\S"));
					System.out.println("a".matches("\\w"));
			
			Greedy 数量词
			X?	X，一次或一次也没有
			X*	X，零次或多次
			X+	X，一次或多次
			X{n}	X，恰好n次
			X{n,}	X，至少n次
			X{n,m}	X，至少n次，但是不超过m次
			System.out.println( "a".matches(".") );
			System.out.println( "a".matches("a") );
			System.out.println("a".matches("a?") );
			System.out.println( "aaa".matches("a*") );
			System.out.println( "".matches("a+") );
			System.out.println( "aaaaa".matches("a{5}") );
			System.out.println( "aaaaaaaaa".matches("a{5,8}") );
			System.out.println( "aaa".matches("a{5,}") );
			System.out.println( "aaaaab".matches("a{5,}") );
			
			范围表示
			[abc]	a、b 或 c（简单类） 
			[^abc]	任何字符，除了 a、b 或 c（否定） 
			[a-zA-Z]	a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
			[a-d[m-p]]	a 到 d 或 m 到 p：[a-dm-p]（并集） 
			[a-z&&[def]]	d、e 或 f（交集） 
			[a-z&&[^bc]]	a 到 z，除了 b 和 c：[ad-z]（减去） 
			[a-z&&[^m-p]]	a 到 z，而非 m 到 p：[a-lq-z]（减去）
	
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
//		System.out.println("请输入手机号码：");
//		while(true){
//			String str = in.nextLine();
//			Boolean tel = str.matches("[1][34578][0-9]{9}");
//			if(tel){
//				System.out.println(str + " 手机号正确！");
//				break;
//			}else{
//				System.out.println("输入的手机号码错误，请重新输入！");
//			}
//		}
		
		while(true){
			String str = in.nextLine();
			Boolean pw = str.matches("[a-zA-z]{1,}\\S*");
			if(pw){
				System.out.println(pw + "密码正确！");
			}else{
				System.out.println("密码错误！");
			}
		}
	}
}
