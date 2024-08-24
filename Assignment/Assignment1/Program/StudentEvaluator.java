public class StudentEvaluator
{
	public static void main(String[] args)
	{
		
		
		isPassOrFail(40,50,40);
		
    }
	
	public static void isPassOrFail(int sub1, int sub2, int sub3)
	{
	    switch(sub1 > 40 ? 1 : 0)
		{
			case 1: 
		          System.out.println("sub1 is pass");
				  switch(sub2 > 40 ? 1 : 0)
				  {
						case 1:
							System.out.println("sub2 is pass");
							switch(sub3 > 40 ? 1 : 0)
							{
								case 1:
										System.out.println("sub3 is pass");
										break;
								case 0:
										System.out.println("sub3 is fail");
										break;
							}
							break;
						case 0:
								System.out.println("sub2 is fail");
								switch(sub3 > 40 ? 1 : 0)
								{
									case 1:
										System.out.println("sub3 is pass");
										break;
									case 0:
										System.out.println("sub3 is fail");
										break;
								}
								break;
				  }
				  break;
			case 0 :
		           System.out.println("sub1 is fail");
				   switch(sub2 > 40 ? 1 : 0)
					{
						case 1:
								System.out.println("sub2 is pass");
								switch(sub3 > 40 ? 1 : 0)
								{
									case 1:
										System.out.println("sub3 is pass");
										break;
									case 0:
										System.out.println("sub3 is fail");
										break;
								}
								break;
						case 0:
								System.out.println("sub2 is fail");
								switch(sub3 > 40 ? 1 : 0)
								{
									case 1:
										System.out.println("sub3 is pass");
										break;
									case 0:
										System.out.println("sub3 is fail");
										break;
								}
								break;
					}
				   break;
		}
	}
}	