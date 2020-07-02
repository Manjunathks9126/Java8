package com.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {
	
	public static class User{
		String name;
		int age=28;
		List<String> phns=new ArrayList<String>();
		public List<String> getPhns() {
			return phns;
		}
		public void setPhns(List<String> phns) {
			this.phns = phns;
		}
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
		public User(String name, int age, List<String> phns) {
			super();
			this.name = name;
			this.age = age;
			this.phns = phns;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ph1=Arrays.asList("9845335529","9845667789","7795793511");
		List<String> ph2=Arrays.asList("9845123456","9845789012","7795793511");
		List<String> ph3=Arrays.asList("9845668899");
		
		User u1=new User("manju", 28, ph1);
		User u2=new User("abhi", 27, ph2);
		User u3=new User("nishanth", 26, ph3);
		
		List<User> users=new LinkedList<>();
		users.add(u1);users.add(u2);users.add(u3);
		
		users.stream().flatMap(u->u.getPhns().stream()).filter(p->p.startsWith("9845")).collect(Collectors.toSet()).forEach(System.out::println);
		
		String phnumber=users.stream().flatMap(u->u.getPhns().stream()).filter(ph->ph.equals("9845335529")).findAny().get();
		System.out.println("number found:"+phnumber);
	}

}
