import java.util.Scanner;
public class average {
    public static void average(int a, int b,int c){
         double avg=(a+b+c)/3;
         System.out.println("Average is "+avg);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        average(a,b,c);
    }
}
