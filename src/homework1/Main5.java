package homework1;


import java.util.Scanner;

public class Main5 {
    public static void main(String[] args){
        // програма перевіряє щоб користувач дав правильну відповідь
        System.out.println("8 * 9 = ");
        System.out.println("Ведіть відповідь");
        Scanner scanner = new Scanner(System.in);
        while ( scanner.nextInt() != 72){
            System.out.println("Спробуйте ще раз");
        }
        System.out.println("Вірно");
    }
}

