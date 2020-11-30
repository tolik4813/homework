package com.company;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть чило ");
        a = scanner.nextInt();
        if (a%2==0){
            System.out.println("парне");
        }
        else {
            System.out.println("непарне");
        }
    }
}
