package practice_List_1;

// Write a program to print 1 to 25 Nos.
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Printing series using for Loop");
		
		for(int i=1;i<=25;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Printing series using while Loop");
		
		int i=1;
		while(i<=25)
		{
			System.out.print(i+" ");
			i++;
		}

	}

}
