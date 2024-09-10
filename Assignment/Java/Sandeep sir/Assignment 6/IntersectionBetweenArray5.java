package assignment_6;

public class IntersectionBetweenArray5 {

	public static void findIntersection(int arr1[], int arr2[])
	{
		int[]arr3 = new int[4];
		int k=0;
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					arr3[k] = arr1[i];
					k++;
				}
			}
		}
		for(int i=0; i<k; i++)
		{
			System.out.println(arr3[i]);
		}
		
	}
	
	public static void main(String[] args) 
	{
		int[] arr1 = new int[] {10,20,30,40};
		int[] arr2 = new int[] {20,50,60,40};
		//int[] arr3 = new int[4];
		
		findIntersection(arr1, arr2);

	}

}
