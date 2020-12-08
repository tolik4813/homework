package homework3;

public class Circle {
    private double  radius;
    private double diameter;
    Circle(double radius,double diameter){
        this.radius=radius;
        this.diameter=diameter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    public  void space1(){
        double space = Math.PI*diameter;
        System.out.println("Площа кола =  " + space);
    }
    public void circuit(){
        double circuit =Math.PI * 2* radius;
        System.out.println("Довжина кола = " + circuit);
    }
}
