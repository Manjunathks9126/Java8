package com.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestFor {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("manju","manoj","nishanth","abhi");
		
		list.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				
				return !t.equals("manoj");
			}
		
		}).forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
		
		System.out.println("------------------------");
		
		list.stream().filter(TestFor::checkSame).forEach(System.out::println);
		
	}

	
	public static boolean checkSame(String name) {
		return !"manoj".equals(name);
				
	}
}
