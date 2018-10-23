package com.java.classes.child.grandchild;

import com.java.classes.child.SchoolFriend;

public class PrimarySchoolFriends extends SchoolFriend {
	
	int classgrade;

	void sayClass(int clg){
		this.classgrade = clg;
		System.out.println(this.classgrade);
	}
	
	public void makeFriend(){
		System.out.println("Made friend");
	}
	
	public void makeFriend(String name){
		System.out.println("Made friend: " + name);
	}
	
	public String message(){
		return "We are friends from school days (VEDIC School)!!!!";
	}
	

}
