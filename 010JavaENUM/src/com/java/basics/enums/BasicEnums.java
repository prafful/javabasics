package com.java.basics.enums;

public class BasicEnums {
	
	public enum DIRECTION { 
		EAST(10), WEST(20), NORTH(30), SOUTH(40);
		
		private int value;
		
		private DIRECTION(int value){
			this.value = value;
		}
		
	}
	
	public static void main(String[] args) {
		/*
		 * Enum - custom datatype which contains FIXED set of constants!!!
		 * 		- class which has fixed set of constants!!!!
		 * Benefits - improves type safety
		 * 			- easy traversal
		 * 			- can have fields, methods and constructors	
		 */
		for(DIRECTION d:DIRECTION.values()){
			System.out.println(d + " with index value " + d.value);
		}
		
		System.out.println("######## Accessing individual values of enum ########");
		DIRECTION s = DIRECTION.SOUTH;
		System.out.println(s);
		System.out.println("######## Accessing individual values of enum using index ########");
		System.out.println(DIRECTION.values()[1]);
	}

}
