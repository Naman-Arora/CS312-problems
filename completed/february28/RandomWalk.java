package completed.february28;

import java.util.Random;

public class RandomWalk {
    public static void main(String[] args) {
        randomWalk();
    }

    // Doesn't work according to Practice-It, but should:
    public static void failedRandomWalk() {
        Random random = new Random();
        int pos = 0;
        int maxPos = 0;
        while (pos < 3 && pos > -3) {
            System.out.println("position = " + pos);
            if (random.nextBoolean()) {
                pos++;
            } else {
                pos--;
            }

            maxPos = Math.max(pos, maxPos);
        }
        System.out.println("position = " + pos);
        System.out.println("max position = " + maxPos);
    }

    
    // Works according to Practice-It
    public static void randomWalk(){
        int pos = 0;
        int maxPos = 0;
        Random random = new Random();
        while ( pos < 3 && pos > -3 ) {
            System.out.println ("position = " + pos);
            if (!random.nextBoolean()) pos++;
            else pos--;
            maxPos = Math.max(pos, maxPos);
        }
        System.out.println ("position = " + pos);
        System.out.println ("max position = " + maxPos);
    }
}
