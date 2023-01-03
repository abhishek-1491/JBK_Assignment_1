package practice_List_3_Simple_Programs;

import java.util.Scanner;

//Write a Program to find the sum of two Numbers.

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Sum of "+a+" & "+b+" is = "+(a+b));

	}

}
