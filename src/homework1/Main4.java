package homework1;
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args){
        //програма провіряе що б корчстувач вів число 0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть число");
        while (scanner.nextInt() != 0 ){
            System.out.println("спробуйте ще раз");
        }
        System.out.println("Вірно");
    }
}
