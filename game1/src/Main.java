import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("🔒 Welcome to the Escape Room Game! 🔥");
        System.out.println("You are stuck in a mysterious room. Choose any option below to explore:");

        boolean key = false;
        boolean code = false;

        while (true) {
            System.out.println("\n1. Check the desk with a drawer");
            System.out.println("2. Check the mysterious box");
            System.out.println("3. Unlock the door");
            System.out.println("4. Quit the game");

            int result = in.nextInt();

            switch (result) {
                case 1:
                    System.out.println("\n🔍 You chose to check the desk...");
                    System.out.println("✨ You found a note: 'You have found a key!' 🔑");
                    key = true;
                    break;

                case 2:
                    if (!key) {
                        System.out.println("\n🔒 The box is locked... Hmmm... something is missing.");
                    } else {
                        System.out.println("\n📦 You have unlocked the box!");
                        System.out.println("📜 Inside, you found a note: 'The passcode is 726523'");
                        System.out.println("📱 Hint: Decode the passcode on your phone keypad.");
                        code = true;
                        System.out.println("enter the decoded pass code");
                        String decode=in.next().toLowerCase();
                        if (decode.equals("sanjai")){
                            System.out.println("correct");
                        }
                        else {
                            System.out.println("ghost be like thappu  vanthu oombu"
                            );
                        }
                    }
                    break;

                case 3:
                    if (key && code) {
                        System.out.println("\n🎉 Congratulations! You unlocked the door and escaped successfully! 🚪");
                        System.out.println("🏆 You have completed the game!");
                        System.exit(0);
                    }
                    else if (!key && !code) {
                        System.out.println("\n🚪 The door is locked... Hmm... something is missing.");
                    }
                    else if (key) {
                        System.out.println("\n🗝️ You have the key but need the code to unlock.");
                        System.out.println("👻 Ooh shit! Ghost be like: 'Enaku ithu pudikula!' 😱");
                    }
                    else if (code) {
                        System.out.println("\n🔢 You have the code but need the key to unlock the door.");
                    }
                    break;

                case 4:
                    System.out.println("\n👋 Exiting the game... Better luck next time! 😢");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n⚠️ Invalid input! Ohhh wait... the ghost has arrived! 👻");
            }
        }
    }
}
