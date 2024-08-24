class FindGreatestAmongThree
{
   public static void main(String[] args)
   {  
      int num1 = 100;
      int num2 = 500;
      int num3 = 50;
      
      if(num1 > num2 && num1 > num3)
      {
         System.out.println("number1 is greater: " + num1);
      }
      
      else if(num2 > num1 && num2 > num3)
      {
         System.out.println("number1 is greater: " + num2);
      }

      else
      {
         System.out.println("number3 is greater: " + num3);
      }
    }
}