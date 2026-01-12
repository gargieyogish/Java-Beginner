import java.util.Scanner;
public class CalJava {
    public static void main(String[]args){
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter a and b ");
        int a=obj.nextInt();
        int b=obj.nextInt();
        System.out.println("Choose operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo)");

        System.out.print("Enter choice: ");
        int choice = obj.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Result = " + result);
                break;

            case 2:
                result = a - b;
                System.out.println("Result = " + result);
                break;

            case 3:
                result = a * b;
                System.out.println("Result = " + result);
                break;

            case 4:
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    result = a / b;
                    System.out.println("Result = " + result);
                }
                break;

            case 5:
                if (b == 0) {
                    System.out.println("Error: Modulo by zero");
                } else {
                    result = a % b;
                    System.out.println("Result = " + result);
                }
                break;

            default:
                System.out.println("Invalid operation choice");
        }

        obj.close();
    }
}
