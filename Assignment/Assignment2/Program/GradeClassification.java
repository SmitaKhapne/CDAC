public class GradeClassification
{
   public static void main(String[] args)
   {
       int marks = 65;

       if(marks >= 90)
       {
          System.out.println("Grade A");
       }
       else if(marks <= 89 && marks >=80)
       {
          System.out.println("Grade B");
       }
       else if(marks <= 79 && marks >= 70)
       {
          System.out.println("Grade C");
       }
       else if(marks <= 69 && marks >= 60)
       {
          System.out.println("Grade D");
       }
       else if(marks < 60)
       {
          System.out.println("Grade F");
       }
       else
       {
         System.out.println("FAIL");
       }

   }
}
