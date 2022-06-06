package completed.february21;

import java.util.Scanner;

public class LongestName {
    public static void main(String[] args) {
        // Scanner console = new Scanner(System.in);
        longestName(new Scanner("roy\nDANE\nErik\nsTeFaNiE\nLaurA\n"), 5);
        longestName(new Scanner("TrEnt\nrita\nJORDAN\ncraig\nleslie\nYUKI\nTaNnEr\n"), 7);
    }

    public static void longestName(Scanner kb, int n) {
        String[] list = new String[n];
        int longestPos = 0;
        boolean isTie = false;

        for (int i = 1; i <= n; i++) {
            System.out.print("name #" + i + "? ");
            list[i - 1] = kb.nextLine();
        }

        String longestName = list[0];
        for (int i = 0; i < list.length; i++) {
            if (longestName.length() < list[i].length()) {
                longestName = list[i];
                longestPos = i;
            }
        }
        for (int i = 0; i < list.length; i++) {
            if ((longestName.length() == list[i].length()) && i != longestPos) {
                isTie = true;
            }
        }

        System.out.println(longestName.substring(0, 1).toUpperCase()
                + longestName.substring(1, longestName.length()).toLowerCase() + "'s name is longest");
        if (isTie) {
            System.out.println("(There was a tie!)");
        }
    }
}
