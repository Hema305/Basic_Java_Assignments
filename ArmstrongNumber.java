import java.lang.Math;
public class ArmstrongNumber 
{
    public static void main(String args[])
    {
        int temp=153,expressionSum = 0,number,reminder,count,length=0;
        number=temp;
        count=temp;
         while(count!=0)
                {
                        if(count%10>0)
                            length++;
                        count=count/10;
                    
                }
                System.out.println("length"+length);
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
        else
        {
            System.out.println(number+" "+"is not an Armstrong number");
        }
    
    }
}
