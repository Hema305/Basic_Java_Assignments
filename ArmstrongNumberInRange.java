import java.lang.Math;
public class ArmstrongNumberInRange 
{
     public static void main(String args[])
    {
        int temp,expressionSum,number,reminder,length,lengthCheck;
        
       for (int i=100;i<=999;i++)
       {
            temp=i;
            lengthCheck=i;
            number=i;
             length=0;
                while(lengthCheck!=0)
                {
                   
                        if(lengthCheck%10>0)
                            length++;
                        lengthCheck=lengthCheck/10;
                }
                
                expressionSum=0;
               while(temp!=0)
               {
                   reminder=temp%10;
                   expressionSum+=(int) Math.pow(reminder,length);
                   temp=temp/10;
                   
                   
               }
               
               if(expressionSum==number)
               {
                   System.out.println(number+" "+"is an Armstrong number");
               }
     
        }
        
    }
}

