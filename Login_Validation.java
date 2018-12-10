import java.util.Scanner;
public class Login_Validation 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String uName="Hema";
		String pwd="hema123";
		int count=0;
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter user-name:");
			String userName=sc.next();
			System.out.println("Enter password:");
			String password=sc.next();
			if(userName.equals(uName) && password.equals(pwd))
			{
				System.out.println("*******welcome "+userName+" ********");
				break;
			}
			else
				count++;
		}
		if(count==3)
			System.out.println("****Contact Admin****");
			
	}

}


