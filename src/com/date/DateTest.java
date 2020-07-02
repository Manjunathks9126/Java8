package com.date;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date utilDate=new Date();
		System.out.println(utilDate);
		System.out.println(utilDate.getDate());
		System.out.println();
		
		java.sql.Date sqlDate=new java.sql.Date(utilDate.getDate());
		System.out.println(sqlDate);

	}

}
