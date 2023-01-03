package For_Loop_Series_List;

//Generate the Series... 1 -2 3 -4 5 -6 7 -8 9 -10. 

public class Program3 {

	public static void main(String[] args) {

		System.out.print("Printing Series......");
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				System.out.print("-"+i+" ");
			else
				System.out.print(i+" ");
		}

	}

}
