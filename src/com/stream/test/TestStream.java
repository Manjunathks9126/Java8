package com.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestStream {
	
	public static int doSum(List<Integer> list) {
		int sum=0;
		for(Integer i:list) {
			if(i>10)
			sum=sum+i;
		}
		return sum;
	}
	
	public static int streamSum(List<Integer> list) {
		return list.stream().filter(i->i>10).mapToInt(i->i).sum();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(8,19,4,5,10,20,30);
		//System.out.println(doSum(list));
		System.out.println(streamSum(list));
		
		List<String> names=Arrays.asList("manju","nishanth","manoj","pavan");
		names.stream().filter(new Predicate<String>() {
			public boolean test(String t) {
				return !t.equals("pavan");
			}
		}).forEach(new Consumer<String>() {
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		names.stream().filter(new TestStream()::condition).forEach(System.out::println);
	}
	
	public  boolean condition(String t) {
		return !t.equals("pavan");
	}

}
