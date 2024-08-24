public class DiscountCalculator
{
   public static void main(String[] args)
   {
      double purchaseAmount = 1000;
      double discount = 0;
      boolean hasMembership = true;

      if(purchaseAmount >= 1000)
      {
         discount = ((double)20/100) * purchaseAmount;                
      }
      else if(purchaseAmount >= 500 && purchaseAmount <= 999)
      {
        discount = ((double)10/100) * purchaseAmount;
      }
      else if(purchaseAmount < 500)
      {
        discount = ((double)5/100) * purchaseAmount;
      }
     
      if(hasMembership == true)
      {
         discount = discount + ((double)5/100) * purchaseAmount;
      }
      System.out.println("purchase amount : " +purchaseAmount + ", discount : "+ discount);    
      purchaseAmount = purchaseAmount - discount; 


     System.out.println("purchaseAmount :" + purchaseAmount);
  }

}



