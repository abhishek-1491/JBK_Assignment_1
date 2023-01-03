package practice_List_2;

import java.util.Scanner;

//Write a Program to accept a day of week(int) and display the weekday (e.g – day=4  Thursday) (use switch case)

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		
		int week = sc.nextInt();
		switch(week)
		{
		case 1 : 
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Saturday");
			break;
		case 7 :
			System.out.println("Sunday");
			break;
		default :
			System.out.println("Invalid input");
		}
	}

}
