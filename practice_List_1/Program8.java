package practice_List_1;


// Write a Program To print 50 to 100 nos.

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Printing series using for Loop");
		
		for(int i=50;i<=100;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Printing series using while Loop");
		
		int i=50;
		while(i<=100)
		{
			System.out.print(i+" ");
			i++;
		}

	}
}
