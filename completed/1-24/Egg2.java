public class Egg2 {
    public static void main(String args[]) {
        for (int i = 0; i < 2; i++) {
            topHalf();
            bottomHalf();
            mid();
        }
        bottomHalf();
        topHalf();
        mid();
        bottomHalf();
    }

    public static void topHalf() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void bottomHalf() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }

    public static void mid() {
        System.out.println("-\"-\'-\"-\'-\"-");
    }
}