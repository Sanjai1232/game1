import java.util.Scanner;

public class maxnum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the element");
        int [] arr=new int[5];
        for (int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }
        int maxeven=Integer.MIN_VALUE;
        boolean check=false;
        for (int i=0;i< arr.length;i++)
        {
            if (arr[i]%2==0 && arr[i]>maxeven){
                maxeven=arr[i];
                check=true;
            }

        }
        if (check){
            System.out.println( "max even ="+maxeven);
        } else {
            System.out.println("no even number found");
        }

    }
}
