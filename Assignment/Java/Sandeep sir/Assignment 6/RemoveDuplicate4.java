package assignment_6;

public class RemoveDuplicate4 
{
	
	public static void rmDuplicate(int[] arr)
	{
		for(int i=0; i< arr.length-1; i++)
		{
			for(int j=i+1; j < arr.length; j++)
			{
				if (arr[i] == arr[j])
				{
					shiftElements(arr, j);
				}
			}
		}
		
		for (int i=0; i < arr.length; i++)
		{
			if (arr[i] == 0)
			{
				break;
			}
			System.out.println(arr[i]);
		}
		
	}
	
	public static void shiftElements(int[] arr, int pos)
	{
		for (int i=pos; i < arr.length - 1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length - 1] = 0;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = new int[] {10,20,30,30,40,20};
		rmDuplicate(arr);
	}
}
