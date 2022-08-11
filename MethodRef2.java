package com.api;

import java.util.ArrayList;
import java.util.List;

public class MethodRef2 {

	public static void displayNames(int number) {
		System.out.println("All names: " +number);
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.forEach(MethodRef2 :: displayNames);
		
	}
}