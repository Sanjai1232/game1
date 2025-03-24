import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to fing factorial");
        int num= in.nextInt();
        int result=0;
        int res=0;
        for (int i=0;i<=num;i++){
          result= result+i;
          res=result+i;
        }
        System.out.println("factorial for given number is"+result);
    }
}