package practice_List_1;

//2) WAP to print 25 to 1

public class Program2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Printing series using for Loop");
		
		for(int i=25;i>0;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Printing series using while Loop");
		
		int i=25;
		while(i>0)
		{
			System.out.print(i+" ");
			i--;
		}

	}

}
