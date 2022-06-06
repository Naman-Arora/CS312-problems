package completed.february18;

import java.util.Scanner;

public class SmallestLargest {

    public static void main(String[] args) {
        smallestLargest();
    }

    public static void smallestLargest() {

        Scanner kb = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int len = kb.nextInt();
        int[] list = new int[len];

        for (int i = 1; i <= len; i++) {
            System.out.print("Number " + i + ": ");
            list[i - 1] = kb.nextInt();
        }

        int smallest = list[0];
        int largest = list[0];

        for (int i = 0; i < list.length; i++) {
            if (smallest > list[i]) {
                smallest = list[i];
            }
            if (largest < list[i]) {
                largest = list[i];
            }
        }

        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);

        kb.close(); // this line must be removed when inputting this answer into the Practice-It text box; otherwise the program will not work and errors will be thrown 
        
    }
}
