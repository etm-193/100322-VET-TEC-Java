package com.skillstorm.arraylists;

import java.util.ArrayList;

public class ArrayListsPractice {
	
	public static void main(String[] args) {
		practice();
	}
	
	public static void practice() {
		
		/* What is an array?
		 * - list of items primitive or non-primitive
		 *    - primitive = holds value
		 *    - non-primitives = holds "reference" (memory address)
		 *    - ALL items must be SAME TYPE
		 *           (non-primitives - can use sub-type ex: Animals[] can hold cats & dogs)
 		 * - indexed specifically starting with 0
		 *     - the last index you can access is length - 1
		 * - we can access the items using the index
		 * - once you initialize the array size is FIXED
		 *     - you can initialize the size - it fills with default values ex: 0
		 *     - or you can initialize it with the values you want
		 * 
		 * 
		 * What is an ArrayList?
		 * - it's RESIZABLE - we can continue adding items indefinitely
		 * - don't need length specified up front
		 * - MUST BE NON-PRIMITIVE
		 * - ALL items must be of same type still
		 *      - or subtype
		 * -  
		 */
		
		// How to declare
		ArrayList<String> names = new ArrayList<>(); // default capacity is 10
		ArrayList objects = new ArrayList(); // stores ANY java.lang.Object and subtypes
		
		// instead of .length
		names.size(); // capacity vs number of items added
		System.out.println(names.size());
		
		// declare initial capacity
		ArrayList<Integer> numbers = new ArrayList<>(4);
		System.out.println(numbers.size());
		
		numbers.add(1); // 1 is autoboxed to be Integer
		numbers.add(Integer.valueOf(10));
		numbers.add(100);
		numbers.add(101);
		numbers.add(102); // 5th item -- exceeds capacity
		System.out.println(numbers.size());
		
		Integer n = new Integer(1); // not good style
		Integer x = Integer.valueOf(1);
		// autoboxing
		Integer y = 1;
		// auo-unboxing
		int z = y; 
		
		System.out.println(numbers);
		numbers.add(2, Integer.valueOf(50)); // index, value
		//numbers.add(9, Integer.valueOf(60)); // index > size DOES NOT work
		System.out.println(numbers);
		
		ArrayList<Integer> numbers2 = new ArrayList<>();
		numbers2.add(5);
		numbers2.add(7);
		
		// change the value at index 2 
		numbers.set(2, Integer.valueOf(55));
		System.out.println(numbers);
		numbers.set(2, Integer.valueOf(1));
		System.out.println(numbers);
		
		// copy everything
		numbers.addAll(numbers2);
		System.out.println(numbers);
		
		
		
		
		// Strings examples
		ArrayList<String> people = new ArrayList<>();
		people.add("Jon");
		people.add("Joe");
		people.add("Jimmy");
		System.out.println(people);
		
		// remove by value
		people.remove("Joe");
		System.out.println(people);
		// remove by index
		people.remove(1); // 0-indexed
		System.out.println(people);
		
		people.add("Jon");
		System.out.println(people);
		
		
		people.remove("Jon");
		System.out.println(people);
		
		people.add("James");
		people.add("Joeseph");
		people.add("Jane");
		people.add("Jon");
		people.add("Jesus");
		people.add("Jon");
		people.add("Jimmerson");
		people.add("Jameson");
		people.add("Johnson");
		people.add("Jon");
		System.out.println(people);
		
		ArrayList<String> peopleWithoutTicket = new ArrayList<>();
		peopleWithoutTicket.add("Jon");
		
		people.removeAll(peopleWithoutTicket);
		System.out.println(people);
		
		//people.removeAll(people); // inefficient 
//		people.clear();
//		System.out.println(people);
	}

}
