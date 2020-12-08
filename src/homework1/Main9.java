package homework1;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведіть розмір трикутника");
        int n = scanner.nextInt();
        int num = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");

        }
    }
}



