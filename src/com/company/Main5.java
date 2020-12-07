package com.company;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double D;
        Scanner scanner =new Scanner(System.in);
        System.out.println("програма вирішуе рівняння квадратного типу");
        System.out.println("a^2+bx+c=0");
        System.out.println("ведіть а");
        a =scanner.nextDouble();
        System.out.println("ведіть б");
        b =scanner.nextDouble();
        System.out.println("ведіть с");
        c =scanner.nextDouble();
        D =b * b - 4 * a * c;
        if (D>0){
            double x1;
            double x2;
            x1 = (-b -Math.sqrt(D)) / (2*a);
            x2 = (-b +Math.sqrt(D)) /(2*a);
            System.out.println("Корені рівняня х1=" + x1 + ";х2=" + x2 );
        }
        else if (D==0){
            double x;
            x = -b / (2*a);
            System.out.println("рівняння мае один корінь x=" + x);
        }
        else {
            System.out.println("Рівнняня не мае коренів");
        }
    }
}
