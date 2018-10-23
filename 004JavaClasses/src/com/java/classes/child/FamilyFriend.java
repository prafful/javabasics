package com.java.classes.child;

import com.java.classes.Friend;

public class FamilyFriend extends Friend{
	
	String relation;
	
	
	
	public FamilyFriend(int age, String location, int numberOfYears, String name, String relation) {
		super(age, location, numberOfYears, name);
		this.relation = relation;
	}

	
	public FamilyFriend() {
		super();
		
	}



	void sayRelation(String rel){
		this.relation=  rel;
	}
}
