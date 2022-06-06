public class PrintSquare{
    public static void main(String[] args) {
        printSquare(1, 5);
    }
    public static void printSquare(int min, int max){
        int temp = min;
        for (int i = 0; i <= max-min; i++) {
            for (int j = min; j < max; j++) {
                
                while (min <= max){
                    System.out.print(min + "");
                    min++;
                }
                System.out.println();
                min = temp++;
            }
        }
    }
}