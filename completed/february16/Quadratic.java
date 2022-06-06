package completed.february16;

public class Quadratic {
    public static void main(String[] args) {
        quadratic(1, -7, 12);
        quadratic(1, 3, 2);
    }

    public static void quadratic(int a, int b, int c) {

        double firstRoot = ((-1 * (b)) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double secondRoot = ((-1 * (b)) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First root = " + firstRoot);
        System.out.println("Second root = " + secondRoot);
    }
}
