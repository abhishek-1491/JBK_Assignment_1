package For_Loop_Series_List;

//Generate the Series... 1  3  6  10  15  21  28  36  45.

public class Program6 {

	public static void main(String[] args) {
		
		System.out.print("Printing series.........");

		int i=1,temp=0;
		while(temp<=45)
		{
			temp = temp +i;
			if(temp<=45)
				System.out.print(temp+" ");
			i++;
		}
	}

}
