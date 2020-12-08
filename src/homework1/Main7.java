package homework1;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){
        //Створіть масив, наповніть його даними з клавіатури, знайдіть суму елементів масиву.
        Scanner scanner =new Scanner(System.in);
        System.out.println("ведіть розмір масиву");
        int size = scanner.nextInt();
        int[] a=new int[size];
        for (int i= 0;i<size;i++){
            System.out.println("");
            System.out.println("Ведіть дані в [" + i +"]блок");
            a [i] = scanner.nextInt();
        }
        int sum=0;
        for (int i=0;i<size;i++){
            sum += a[i];
        }
        System.out.println(sum);
    }
}
