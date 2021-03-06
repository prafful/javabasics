package com.java.mainFriend;

import com.java.classes.Friend;
import com.java.classes.WalletInterface.HDFCWallet;
import com.java.classes.WalletInterface.RBLWallet;
import com.java.classes.WalletInterface.SBIWallet;
import com.java.classes.WalletInterface.WalletValue;
import com.java.classes.abstractclass.HomeInterior;
import com.java.classes.child.FamilyFriend;
import com.java.classes.child.SchoolFriend;
import com.java.classes.child.grandchild.PrimarySchoolFriends;
import com.java.classes.encapsulation.Accounts;

public class MakeFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend f1 = new Friend(31, "Chennai", 1, "Prafful");
		//Friend f1 = new Friend();
		//f1.setFriend(31, "Chennai", 1, "Prafful");
		f1.printPublicFriend();
		f1.sayHello();
		System.out.println(Friend.myStatus());
		
		System.out.println("########### Child Classess ###########");
		
		FamilyFriend f2 = new FamilyFriend();
		SchoolFriend f3 = new SchoolFriend();
		PrimarySchoolFriends f4 = new PrimarySchoolFriends();

		f2.sayHello();
		f3.sayHello();
		f4.sayHello();
		f4.saySchool("VEDIC");
		
		System.out.println(f4 instanceof PrimarySchoolFriends);
		//method overloading - class has multiple methods with same name
		f4.makeFriend();
		f4.makeFriend("Bahu");
		//method overriding - child class has the same method as parent class
		//1. same name
		//2. same parameter type
		//3. inheritance should be there
		//4. 
		System.out.println(f3.message());
		System.out.println(f4.message());
		SchoolFriend f5 = new PrimarySchoolFriends();
		System.out.println(f5.message());
		System.out.println("---------trying to override the static method------");
		System.out.println(Friend.myStatus());
		System.out.println(SchoolFriend.myStatus());
		System.out.println("----------Using Super----------------");
		SchoolFriend f6 = new SchoolFriend(12, "Chennai", 5, "Oma", "BHARAT");
		f6.printPublicFriend();
		System.out.println("-------using final----------");
		/*
			using final keyword
			1. once variable is final, you cannot change its value
			2. once method is final, you cannot override it
			3. once class is final, you cannot extend it
		*/
		
		final int score = 10;
		// score++; final variable cannot be changed!
		
		/*
			Abstraction:
			1. It is the process of hiding the implementation details
			2. instance of the abstract class cannot be created
			
		*/
		HomeInterior h1 = new HomeInterior();
		h1.decorate();
		
		/* Interface example
		*/
		WalletValue wv1 = new HDFCWallet();
		WalletValue wv2 = new RBLWallet();
		WalletValue wv3 = new SBIWallet();
		
		wv1.getPoints();
		wv2.getPoints();
		wv3.getPoints();
		
		/*
		 * Encapsulation - if I make all the class variables and methods 
		 * as private, it will be the encapsulated class. We can access the 
		 * class variables only by getters and setters.
		 * 
		 */
		
		Accounts a1 = new Accounts();
		a1.setName("Prafful");
		a1.setBalance(8888);
		
		System.out.println(a1.getName());
		System.out.println(a1.getBalance());
		
		
		/*Inheritance
		Polymorphism - ability of the class to take many forms
		Encapsulation
		Abstraction*/
		
		
		
		

	}

}
