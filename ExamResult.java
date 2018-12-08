import java.util.Scanner;
public class ExamResult {
    public static void main(String srgs[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter subject1 marks:");
        int subject1=sc.nextInt();
          System.out.println("enter subject2 marks:");
        int subject2=sc.nextInt();
          System.out.println("enter subject3 marks:");
        int subject3=sc.nextInt();
        int total=(subject1+subject2+subject3)/3;
        int passmark=(subject1+subject2)/2,passmark2=(subject1+subject3)/2,passmark3=(subject2+subject3)/2;
        
        if(total>=60 )
        {
            System.out.println("passed");
        }
        else if(passmark>=60  || passmark2>=60 || passmark3>=60)
        {
            System.out.println("promoted");
        }
        
        else
        {
            System.out.println("failed");
        }
        
    }
}
