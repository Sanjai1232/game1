import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = 0;
        int s = 1;
        int t;
        System.out.print(f + ",");
        System.out.print(s + ",");
        for (int i = 3; i <= n; i++) {
            t = f + s;
            System.out.print(t + ",");
            f = s;
            s = t;
        }
    }
}