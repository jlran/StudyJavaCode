package com.github.jlran;

import java.util.Calendar;
import java.util.Random;

/**
 * Date 和 Math
 * @author jlran
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		/*
		 * Date 类封装的是系统的当前时间.。但是Date已经过时了，sun推荐使用Calendar类。
		   Calendar: 该类是一个日历的类，封装了年月日时分秒时区。
		 */
		Calendar cal= Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1 ;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "年" + month + "月" + day+ "日 " + hour +":" + minute+":" + second );
		System.out.println(dayOfWeek+" 1 是周日 2周一 3....");
		
		System.out.println("=================================");
		//Math：类封装了很多数学的功能
		System.out.println(Math.abs(-112));
		System.out.println(Math.pow(2 , 2));
		System.out.println(Math.random());
		
		Random ran = new Random();
		for(int i = 0; i < 10; i++)
			System.out.print(ran.nextInt(5)+ " ");
	}
}
