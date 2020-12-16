package homework4.car;
public class Car {
    private String model;
    private int age;
    private int doors;
    private Rul rul;
    private Wheel wheel;
    private Body body;

    public Car(String model, int age, int doors, Rul rul, Wheel wheel, Body body) {
        this.model = model;
        this.age = age;
        this.doors = doors;
        this.rul = rul;
        this.wheel = wheel;
        this.body = body;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Rul getRul() {
        return this.rul;
    }

    public void setRul(Rul rul) {
        this.rul = rul;
    }

    public Wheel getWheel() {
        return this.wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Body getBody() {
        return this.body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void startEngin() {
        System.out.println("машина завелась");
    }

    public void repair() {
        this.body.setState("New");
        System.out.println("стан:" + this.body.getState());
    }
}