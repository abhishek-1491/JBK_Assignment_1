package practice_List_2;

import java.util.Scanner;

//Write a Program to accept a number and find it is odd No.

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check it is Odd or Not");
		
		int num = sc.nextInt();
		if(num%2 != 0)
			System.out.println(num+" is a Odd Number");
		else
			System.out.println(num+" is not a Odd Number");

	}

}
