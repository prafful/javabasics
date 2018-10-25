package com.java8.lambda.expressions;

interface Life{
	public String live();
}


public class Java8LambdaNoParameter {

	public static void main(String[] args) {

		Life life = () ->{
			return "I live in Chennai!!!!";
		};
		
		System.out.println(life.live());
	}

}
