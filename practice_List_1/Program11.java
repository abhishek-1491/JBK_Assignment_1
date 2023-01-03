package practice_List_1;


//Write a Program To  print 1 to 100 no.

public class Program11 {

	public static void main(String[] args) {
		
		System.out.println("Printing series using For Loop");
		for(int i=1;i<=100;i++)
			System.out.print(i+" ");
		
		System.out.println();
		System.out.println("Printing series using While Loop");
		
		int i=1;
		while(i<=100)
		{
			System.out.print(i+" ");
			i++;
		}
	}
	
}
