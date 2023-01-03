package practice_List_1;

// Write a Program To print 100 to 1 no.

public class Program12 {

	public static void main(String[] args) {
			
			System.out.println("Printing series using For Loop");
			for(int i=100;i>=1;i--)
				System.out.print(i+" ");
			
			System.out.println();
			System.out.println("Printing series using While Loop");
			
			int i=100;
			while(i>=1)
			{
				System.out.print(i+" ");
				i--;
			}
		}
}
