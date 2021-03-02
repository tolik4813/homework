package homework11;

public class Main {
    public static void main(String[] args) {
        Calkul Max =(a , b , c)-> a>b? (a>c? a:c):(b>c? b:c);
        Calkul Ser =(a , b , c)->(a+b+c)/3 ;
        Calkul Sum =(a , b , c)->a+b+c;
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println("максимальне значення");
        System.out.println(Max.math(a,b,c));
        System.out.println("середне значення");
        System.out.println(Ser.math(a,b,c));
        System.out.println("сума");
        System.out.println(Sum.math(a,b,c));

    }
}
