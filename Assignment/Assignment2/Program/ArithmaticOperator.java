public class ArithmaticOperator
{
   public static void main(String[] args)
   {
      int num1 = 6;
      int num2 = 10;
      int choice = 3;
      switch(choice)
      {
        case 1: System.out.println("Addition : " + (num1 + num2));
                break;
        case 2: System.out.println("Subtraction : " + (num1 - num2));
                break;
        case 3: System.out.println("Multiplication : " + (num1 * num2));
                break;
        case 4: 
               if(num2 == 0)
               {
                  System.out.println("divisible by 0 not accepted");
               }
               else
               {
                  System.out.println("Division : " + (num1 / num2));
                  break;
               }
        }
    }
}