package homework3;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Rectangle rectangle1 =new Rectangle(0,0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть довжину");
        rectangle1.setLength(scanner.nextInt());
        System.out.println("Ведіть ширину");
        rectangle1.setWidth(scanner.nextInt());
        rectangle1.space();
        rectangle1.perimeter();
        System.out.println("----------------------");
        Circle circle1 =new Circle(0,0);
        System.out.println("Ведіть радіус");
        circle1.setRadius(scanner.nextDouble());
        circle1.setDiameter(circle1.getRadius()*2);
        circle1.space();
        circle1.circuit();
    }
}
