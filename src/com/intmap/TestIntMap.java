package com.intmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestIntMap {
	
	public static class User{
		String name;
		int age=28;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public User(String name) {
			super();
			this.name = name;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> list=Arrays.asList("manju","nishanth","abhi","manoj");
			
			List<User> users=list.stream().filter(new Predicate<String>() {

				@Override
				public boolean test(String t) {
					// TODO Auto-generated method stub
					return !"manoj".equals(t);
				}
				
			}).map(new Function<String, User>() {

				@Override
				public User apply(String t) {
					// TODO Auto-generated method stub
					return new User(t);
				}
				
			}).collect(Collectors.toList());
			
			int age=users.stream().mapToInt(User::getAge).sum();
			
		users.stream().map(User::getAge).collect(Collectors.toSet()).forEach(System.out::println);
		
		Map<String,User> map=new HashMap<>();
		map.put("manju", new User("manju"));map.put("abhi", new User("abhi"));map.put("nishnath", new User("nishnath"));
		map.entrySet().stream().filter(TestIntMap::checkNull).map(u->u.getValue().getName()).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("age:"+age);
	}
	
	public static boolean checkNull(Entry<String, User> e) {
		return e.getValue()!=null;
	}

}
