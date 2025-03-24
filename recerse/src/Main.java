import java.util.*;
public class Main {
    public static void main(String[] args) {
        rec();
        rec();

    }

    static void rec() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to be reversed");
        int num1 = in.nextInt();
        int reversed = 0;
        while (num1 != 0) {
            int temp = num1 % 10;
            reversed = reversed * 10 + temp;
            num1 = num1 / 10;

        }
        System.out.println(reversed);
    }
}

