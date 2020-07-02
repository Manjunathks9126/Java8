package com.stream.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.intmap.TestIntMap.User;

public class MapStream {
	
	public static class User{
		String name;
		Integer age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public User(String name) {
			super();
			this.name = name;
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,User> map=new HashMap<>();
		map.put("manju", new User("manju"));map.put("abhi", new User("abhi"));map.put("nishnath", new User("nishnath"));
		List<String> names=map.entrySet().stream().filter(m->m.getValue()!=null).map(m->m.getValue().getName()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}

}
