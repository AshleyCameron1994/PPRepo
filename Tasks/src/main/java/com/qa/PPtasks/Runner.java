package com.qa.PPtasks;

public class Runner {
	public static void main(String []args) {
		int fact = 120;
		int number = 5;
		
		for(int x = 1; x <= number; x++) {
			fact = fact/x;
			System.out.println(fact + " " + x);
		}
		System.out.println("Factorial of "+ number +" is: "+ fact);  
		 
		DoggoCompetition.counting();
	}
}
