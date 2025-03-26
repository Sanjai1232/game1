import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to game");
        System.out.println("You are stucked in  a room plx choose any optio below");
        System.out.println("1.check desk which has a drawer");
        System.out.println("2.check the misterious box");
        System.out.println("3.UNlock the door");
        int result=in.nextInt();
       boolean key=false;
       boolean code=false;
       switch (result){
           case 1:
               System.out.println("you have pressed option 1");
               System.out.println("you found a note:'you have found a key' ");
               key=true;
               break;
               case 2:
               if (key==false){
                   System.out.println("the box is locked....Hmmmm something is missing");
               }
               else {
                   System.out.println("you have unlocked door");
                   System.out.println("your passcode is 726523 ");
                   System.out.println("note decode the passcode on your phone keypad");
                   code=true;
               }





    }
}}