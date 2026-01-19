import java.util.Scanner;
public class numbersPNZ {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int positive = 0, negative = 0, zero = 0;
            char choice;

            do {
                System.out.print("Enter a number: ");
                int n = sc.nextInt();

                if (n > 0) {
                    positive++;
                } else if (n < 0) {
                    negative++;
                } else {
                    zero++;
                }

                System.out.print("Do you want to continue? (y/n): ");
                choice = sc.next().charAt(0);

            } while (choice == 'y' || choice == 'Y');

            System.out.println("Positive numbers: " + positive);
            System.out.println("Negative numbers: " + negative);
            System.out.println("Zeros: " + zero);
        }
    }
