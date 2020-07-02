package com.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			List<String> list=Arrays.asList("manju","shiv","rajkumar","punith","raghu");
			list.stream().filter(new Predicate<String>() {
				public boolean test(String t) {
					return !t.equals("manju");
				}
			}).forEach(new Consumer<String>() {
				public void accept(String s) {
					System.out.println(s);
				}
			});
			
			System.out.println("----------------------------");
			list.stream().filter(t->!t.equals("manju")).forEach(System.out::println);
	}

}
