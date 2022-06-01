package assignment;

public class Leader_in_the_Array {

	public static void main(String[] args) {
		int arr[] = {7, 10, 4, 10, 6, 5, 2};
		int n = 7;
		
		int max = arr[n-1];
		System.out.print(max);
		System.out.print("  ");
		
		for (int i = n-2; i>=0; i--)
		{
			if(max < arr[i])
			{
				max = arr[i];
				System.out.print(max);
				System.out.print("  ");
			}
		}
	}

}
