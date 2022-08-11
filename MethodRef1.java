package com.api;

import java.util.ArrayList;
import java.util.List;

public class MethodRef1 {

	public static void displayNames(String name) {
		System.out.println("All names: " +name);
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Lisa");
		list.add("Megha");
		list.add("Riya");
		list.add("Rai");
		list.add("Chitrali");
		
		list.forEach(MethodRef1 :: displayNames);
		
	}
}
