import java.util.Scanner;
public class SearchElement {
    public static void main (String args[])
    {
        
    
        int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number...");
        int number=sc.nextInt();
        for(int i=0; i<arr.length;i++)
        {
            if(number==arr[i])
                System.out.println("number is present");
             
           
               
        }
    
    }
}
