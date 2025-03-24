import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int sum=0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <=arr.length; i++) {
            sum = sum + i;
        }
        System.out.println("sum = "+ sum
        );
    }

//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]+"re ");
//        }
    }
