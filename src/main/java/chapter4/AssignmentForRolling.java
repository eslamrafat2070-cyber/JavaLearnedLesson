package chapter4;

import java.util.Random;

public class AssignmentForRolling {
    public static void main(String[] args) {
        Random random = new Random();
        int position = 0;        // مكان اللاعب على البورد
        int diceRoll;            // قيمة رمية النرد
        int spacesLeft = 20;     // عدد الخانات الباقية

        for (int i = 0; i < 5; i++) {
            diceRoll = random.nextInt(6) + 1;
            position += diceRoll;
            spacesLeft = 20 - position;

            System.out.println("Roll " + (i + 1) + ": You rolled a " + diceRoll);

            if (position == 20) {
                System.out.println("You reached exactly 20. 🎉 You won the game!");
                break;
            } else if (position > 20) {
                System.out.println("You reached " + position + " (over 20). ❌ You lost the game!");
                break;
            } else if (i == 4 && position < 20) {
                System.out.println("You reached " + position + ". ❌ You lost! You needed " + spacesLeft + " more to win.");
            } else {
                System.out.println("You are now on space " + position + ". You need " + spacesLeft + " more to reach 20.\n");
            }
        }
    }
}

