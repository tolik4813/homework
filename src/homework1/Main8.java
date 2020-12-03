package homework1;
import java.util.Scanner;
public class Main8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size;
        int size1 = 0;
        int size2 = 0;
        int n = 0;
        int q = 0;
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
                arayMinys[n] = aray[i];
                n++;
            }
        }
        int[] arayPlus = new int[size2];
        for (int i = 0; i < aray.length; i++) {
            if (aray[i]>0){
                arayPlus[q] = aray[i];
                q++;
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
