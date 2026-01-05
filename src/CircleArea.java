import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius =obj.nextDouble();
        double area= 3.14*radius*radius;
        System.out.println("The are of circle is"+area);
    }
}
