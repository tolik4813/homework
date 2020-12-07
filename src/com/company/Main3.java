package com.company;

import java.util.Scanner;

public class Main3  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter password");
        String password ;
        password =scanner.nextLine();
        switch (password){
            case("pass123"):{
                System.out.println("авторизований користувач");
                break;
            }
            case("admin"):{
                System.out.println("user Admin");
                break;
            }
            default:{
                System.out.println("неверний пароль");
                break;
            }
        }

    }
}
