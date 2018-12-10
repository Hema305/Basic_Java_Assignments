import java.util.Scanner;
public class StudentResult 
{
	public static void main(String args[])
	{
		int studentDetails[][]=new int[3][3];
		int totalScore=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("enter student  "+(i+1)+"  marks in A,B and C subjects:");
			for(int j=0;j<3;j++)
			{
				
				studentDetails[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<3;i++)
		{
		
			totalScore=0;
			for(int j=0;j<3;j++)
			{
				
				totalScore += studentDetails[i][j];
				
				
			}
			System.out.println("total score of student "+(i+1)+" :"+totalScore);
			System.out.println("Average score is:"+(totalScore/3));
		}
	
		
	}

}
