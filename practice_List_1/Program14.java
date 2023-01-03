package practice_List_1;

//Write a Program To print count of even No 1 to 25 no.

public class Program14 {

	public static void main(String[] args) {
		
		int count=0;
		
		System.out.println("Using For Loop");
		for(int i=1;i<=25;i++)
		{
			if(i%2==0)
				count++;
		}
		System.out.println("Total Even numbers from 1 to 25 is = "+count);
		System.out.println("Using While Loop");
		
		int i=1;
		int count2=0;
		while(i<=25)
		{
			if(i%2==0)
				count2++;
			i++;
		}
		System.out.println("Total Even numbers from 1 to 25 is = "+count2);
		
	}
}
