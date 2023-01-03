package For_Loop_Series_List;

//Generate the series... 1 4 9 16 25 36 49 64 81 100.

public class Program9 {

	public static void main(String[] args) {
		int temp = 1;
		System.out.print("Printing series........");
		for(int i=1;i<=100;i++)
		{
			temp = i *i;
			if(temp <=100)
				System.out.print((temp) +" ");
		}

	}

}
