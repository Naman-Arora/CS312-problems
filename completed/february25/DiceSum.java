package completed.february25;

import java.util.Scanner;

public class DiceSum {

    public static void main(String[] args) {
        diceSum();
    }

    public static void diceSum() {
        Scanner kb = new Scanner(System.in);

        int guessSum = 0;

        System.out.print("Desired dice sum: ");
        int sum = kb.nextInt();

        while (guessSum != sum) {
            int roll1 = (int) ((Math.random() * 6) + 1);
            int roll2 = (int) ((Math.random() * 6) + 1);
            guessSum = roll1 + roll2;

            System.out.println(roll1 + " and " + roll2 + " = " + guessSum);
        }

        kb.close(); // this line must be removed when inputting this answer into the Practice-It
                    // text box; otherwise the program will not work and errors will be thrown

    }
}
