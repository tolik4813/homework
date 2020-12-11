package homework4.car;

public class Main1 {
    public static void main(String[] args) {
        homework4.car.Rul someRul = new homework4.car.Rul("jdm", 4);
        homework4.car.Wheel someWheel = new homework4.car.Wheel("jdm", 2);
        Body someBody = new Body("sedan", "black", "old");
        Car car = new Car("Mersedes", 6, 5, someRul, someWheel, someBody);
        car.repair();
        car.startEngin();
        someRul.changeDiameter();
        someWheel.pump();
        someBody.changeColor();
    }
}
