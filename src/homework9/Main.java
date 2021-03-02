package homework9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Commodity> commodities = new ArrayList<>();
        Commodity commodity = new Commodity("ноутбук", 13, 15, 3);
        Commodity commodity1 = new Commodity("планшет", 9, 8, 1);
        Commodity commodity2 = new Commodity("книжка", 10, 13, 2);
        commodities.add(commodity);
        commodities.add(commodity1);
        commodities.add(commodity2);
        while (true) {
            System.out.println(
                    "\n1 - додати товар" +
                    "\n2 - видалити товар" +
                    "\n3 - замінити товар" +
                    "\n4 - вивести всі товари на екран" +
                    "\n5 - вивести на екран товар за номером елемента" +
                    "\n6 - сортувати за іменем " +
                    "\n7 - сортувати за довжиною " +
                    "\n8 - сортувати за шириною" +
                    "\n9 - сортувати за вагою " +
                    "\n10 - вивести на екран з усіма характеристиками"+
                    "\n0 - вийти з програми");
            String select = scanner.next();
            switch (select) {
                case "1": {// додати товар
                    System.out.println("ведіть назву товару");
                    String name = scanner.next();
                    System.out.println("ведіть довжину товару");
                    int length = scanner.nextInt();
                    System.out.println("ведіть ширину товару");
                    int width = scanner.nextInt();
                    System.out.println("ведіть вагу товару");
                    int weight = scanner.nextInt();
                    commodities.add(new Commodity(name, length, width, weight));
                    break;
                }
                case "2": {// видалити товар
                    System.out.println("ведіть назву товару який треба видалити");
                    String word = scanner.next();
                    for (Commodity comd : commodities) {
                        if (comd.getName().equals(word)) {
                            commodities.remove(comd);
                            break;
                        }
                    }
                    break;
                }
                case "3": {// замінити товар
                    System.out.println("ведіть порядковий номер товару який ви хочете замінити");
                    int index = scanner.nextInt();
                    System.out.println("ведіть назву нового товару");
                    String name = scanner.next();
                    System.out.println("ведіть довжину");
                    int lenght = scanner.nextInt();
                    System.out.println("ведіть ширину");
                    int width = scanner.nextInt();
                    System.out.println("ведіть вагу");
                    int weight = scanner.nextInt();
                    commodities.set(index, new Commodity(name, lenght, width, weight));
                    break;
                }
                case "4": {//вивести всі товари на екран
                        for (Commodity c :
                                commodities) {
                            System.out.println("Назва: " + c.getName());
                        }
                        break;
                }
                case "5":{//вивести товар за номером елемента
                    System.out.println("ведіть номер елемента який хочете вивети на екран ");
                    int index = scanner.nextInt();
                    System.out.println("Назва: " + commodities.get(index).getName());
                    break;
                }
                case "6":{//сортувати за іменем
                    Commodity.ComparatorByName comparator1 = new Commodity.ComparatorByName();
                    Collections.sort(commodities, comparator1);

                    break;
                }
                case "7":{//сортувати за довжиною
                    Commodity.ComparatorByLength comparator2 = new Commodity.ComparatorByLength();
                    Collections.sort(commodities,comparator2);
                    break;
                }
                case "8":{//сортувати за шириною
                    Commodity.ComparatorByWidth comparator3 = new Commodity.ComparatorByWidth();
                    Collections.sort(commodities,comparator3);
                    break;
                }
                case "9":{//сортувати за вагою
                    Commodity.ComparatorByWeight comparator4 = new Commodity.ComparatorByWeight();
                    Collections.sort(commodities,comparator4);
                    break;
                }
                case "10":{//вивести на екран всі товари і характеристики
                    for (Commodity c :
                            commodities) {
                        System.out.println("Назва: " + c.getName() + " Довжина: "+c.getLength()+" Ширина: "+c.getWidth()+" Вага: "+c.getWeight());
                    }
                    break;
                }
                default:{
                    System.exit(0);
                }

            }
        }
    }
}


