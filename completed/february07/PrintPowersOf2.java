package completed.february07;
import java.lang.Math;

public class PrintPowersOf2 {
    public static void main(String[] args) {
        printPowersOf2(0);
        printPowersOf2(3);
        printPowersOf2(10);
    }
    public static void printPowersOf2(int n){
        String result = "1";
            for (int i = 1; i <= n; i++) {
                result = result + " " + (int)Math.pow(2 , i); 
            }
        System.out.println(result);
    }
}
