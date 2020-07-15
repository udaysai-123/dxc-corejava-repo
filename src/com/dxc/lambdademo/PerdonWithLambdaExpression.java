package com.dxc.lambdademo;

import java.util.Arrays; 
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import com.dxc.lambdademo.Person;

public class PerdonWithLambdaExpression {

	public static void main(String[] args) {
		List<Person> listOfPersons=Arrays.asList(
				new Person("deepa","ravi"),
				new Person("uday","sai"),
				new Person("shiva","venkat"),
				new Person("tanmay","prathi"),
				new Person("seha","tact")
				);
		
Collections.sort(listOfPersons,(person1,person2)->person1.getLastname().compareTo(person2.getLastname()));
          
		printAll(listOfPersons);
	  	}

	private static void printAll(List<Person> listOfPersons) {
		for(Person p:listOfPersons) {
			
			
			System.out.println(p.getLastname());
		}
		
		System.out.println("------------------------------------------------------");
printLastNameWithR(listOfPersons,person->person.getLastname().startsWith("R"));
		
		
	}

	private static void printLastNameWithR(List<Person> listOfPersons, Predicate<Person> predicate) {
		for(Person p:listOfPersons) {
			if(predicate.test(p));
			System.out.println(p.getLastname());
		}
		
		
		
	}

}
