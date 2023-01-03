package practice_List_2;

import java.util.Scanner;

//Write a Program to accept a number and find it is Even No.

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check it is Even or Not");
		
		int num = sc.nextInt();
		if(num%2 == 0)
			System.out.println(num+" is a Even Number");
		else
			System.out.println(num+" is not a Even Number");
		
	}

}
