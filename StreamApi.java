package com.api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<Integer>();
		for(int i=0; i<20; i++)
			mylist.add(i);

		
		mylist.forEach(n -> {System.out.println(+n);
		});
		mylist.stream().forEach(n -> {System.out.println("Stream values:"+n);
		
		});
		
		Predicate<Integer> isEvenfn = n -> (n>0 && n%2 == 0);
		
		Function<Integer,Double> toDoublefn = Integer::doubleValue;
		mylist.forEach(n -> {System.out.println("Double Values:"+toDoublefn.apply(n));
		});
		
		///////////////////////////////////////////////////
		List<Double> stream = mylist.stream()
								.filter(isEvenfn)
								.map(toDoublefn)
								.collect(Collectors.toList());
		System.out.println("Stream of even number in double" +stream);
		
		
		
		///////////////////////////////////////////////////////
		
		Integer first = mylist.stream()
						.findFirst()
						.orElse(null);
		System.out.println("First value in list: "+first);
		
		//////////////////////////////////////////////////////
		
		Integer min = mylist.stream()
				.min((n1,n2) -> n1-n2)
				.orElse(null);
		System.out.println("Minimum value in list:"+min);
		
		
		///////////////////////////////////////////////////
		
		Integer max = mylist.stream()
					.max(Comparator.comparing(Integer::intValue))
					.orElse(null);
		System.out.println("Max Value in list:"+max);
		
		
		//////////////////////////////////////////////////
		
		List<Integer> sortedList = mylist.stream()
								.sorted((n1,n2) -> n2.compareTo(n1))
								.collect(Collectors.toList());
		System.out.println("Sorted list is:"+sortedList);
		
		/////////////////////////////////////////////////
		
		boolean allEven = mylist.stream()
						.allMatch(isEvenfn);
		System.out.println("Print if all number is even: "+allEven);
		
		///////////////////////////////////////////////////
		
		boolean anyEven = mylist.stream()
				.anyMatch(isEvenfn);
		System.out.println("print any number is even: "+anyEven);
		
		///////////////////////////////////////////////////
		
		boolean multsix = mylist.stream()
				.anyMatch(n -> n>0 && n%6 == 0);
		System.out.println("Print if all number is even: "+multsix);
		
		
	}
}
