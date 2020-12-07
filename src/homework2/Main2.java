package homework2;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int[] array = new int[5];
        for (int i= 0;i<5;i++) {
            System.out.println("");
            System.out.println("Ведіть дані в [" + i + "]блок");
            array[i] = scanner.nextInt();
        }
        for (int i = 4;i >=0;i--){

            System.out.print(array[i]+" ");
        }
    }
}
