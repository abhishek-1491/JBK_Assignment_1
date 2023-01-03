package practice_List_1;

//Write a Program To print 30 to 50 no.

public class Program13 {

	public static void main(String[] args) {
		
		System.out.println("Printing series using For Loop");
		for(int i=30;i<=50;i++)
			System.out.print(i+" ");
		
		System.out.println();
		System.out.println("Printing series using While Loop");
		
		int i=30;
		while(i<=50)
		{
			System.out.print(i+" ");
			i++;
		}
	}
}
