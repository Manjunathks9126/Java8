package com.stream;

import java.util.stream.Stream;

public class TestReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> intStream=Stream.of(10,2,10,5);
		
		int r=intStream.reduce((i,j)->i*j).get();
		System.out.println("r:"+r);
		
		Stream<Long> lonStream=Stream.of(new Long[] {20l,30l,50l});
		System.out.println(lonStream.anyMatch(i->i==50));
	}

}
