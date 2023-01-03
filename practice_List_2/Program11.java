package practice_List_2;

import java.util.Scanner;

//Write a Program to create Menu driven program for Arithmetic Operation

public class Program11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		System.out.println("Select below 1 to 5 optins of Arithmetic Operation(Input 1 to 5 Number only) \n 1.Addition\n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Modulus(%)");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1 :
			System.out.println("Addition of "+a+" & "+b+" is = "+(a+b));
			break;
		case 2 :
			System.out.println("Substraction of "+a+" & "+b+" is = "+(a-b));
			break;
		case 3 :
			System.out.println("Multiplication of "+a+" & "+b+" is = "+(a*b));
			break;
		case 4 :
			System.out.println("Division of "+a+" & "+b+" is = "+(a/b));
			break;
		case 5 :
			System.out.println("Modulus(Reminder) of "+a+" & "+b+" is = "+(a%b));
			break;
		default :
			System.out.println("Invalid input");
		}

	}

}
