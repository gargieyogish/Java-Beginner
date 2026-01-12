import java.util.Scanner;
public class leapYear {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the year");
        int year =obj.nextInt();
        if((year%400==0)||(year%4==0))
        {
            System.out.println("The year is a leap Year");
        }else{
            System.out.println("The year is not a leap year");
        }
    }
}
