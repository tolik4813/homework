package classwork;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ведіть кількість грошей");
    int grn = scanner.nextInt();
        System.out.println("Ведіть проценти");
    int proz =scanner.nextInt();
        System.out.println("Ведіть кількість років");
    int years = scanner.nextInt();
    int sum=0;
            for (int i=0; i <years; i++){
            int plus =(grn/100)*proz;
            sum+=plus ;
        }
        System.out.println(sum+grn);
    }
}
