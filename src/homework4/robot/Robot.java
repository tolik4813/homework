package homework4.robot;

public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Я робот-я просто працюю");
    }
}