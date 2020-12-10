package com.qa.PPtasks;

public class DoggoCompetition {
	
	public static void counting() {
		
		for(int i = 1; i <= 100; i++) {
			if(i == 11) {
				System.out.println(i + "" + "th");
			}
			else if((i+10)%10 == 1) {
				System.out.println(i + "" + "st");
			}
			else if(i == 12) {
				System.out.println(i + "" + "th");
			}
			else if((i+10)%10 == 2) {
				System.out.println(i + "" + "nd");
			}
			else {
				System.out.println(i + "" + "th");
			}
		}
	}

}
