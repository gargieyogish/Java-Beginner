import java.util.Scanner;
public class password {
    public static void main(String[]args){
        Scanner pass= new Scanner(System.in);
        System.out.println("Enter Username");
        String username  =pass.nextLine();
        System.out.println("Enter password");
        String password  =pass.nextLine();
        System.out.println("Confirm your password");
        String ConfirmPassword=pass.nextLine();
        if(password.equals(ConfirmPassword)){
            System.out.println("Your password has been validated");
        }else{
            System.out.println("Your password has not been validated ");
        }
    }
}
