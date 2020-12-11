package homework4.car;
public class Wheel {
    private String brand;
    private int pressure;

    public Wheel(String brand, int pressure) {
        this.brand = brand;
        this.pressure = pressure;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPressure() {
        return this.pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void pump() {
        this.setPressure(this.getPressure() + 1);
        System.out.println("ви підкачали колеса тепер тиск =" + this.pressure + " атмосфери");
    }
}