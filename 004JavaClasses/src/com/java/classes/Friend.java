package com.java.classes;

public class Friend {
	int age;
	protected String location;
	protected int numberOfYears;
	protected String name;
	
	
	public Friend(int age, String location, int numberOfYears, String name) {
		super();
		this.age = age;
		this.location = location;
		this.numberOfYears = numberOfYears;
		this.name = name;
	}

	public Friend() {
		super();
	}
	
	private void printFriend(){
		System.out.println("Name: " + this.name + " since " + this.numberOfYears + " years" );
		System.out.println("Location: " + this.location);
	}
	
	public void printPublicFriend(){
		this.printFriend();
	}
	
	public static String myStatus(){
		return "PRIVATE Friend";
	}
	
	public void sayHello(){
		System.out.println("Hello...Whats's Up?");
	}
	
	
	
}
