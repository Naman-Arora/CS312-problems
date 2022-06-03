package completed.february02;

public class NumbersOutput60 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 10; j++) {
                if ( j == 10 ){
                    System.out.print("|");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
        for (int n = 0; n < 6; n++) {
            for (int m = 1; m <= 10; m++) {
                if ( m == 10 ){
                    System.out.print("0");
                }
                else{
                    System.out.print(m);
                }
            }
        }
    }
}
