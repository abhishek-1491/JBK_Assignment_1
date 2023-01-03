package practice_List_1;

// WAP to print 1 to 100 odd Nos?

public class Program3 {

	public static void main(String[] args) {
		
		System.out.println("Using For Loop");
		
		for(int i =1;i<=100;i++)
		{
			if(i%2 != 0)
				System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Using While Loop");
		
		int i=1;
		while(i<=100)
		{
			if(i%2 != 0)
				System.out.print(i+" ");
			i++;
		}
	}

}
