package com.javabasics.arrays;

import java.util.Collections;

public class ArrayBasics {

	public static void main(String[] args) {
		// Array - data structure to store collection of elements of same data type.
		
		//datatype[4] variableName;
		/*
		 * variableName[0]
		 * variableName[1]
		 */
		
		int[] score= {1,2,3,4,5,6,7,8,9,10}; 
		System.out.println("Length of array: " + score.length);
		
		for(int i=0; i<score.length; i++){
			System.out.println(score[i]);
		}
		System.out.println("######## foreach #########");
		char[] vowel = {'A','E','I','O','U'};
		for (char c : vowel) {
			System.out.println(c);
		}
		
		System.out.println("######## pass array to method #########");
		int sum = sumArray(score);
		System.out.println("Sum: " + sum);
		
		System.out.println("######## 2D array #########");
		//int[][] tech= new int[3][3];
		int[][] tech = {{1,2,3},{4,5,6},{7,8,9}};		/*
				 * [0][0]	[0][1]	[0][2]
				 * [1][0]	[1][1]	[1][2]
				 * [2][0]	[2][1]	[2][2]
				 */
		/*
		 * 1	2	3
		 * 4	5	6
		 * 7	8	9
		 */
		for(int i=0; i<=2; i++){
			for(int j=0; j<=2; j++){
				System.out.print(" " + tech[i][j]);
			}
			System.out.println();
		}
		
		
	}

	private static int sumArray(int[] scr) {
		int sum = 0;
		for (int i : scr) {
			sum = sum + i;
		}
		return sum;
		
		
	}

}
