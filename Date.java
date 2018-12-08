import java.util.Scanner;
public class Date{
    public static void main(String srgs[])
    {
        String day,month,year;
        String monthName="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter DD:");
        day=sc.nextLine();
        System.out.println("enter MM:");
        month=sc.nextLine();
        switch(month)
        {
            case "01":
                monthName="January";
                break;
            case "02":
                monthName="February";
                break;
            case "03":
                monthName="March";
                break;
            case "04":
                monthName="April";
                break;
            case "05":
                monthName="May";
                break;
            case "06":
                monthName="June";
                break;
            case "07":
                monthName="July";
                break;
            case "08":
                monthName="August";
                break;
             case "09":   
                monthName="September";
                break;
            case "10":
                monthName="October";
                break;
            case "11":
                monthName="November";
                break;
            case "12":
                monthName="December";
                 break;       
                             
        }
        System.out.println("enter YYYY:");
        year=sc.nextLine();
        System.out.println(day+"/"+monthName+"/"+year);
    
    }
}
