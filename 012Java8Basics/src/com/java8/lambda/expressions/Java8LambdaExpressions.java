package com.java8.lambda.expressions;

//interface
interface Vehicle{
		public void drive();
}

public class Java8LambdaExpressions {

	public static void main(String[] args) {
		/*
		 * different way to write a function
		 */
		String name  = "Honda";
		
		/*
		 * Non-lambda way
		 */
		/*Vehicle v = new Vehicle() {
			
			@Override
			public void drive() {
				// TODO Auto-generated method stub
				System.out.println("This is legacy (non-lambda) way!!!! " + name);
			}
		};
		
		v.drive();*/
		
		/*
		 * Lambda Way (parameter) -> { function body }
		 */
		Vehicle v = () ->{
			System.out.println("This is lambda way!!!! " + name);
		};
		
		v.drive();

	}

}
