import java.util.Scanner;
public class Palindrome 
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int temp=sc.nextInt();
		int number=temp;
		int reminder,sum=0;
		
		while(number!=0)
		{
			reminder=number%10;
			
			sum=(sum*10)+reminder;
			
			number=number/10;
		}
		if(temp==sum)
			System.out.println("true");
		else
			System.out.println("false");
	}
	
	

}
