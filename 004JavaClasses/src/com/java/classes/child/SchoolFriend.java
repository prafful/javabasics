package com.java.classes.child;

import com.java.classes.Friend;

public  class SchoolFriend extends Friend{
	
	String school;
	


	public SchoolFriend(int age, String location, int numberOfYears, String name, String school) {
		super(age, location, numberOfYears, name);
		this.school = school;
	}
	
	

	public SchoolFriend() {
		super();
	}



	public void saySchool(String sch){
		this.school = sch;
		System.out.println(this.school);
	}
	
	public String message(){
		return "We are friends from school days!!!!";
	}
	
	public static String myStatus(){
		return "PRIVATE School Friend";
	}
	
	private void printFriend(){
		System.out.println("Name: " + super.name + " since " + super.numberOfYears + " years" );
		System.out.println("Location: " + super.location + " in " + this.school) ;
	}
	
	public void printPublicFriend(){
		this.printFriend();
	}
}
