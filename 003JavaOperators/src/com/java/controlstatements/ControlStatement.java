package com.java.controlstatements;

public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age1 = 36;
		int age2 = 36;
		char firstAlphabet = 'P';
		/*if (age1 >= 30 && age2 >=40  ) {
			System.out.println("I am 30");
		}*/
		/*if (age1 == 30) {
			System.out.println("I am eligible");
			
		} else {
			System.out.println("Oh..try next time");
		}*/
	/*	if (age1 >20 && age1 < 30) {
			System.out.println("You are little early for startup! Accumulate some funds");
		} else if(age1 >= 30 && age1 <= 35){
			System.out.println("This is perfect age for start-up! Go Rock and Roll");
		}else{
			System.out.println("Take early retirement and upskill yourself!");
		}
		*/
		switch (firstAlphabet) {
		case 'A':
			System.out.println("Your first alpha is A");
			break;
		case 'P':
			System.out.println("Your first alpha is P");
			break;
		case 'C':
			System.out.println("Your first alpha is C");
		default:
			System.out.println("You are at lucky age");
			break;
		}
		
		
		
		System.out.println("Control Statement Example");

	}

}
