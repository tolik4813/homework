package homework4.animal;

public class Main1 {
    public static void main(String[] args) {
        Animal animal = new Animal("monkey", 13, 8);
        System.out.println("Назва тварини = " + animal.getName() + " Швидкість тварини = " + animal.getSpeed() + " км/год  Вік тварини = " + animal.getAge() + " років");
        animal.setName("Lion");
        animal.setSpeed(30);
        animal.setAge(4);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Назва тварини = " + animal.getName() + " Швидкість тварини = " + animal.getSpeed() + " км/год  Вік тварини = " + animal.getAge() + " років");
    }
}