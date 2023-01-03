package practice_List_1;

import java.util.Scanner;

// Write a Program To print sum of odd and even no.
public class Program9 {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter last number to print sum of even nos upto ");
		int num = sc.nextInt();
		sc.close();
		int count1=0,i;
		for(i =1;i<=num;i++)
		{
			if(i%2 == 0)
				count1 = count1 + i;
		}
		System.out.println("Sum of 1 to "+num+" Even numbers using for loop is = " +count1);
		int count2=0;
		i=1;
		while(i<=num)
		{
			if(i%2 == 0)
				count2 = count2 + i;
			i++;
		}
		System.out.println("Sum of 1 to "+num+" Even numbers using while loop is = "+count2);


		printSumofOdd(num);
	}
	static void printSumofOdd(int num)
	{
		int count1=0,i;
		for(i =1;i<=num;i++)
		{
			if(i%2 != 0)
				count1 = count1 + i;
		}
		System.out.println("Sum of 1 to "+num+" odd numbers using for loop is = " +count1);
		int count2=0;
		i=1;
		while(i<=num)
		{
			if(i%2 != 0)
				count2 = count2 + i;
			i++;
		}
		System.out.println("Sum of 1 to "+num+" odd numbers using while loop is = "+count2);
	}
}
