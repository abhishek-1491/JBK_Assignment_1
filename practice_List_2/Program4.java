package practice_List_2;

import java.util.Scanner;

//Write a Program to accept a number and find it Zero, Positive or Negative.

public class Program4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check it is a zero , positive or negative");
		int num = sc.nextInt();
		if(num >0)
			System.out.println(num+" is a positive number");
		else if(num<0)
			System.out.println(num+" is a negative number");
		else
			System.out.println("Given number is a Zero ");
		
	}

}
