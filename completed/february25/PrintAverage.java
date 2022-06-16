package completed.february25;

import java.util.Scanner;

public class PrintAverage {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        printAverage(kb);

    }

    public static void printAverage(Scanner kb) {
        int currentNum = 0;
        int cnt = 0;
        double sum = 0;

        while (currentNum >= 0) {
            System.out.print("Type a number: ");
            currentNum = kb.nextInt();
            if (currentNum >= 0) {
                sum += currentNum;
                cnt++;
            }
        }

        if (cnt != 0) {
            System.out.println("Average was " + (sum / cnt));
        }

        kb.close(); // this line must be removed when inputting this answer into the Practice-It
                    // text box; otherwise the program will not work and errors will be thrown

    }
}
