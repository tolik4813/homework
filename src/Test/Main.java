package Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException , NotFoundDevice {
        Scanner scanner = new Scanner(System.in);
        List<String> ss = Files.lines(Path.of("/Users/ivanlegotin/Desktop/Test.txt")).collect(Collectors.toList());
        List<Device> devices = new ArrayList<>();

            for (int i = 0; i < ss.size(); i++) {

                String[] parse = ss.get(i).split(", ");
                devices.add(new Device(Long.parseLong(parse[0]), parse[1], parse[2], Integer.parseInt(parse[3])));
                System.out.println(devices.get(i));
            }

        while (true){
            System.out.println(
                    "\n1 - Вивести весь список на екран." +
                    "\n2 - Шукати Device за серійним номером " +
                    "\n3 - Вивести посортований список за назвою бренду." +
                    "\n4 - Вивести лише ті Device у яких ціна більша ніж 400." +
                    "\n5 - Вивести лише ті Device у яких в серійному номері є нуль(0) і ціна менша за 800." +
                    "\n6 - Вивести найдорожчий товар." +
                    "\n0 - Вихід з програми.");
            String select = scanner.next();
            switch (select){
                case"1":{
                    devices.forEach(System.out::println);
                    break;
                }
                case "2":{
                    System.out.println(serialNUmberFinder(devices));
                    break;
                }
                case "3":{
                  sortByBrand(devices);
                    break;
                }
                case "4":{
                    more400(devices);
                    break;
                }
                case "5":{
                   filtrContains0And800(devices);
                    break;
                }
                case "6":{
                    bigMoney(devices);
                    break;
                }

                default:{
                    System.exit(0);
                }
            }
        }
    }

    static void sortByBrand(List<Device> list)
    {
        list = list.stream().sorted(Comparator.comparing(Device::getBrand)).collect(Collectors.toList());


        System.out.println(list);
    }
    static Device serialNUmberFinder(List<Device> list) throws NotFoundDevice {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть серійний номер");
        long serial =scanner.nextLong();
        return list.stream().filter(e->e.getSerialNumber()==serial).findFirst().orElseThrow(() -> new NotFoundDevice( ));
    }
    static void filtrContains0And800(List<Device> list)
    {
        System.out.println(list.stream().filter(e->String.valueOf(e.getSerialNumber()).contains("0") && e.getPrice()<=800).collect(Collectors.toList()));
    }

    static void bigMoney(List<Device> list)
    {
        int bigMoney = list.stream().reduce( 0, (s1, s2) -> s1 = s1> s2.getPrice()? s1: s2.getPrice(), (s1, s2) ->s1+s2);
        for ( Device elem:list) {
            if (elem.getPrice()==bigMoney){
                System.out.println(elem);
            }
        }
    }

    static void more400(List<Device> list)
    {
        System.out.println( list.stream().filter(e->e.getPrice()>=400).collect(Collectors.toList()).toString());
    }

}


