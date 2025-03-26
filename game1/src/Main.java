import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        boolean loop=true;
        boolean key=false;
        boolean code=false;
        while(loop){
        System.out.println("You are stucked in  a room plx choose any optio below");
        System.out.println("1.check desk which has a drawer");
        System.out.println("2.check the misterious box");
        System.out.println("3.UNlock the door");
            System.out.println("press 0 to exit");
            int ex=-1;
            if (ex==0){
                System.exit(0);
            }
        int result=in.nextInt();



       switch (result){
           case 1:
               System.out.println("you have pressed option 1");
               System.out.println("you found a note:'you have found a key' ");
               System.out.println("  ");
               System.out.println("  ");
               System.out.println("  ");
               key=true;
               break;
               case 2:
               if (key==false){
                   System.out.println("the box is locked....Hmmmm something is missing");
                   System.out.println("  ");
                   System.out.println("  ");
                   System.out.println("  ");
               }
               else {
                   System.out.println("you have unlocked door");
                   System.out.println("your passcode is 726523 ");
                   System.out.println("note decode the passcode on your phone keypad");
                   System.out.println("  ");
                   System.out.println("  ");
                   System.out.println("  ");
                   code=true;
               }
               break;
           case 3:
               if (key==false && code==false){
                   System.out.println("the box is locked....Hmmmm something is missing");
                   System.out.println("  ");
                   System.out.println("  ");
                   System.out.println("  ");
               }
               else if (key==true){
                   System.out.println(" you have key but you need code to unlock");
                   System.out.println("ooh shit ghost be like:enaku ithu pudikula");
                   System.out.println("  ");
                   System.out.println("  ");
                   System.out.println("  ");
               }
               else if (code==true)
               {
                   System.out.println("you need key to ulock this door");
                   System.out.println("  ");
                   System.out.println("  ");
                   System.out.println("  ");
               }
               else {
                   System.out.println("you have unloced the room ");
                   System.out.println("  ");
                   System.out.println("  ");
                   System.out.println("  ");
               }
               break;
           case 4:
               System.out.println("press 4 to exsit the game");
               loop=false;
               System.out.println("  ");
               System.out.println("  ");
               System.out.println("  ");
           default:
               System.out.println("invalid input ohhh wait the ghost arrived");
               System.out.println("  ");
               System.out.println("  ");
               System.out.println("  ");
    }
}
}
}