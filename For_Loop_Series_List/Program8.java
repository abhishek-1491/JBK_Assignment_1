package For_Loop_Series_List;

import java.util.Scanner;

//Generate the Series... 0 1 1 2 3 5 8 13 21.

public class Program8 {

static int n1 = 0, n2=1,n3=0;
	
	// method to print series 
	
	static void printseries(int num) {
		if(num >0)
		{
			n3 = n1+n2;
			if(n3 <=21)
				System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
			printseries(num-1);
		}
		
	}
	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter how many numbers of fibonacci to print");
		
		//int num = sc.nextInt();
		int num=15;
		System.out.print("Printing series.....");
		System.out.print(n1+" "+n2);
		printseries(num-2);
	}

}
