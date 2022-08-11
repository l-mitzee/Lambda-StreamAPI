package com.api;

public class LambdaExp{
	
	@FunctionalInterface
	public interface IMathFunction {

		int calculate(int a , int b);
		
		static void printResult(int a, int b, String function, IMathFunction fobj) {
			System.out.println("Result of " +function+ " is " +fobj.calculate(a,b));
		}
	}
	
	interface Message{
		void sayMessage(String message);
		
	}
		
		public static void main(String[] args) {
			IMathFunction add = (int x, int y)-> x+y;
			IMathFunction Subtract = (int x, int y)-> x-y;
			IMathFunction multiply = (int x, int y) -> x*y;
			IMathFunction divide = (int x, int y) -> x/y;
//			LambdaExp obj = new LambdaExp();
//			System.out.println("Addition result: " +add.calculate(6, 3));
//			System.out.println("Multiply result: " +multiply.calculate(6, 3));
			
			
			IMathFunction.printResult(3, 6, "Addition", add);
			IMathFunction.printResult(10, 6, "Substract", Subtract);
			IMathFunction.printResult(3, 6, "A", multiply);
			IMathFunction.printResult(3, 6, "Addition", divide);

			Message msg = message -> System.out.println("Hello" +message );
			msg.sayMessage("My name is Lisa");
			

		}
	}


