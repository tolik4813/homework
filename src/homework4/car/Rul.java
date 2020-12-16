package homework4.car;
public class Rul {
    private String brand;
    private int diameter;

    public Rul(String brand, int diameter) {
        this.brand = brand;
        this.diameter = diameter;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void changeDiameter() {
        this.setDiameter(this.getDiameter() * 2);
        System.out.println("тепер діаметер руля = " + this.diameter);
    }
}