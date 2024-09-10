package assignment_6;

public class FindMissingRange6 
{		
	public static void findRange(int arr[], int rangeStart, int rangeEnd)
	{
		for (int i=rangeStart; i <= rangeEnd; i++)
		{
			int j=0;
			for( ; j < arr.length; j++)
			{
				if (arr[j] == i)
				{
					break;
				}
			}
			
			if (j == arr.length)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = new int[] {1,2,4,6,8,9};
		findRange(arr, 1, 10);
	}

}
