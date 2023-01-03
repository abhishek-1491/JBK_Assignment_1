package practice_List_1;

import java.util.Scanner;

// Write a Program To print even and odd No

public class Program10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last number to print odd and even numbers");
		
		int num=sc.nextInt();
		System.out.println("Printing even numbers upto "+num+" using For Loop");
		for(int i =1;i<=num;i++)
		{
			if(i % 2 ==0)
				System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Printing even numbers upto "+num+" using while Loop");
		
		int i =1;
		while(i<=num)
		{
			if(i % 2 ==0)
				System.out.print(i+" ");
			i++;
		}
		printseries(num);
	}
	static void printseries(int num)
	{
		System.out.println();
		System.out.println("Printing odd numbers upto "+num+" using For Loop");
		for(int i =1;i<=num;i++)
		{
			if(i % 2 !=0)
				System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Printing odd numbers upto "+num+" using while Loop");
		
		int i =1;
		while(i<=num)
		{
			if(i % 2 !=0)
				System.out.print(i+" ");
			i++;
		}
	}
}
