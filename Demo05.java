package com.github.jlran;

import java.util.Calendar;
import java.util.Random;

/**
 * Date �� Math
 * @author jlran
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		/*
		 * Date ���װ����ϵͳ�ĵ�ǰʱ��.������Date�Ѿ���ʱ�ˣ�sun�Ƽ�ʹ��Calendar�ࡣ
		   Calendar: ������һ���������࣬��װ��������ʱ����ʱ����
		 */
		Calendar cal= Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1 ;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "��" + month + "��" + day+ "�� " + hour +":" + minute+":" + second );
		System.out.println(dayOfWeek+" 1 ������ 2��һ 3....");
		
		System.out.println("=================================");
		//Math�����װ�˺ܶ���ѧ�Ĺ���
		System.out.println(Math.abs(-112));
		System.out.println(Math.pow(2 , 2));
		System.out.println(Math.random());
		
		Random ran = new Random();
		for(int i = 0; i < 10; i++)
			System.out.print(ran.nextInt(5)+ " ");
	}
}
