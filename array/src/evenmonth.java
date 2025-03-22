import java.util.Scanner;

public class evenmonth {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the number days in the month ");
         int n= in.nextInt();
         int count=0;
        for (int i = 1; i<=n; i++) {
            if (i%2==0)
            {
                count++;
            }
        }
        System.out.println("thr number of days can kunal go for playing is "+ count);
    }
}
