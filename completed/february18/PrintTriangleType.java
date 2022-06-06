package completed.february18;

public class PrintTriangleType {
    public static void main(String[] args) {
        printTriangleType(5, 7, 7);
        printTriangleType(6, 6, 6);
        printTriangleType(5, 7, 8);
        printTriangleType(12, 18, 12);
    }

    public static void printTriangleType(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("equilateral");
        }
        else if((a == b && b != c) || (b == c && a != c) || (a == c && b != c)){
            System.out.println("isosceles");
        }
        else{
            System.out.println("scalene");
        }
    }
}
