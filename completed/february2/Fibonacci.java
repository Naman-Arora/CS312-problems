package completed.february2;

public class Fibonacci{
    public static void main(String[] args) {
        int oneStepBack = 1;
        int twoStepsBack = 1;
        for (int i = 0; i < 12; i++) {
            if( i < 2 ){
                System.out.print("1 ");
            }
            else{
                int result = oneStepBack + twoStepsBack;
                System.out.print(result + " ");
                twoStepsBack = oneStepBack;
                oneStepBack = result;
            }
        }
    }
}