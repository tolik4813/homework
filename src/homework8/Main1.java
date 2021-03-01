package homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws zeroLength {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        String a = "";
        zeroLength zero = new zeroLength("ви не вели жодного слова");

        while (!words.contains("break")) {

            System.out.println("ведіть слово");
            a = scanner.nextLine();
            words.add(a);
        }
        words.remove(a);
        try {
            if (words.isEmpty())
                throw zero;
        } catch (homework8.zeroLength zeroLength) {
            zeroLength.printStackTrace();
        }
        System.out.println("всі слова");
        System.out.println(words + " ");
        System.out.println("слова які починаються на s");
        for (Object name : words) {

            if (name.toString().startsWith("s")) {
                System.out.println(name);
            }
        }
        System.out.println("всі слова довше пяти символів");
        for (Object name : words) {
            if (name.toString().length() >= 5) {
                System.out.println(name);
            }
        }
        System.out.println("");
        System.out.println("перевірка чи в лісті більше 5 елементів");
        if (words.size() > 5)
            words = (ArrayList<String>) words.subList(0, 4);

        for (int i = 0; i < words.size(); ++i) {
            System.out.println(words.get(i));
        }
    }
}

