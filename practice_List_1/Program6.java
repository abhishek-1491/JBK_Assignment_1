package practice_List_1;

//Write a Program To print sum of 1 to 50 EVEN nos.

public class Program6 {

	public static void main(String[] args) {
		
		int count1=0;
		for(int i =1;i<=50;i++)
		{
			if(i%2 == 0)
				count1 = count1 + i;
		}
		System.out.println("Sum of 1 to 50 Even numbers using for loop is = " +count1);
		
		int count2=0;
		int i=1;
		while(i<=50)
		{
			if(i%2 == 0)
				count2 = count2 + i;
			i++;
		}
		System.out.println("Sum of 1 to 50 Even numbers using while loop is = "+count2);
	}
}
