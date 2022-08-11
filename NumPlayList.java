package com.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class NumPlayList {

	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<Integer>();
		for(int i=0; i<7; i++)
			mylist.add(i);
		//Method 1:
		Iterator<Integer> it = mylist.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println("List of element== " +i);
			}
		
		//Method:2
		class MyConsumer implements Consumer<Integer>{

			@Override
			public void accept(Integer t) {
				System.out.println("............"+t);
			}
		}
			MyConsumer action = new MyConsumer();
			mylist.forEach(action);
	
	
			//Method:3
			mylist.forEach(new Consumer<Integer>(){
				public void accept(Integer t) {
					System.out.println("-------------"+t);
				}
			});
			
		//Mathod:4
		Consumer<Integer> mylistAction = n -> {System.out.println(+n);};
		mylist.forEach(mylistAction);
		
		
		//Method:5
		mylist.forEach(n ->{
			System.out.println("Numberssssssss"+n);
		});
		
		//Method:5
		Function<Integer,Double> toDoublefn = Integer::doubleValue;
		mylist.forEach(n -> {System.out.println("Double Value:"+toDoublefn.apply(n));
		});
		
		//Method:6
		Predicate<Integer> isEvenfn = n -> (n>0 && n%2 == 0);
		mylist.forEach(n -> {System.out.println(+n+" Even Values"+isEvenfn.test(n));
		
		});
		
		
		mylist.forEach(n -> {System.out.println(+n);
		});
		mylist.stream().forEach(n -> {System.out.println("Stream values:"+n);
		
		});
		
	}

	
			
}

	
		

