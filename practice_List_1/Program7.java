package practice_List_1;


//Write a Program To print -45 to +45 nos.  // negative no and positive no


public class Program7 {

	public static void main(String[] args) {
		
		System.out.println("Using For Loop");
		
		for(int i= -45;i<=45;i++)
		{
			if(i==0)
				System.out.println(i+" ");
			else
				System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Using While Loop");
		int i = -45;
		while(i<=45)
		{
			if(i == 0)
				System.out.println(i+" ");
			else
				System.out.print(i+" ");
			i++;
		}
		
		
	}
}
