package practice_List_2;

import java.util.Scanner;

//Write a Program to accept two number and find smallest no.

public class Program5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNo = sc.nextInt();
		System.out.println("Enter second number");
		int secondNo = sc.nextInt();
		
		if(firstNo < secondNo)
			System.out.println(firstNo+" is a smallest Number between "+firstNo+" & "+secondNo);
		else if(firstNo > secondNo)
			System.out.println(secondNo+" is a smallest Number between "+firstNo+" & "+secondNo);
		else
			System.out.println("Both numbers are equals");
	}

}
