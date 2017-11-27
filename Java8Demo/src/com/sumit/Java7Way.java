package com.sumit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*
 * 1. Sort list by last name
 * 2. Print all names
 * 3. Print all names starting with S
 * 
 */


public class Java7Way {

	public static void main(String[] args) {
		List<Person>  people = Arrays.asList(
				new Person("David", "Warner", 31),
				new Person("Steve", "Smith", 28),
				new Person("Tim", "Pyne", 27),
				new Person("Glen", "Maxwell", 29),
				new Person("Adam", "Zampa",22),
				new Person("Shaun", "Tait",30)
				);
		
		//Sort list by last name
		
		Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person p1, Person p2) {
				return (p1.getLastName()).compareTo(p2.getLastName());
			}
			
		});
		
		//Print all names
		printAll(people);
		
		//Print all names starting with S
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("S");
			}
		});

	}

		
	private static void printConditionally(List<Person> people, Condition c) {
		for(Person p : people) {
			if(c.test(p)) {
				System.out.println(p);
			}
		}
		
	}



	private static void printAll(List<Person> people) {
		for(Person p: people) {
			System.out.println(p.toString());;
		}
		
	}

}

interface Condition {
	boolean  test(Person p);
}
