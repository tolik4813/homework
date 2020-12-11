package homework4.car;

import java.util.Scanner;

public class Body {
    private String type;
    private String color;
    private String state;
    Scanner scanner;

    public Body(String type, String color, String state) {
        this.scanner = new Scanner(System.in);
        this.type = type;
        this.color = color;
        this.state = state;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void changeColor() {
        System.out.println("ведіть новий колір");
        this.setColor(this.scanner.nextLine());
        System.out.println("тепер машина " + this.color + " цвета");
    }
}