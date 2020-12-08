package homework2;
import java.util.Random;
public class Main3 {
    public static void main(String[] args){
        int[][] array =new int[5][7];
        Random random = new Random();
        for (int i =0;i<5;i++) {
            for (int j = 0; j < 7; j++)
                array[i][j] = random.nextInt(75)-2;
        }
            for (int i =0;i<5;i++){
                for (int j = 0;j<7;j++)
                    System.out.print(array[i][j] + " ");
                System.out.println();
            }
    }
}
