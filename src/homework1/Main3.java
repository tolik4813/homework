package homework1;
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведіть число");
        int a = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a+"* "+ i +" ="+ a*i);
        }
    }
}
