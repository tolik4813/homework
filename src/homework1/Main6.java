package homework1;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args){
        //Створіть масив, наповніть його даними з клавіатури, знайдіть найбільше та найменше значення масиву.
        Scanner scanner =new Scanner(System.in);
        System.out.println("ведіть розмір масиву");
        int size = scanner.nextInt();
        int[] a=new int[size];
        int max ;
        int min ;
        for (int i= 0;i<size;i++){
            System.out.println("");
            System.out.println("Ведіть дані в [" + i +"]блок");
            a [i] = scanner.nextInt();

        }
        max = a[0];
        min = a[0];

        for (int i = 0; i<a.length;i++){
            if (max < a[i]){
                max = a[i];
            }
            if (min > a[i]){
                min = a[i];
            }

        }
        System.out.println("max = "+ max);
        System.out.println("min = "+min);
    }
}
