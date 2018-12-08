import java.util.Scanner;
public class Incomtax 
{
   public static void main(String args[])
   {
       int taxPercentage=0,taxAmount;
       String slab="";
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter CTC:");
       int CTC=sc.nextInt();
       if(CTC>=0 && CTC<=180000)
       {
           taxPercentage=0;
           slab="slabA";
       }
       else if(CTC>=180001 &&CTC<=300000)
       {
          taxPercentage=10;
          slab="slabB";
       }    
       else if(CTC>=300001 && CTC<=500000)
       {
           taxPercentage=20;
           slab="slabC";
           
       }   
       else if(CTC>=500001 && CTC<=1000000)
       {
           taxPercentage=30;
           slab="slabD";
       }
           
       taxAmount=(taxPercentage*CTC)/100;
       System.out.println("TaxAmout="+taxAmount+" for "+slab);
       
      }
}
