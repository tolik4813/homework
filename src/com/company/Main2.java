package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("ведіть день тижня");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        switch (day){
            case ("понеділок") :{
                System.out.println("1)зустріч о 17:00 2)іт курси 19:30");
                break;
            }
            case("вівторок"):{
                System.out.println("1)універ 8:30 2)кафе с родителями 17:00");
                break;
            }
            case("середа"):{
                System.out.println("1)поїхати на дачу 13:00 2)прогулка с друзями  21:00");
                break;
            }
            case("четверг"):{
                System.out.println("1)зделать дз 2) пойти в зал 14:00 ");
                break;
            }
            case ("пятница"):{
                System.out.println("1)іт курси 14:00 2)встреча 17:00");
                break;
            }
            case("субота"):{
                System.out.println("отдих");
                break;
            }
            case("неділя"): {
                System.out.println("отдих");
                break;
            }
            default:{
                System.out.println("некоректний написаний день");
                break;
            }

        }

    }
}
