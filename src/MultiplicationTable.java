import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        int number=obj.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number+"*"+i+"="+number*i);
        }
    }
}
