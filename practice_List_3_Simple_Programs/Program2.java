package practice_List_3_Simple_Programs;

import java.util.Scanner;

// Write a Program to accept two integers and find its addition.

public class Program2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Addition of "+a+" & "+b+" is = "+(a+b));

	}

}
