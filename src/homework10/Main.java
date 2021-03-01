package homework10;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<Person, List<Animal>> zooClub = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1-додати людину до клубу" +
                               "\n2-додати тваринку до людини" +
                               "\n3-забрати тваринку в людини" +
                               "\n4-видалити людину з клубу" +
                               "\n5-вивести на екран зооклуб" +
                               "\n0-Вийти з програми ");
            String choice =scanner.next();
            switch (choice) {
                case "1": {//додає людину до клубу
                    System.out.println("ведіть імя людини");
                    String name = scanner.next();
                    System.out.println("ведіть вік людини");
                    int age = scanner.nextInt();
                    zooClub.put(new Person(name, age), new ArrayList<>());
                    break;
                }
                case "2": {//додает тварину до людини
                    System.out.println("Ведіть імя учасника");
                    String name = scanner.next();
                    System.out.println("Ведіть вік учасника");
                    int age = scanner.nextInt();
                    Person person = new Person(name, age);
                    if (zooClub.containsKey(person)) {

                        System.out.println("Ведіть імя тваринки");
                        String nickname = scanner.next();
                        System.out.println("Ведіть тип тваринки");
                        String vid = scanner.next();
                        zooClub.get(person).add(new Animal(nickname, vid));
                    } else
                        System.out.println("Такого участника не существует!");
                    break;
                }
                case "3": {
                    System.out.println("Ведіть імя учасника");
                    String name = scanner.next();
                    System.out.println("Ведіть вік учасника");
                    int age = scanner.nextInt();
                    Person person = new Person(name, age);
                    if (zooClub.containsKey(person)) {
                        System.out.println("Ведіть імя тваринки");
                        String nickname = scanner.next();
                        System.out.println("Ведіть тип тваринки");
                        String vid = scanner.next();
                        Animal animal = new Animal(nickname, vid);
                        zooClub.get(person).remove(zooClub.get(person).indexOf(animal));
                    } else {
                        System.out.println("Питомец не найден!");
                    }
                    break;
                }
                case "4": {
                    System.out.println("Ведіть імя учасника");
                    String name = scanner.next();
                    System.out.println("Ведіть вік учасника");
                    int age = scanner.nextInt();

                    Person person = new Person(name, age);
                    if (zooClub.containsKey(person)) {
                        zooClub.remove(person);
                    } else {
                        System.out.println("Участника не найдено!");
                    }
                    break;
                }
                    case "5": {
                        Set<Person> keySet = zooClub.keySet();
                        for (Person key : keySet) {
                            for (Animal animal : zooClub.get(key)) {
                                System.out.println(key.toString() + " " + animal.toString());
                            }
                            if (zooClub.get(key).isEmpty()) {
                                System.out.println(key);
                            }
                        }
                        if (zooClub.isEmpty()) {
                            System.out.println("Участника не найдено!");
                        }
                        break;
                    }

                default: {
                    System.exit(0);
                }
              }
            }
        }
    }
