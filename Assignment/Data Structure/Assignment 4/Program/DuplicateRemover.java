public class DuplicateRemover 
{
	private void duplicateElementsRemove(int[] arr, int j) 
	{
		for(int i=j; i<arr.length-1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
	}
	
	void display(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] != 0)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		DuplicateRemover d = new DuplicateRemover();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("enter array elemnets");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j= i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					d.duplicateElementsRemove(arr,j);
					break;
				}
			}
		}
		
		d.display(arr);

	}

	

}
