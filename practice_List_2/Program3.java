package practice_List_2;

import java.util.Scanner;

//Write a Program to accept a number and find it is even or odd

public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check it is Even or Odd");
		
		int num = sc.nextInt();
		if(num%2 == 0)
			System.out.println(num+" is a Even Number");
		else
			System.out.println(num+" is a Odd Number");

	}

}
