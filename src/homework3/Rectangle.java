package homework3;

public class Rectangle {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    Rectangle(int length, int width){
        this.length =length;
        this.width =width;
    }
    public void space(){
       int space= length *width;
        System.out.println("Площа прямокутника = " + space + " cм²");
    }
    public void perimeter(){
        int perimeter =(length+width)*2;
        System.out.println("Периметер прямокутника = " + perimeter + " cм");
    }
}
