import java.util.Scanner;
public class evenOdd {
    public static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not even");
        }
    }
        public static void main(String [] args) {
            System.out.println("Enter number");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            evenOdd(n);
        }
    }
