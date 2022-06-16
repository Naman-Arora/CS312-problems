package completed.february28;

public class RandomWalk {
    public static void main(String[] args) {
        randomWalk();
    }
    public static void randomWalk(){
        int pos = 0;
        while(pos <= 3 && pos >= -3){
            System.out.println("Position = " + pos); 
            if(Math.random() > 0.5){
                pos++;
            }
            else{
                pos--;
            }
        }
    }
}
