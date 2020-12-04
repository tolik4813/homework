package homework1;
import java.util.Scanner;
public class Main8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size;//розмір основного масиву
        int size1 = 0;//розмір відємного масиву
        int size2 = 0;// розмір додатнього масиву
        int minus = 0;//порядковий номер елементу у відемному масиві
        int plus = 0;// порядковий номер елементу у додатьньому масиві
        System.out.println("enter size");
        size = scanner.nextInt();
        int[] aray = new int[size];
        for (int i = 0; i < aray.length; i++) {
            System.out.println("enter n" + i + "=");
            aray[i] = scanner.nextInt();
            if (aray[i]<0){
                size1++;
            }
            if (aray[i]<0){
                size2++;
            }
        }
        int[] arayMinys = new int[size1];
        for (int i = 0; i < aray.length; i++) {
            if (aray[i]<0){
                arayMinys[minus] = aray[i];
                minus++;
            }
        }
        int[] arayPlus = new int[size2];
        for (int i = 0; i < aray.length; i++) {
            if (aray[i]>0){
                arayPlus[plus] = aray[i];
                plus++;
            }
        }
        System.out.println("Мінус:");
        for (int i = 0;i<arayMinys.length;i++){
            System.out.println(arayMinys[i]);
        }
        System.out.println("Плюс");
        for (int i = 0;i<arayPlus.length;i++){
            System.out.println(arayPlus[i]);
        }
    }
}
