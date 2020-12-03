package com.company;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ведіть число a");
        a = scanner.nextDouble();
        System.out.println("ведіть число b");
        b= scanner.nextDouble();
        a = a - 10;
        b = b - 10;
        if (Math.abs(a)<Math.abs(b)) {
            System.out.println(a+10);
        }
        else if(Math.abs(a)==Math.abs(b)){
            System.out.println("однаково відаленні числа");
        }
        else
        {System.out.println(b+10);}

    }
}
