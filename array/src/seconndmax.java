import java.util.Scanner;

public class seconndmax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enetr or elements");
        int[] arr=new int[5];
        for (int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }
        int max1=Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;
        int max3 =Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max1){
                max3=max2;
                max2=max1;
                max1=arr[i];
            } else if (arr[i]>max2){
                max3=max2;
                max2=arr[i];
            }
            else if (arr[i]>max3 && arr[i]!=max1 && arr[i]!=max2){
                max3=arr[i];
            }
        }
        System.out.println("first number" +" "+ max1);
        System.out.println("second largest" +" "+max2);
        System.out.println("third number"+ " "+max3);
    }
}
