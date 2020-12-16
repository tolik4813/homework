package homework3;

public class Circle {
    private double  radius;
    private double diameter;
    Circle(){

    }
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
    public  double space(){
        double space = Math.PI*diameter;
        System.out.println("Площа кола =  " + space);
        return space;
    }
    public double circuit(){
        double circuit =Math.PI * 2* radius;
        System.out.println("Довжина кола = " + circuit);
        return circuit;
    }
   // public int perimeter () {
     //   return 2*(a+b);
    //}
}
