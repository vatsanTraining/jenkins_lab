package com.training;

public class Application {

	
	public static void main(String[] args) {

		
		Greeting birthday = new Greeting();
		
		System.out.println(birthday.birthdayGreeting());
		
		System.out.println(birthday.birthdayGreeting("Ramesh"));
		
		
	}

}
