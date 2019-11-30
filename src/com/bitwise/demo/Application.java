package com.bitwise.demo;

//import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		AddMul obj1 = new AddMul();
		SubDiv obj2 = new SubDiv();
		
		  System.out.println("Sum: "+obj1.Add(10, 20));
		  System.out.println("Multiplication: "+obj1.Mul(10, 20));
		  System.out.println("Subtraction: "+obj2.Sub(20, 10));
		  System.out.println("Division: "+obj2.Div(20, 10));
		
	}

}













/*Scanner scanner = new Scanner(System.in);

System.out.print("Enter Two Numbers : ");
first = scanner.nextInt();
second = scanner.nextInt();*/