package homework4.robot;

public class Main1 {
    public static void main(String[] args) {
        Robot robot = new Robot("робот");
        CoffeRobot coffeRobot = new CoffeRobot("бариста");
        RobotDancer robotDancer = new RobotDancer("танцор");
        RobotCooker robotCooker = new RobotCooker("повар");
        Robot[] robots = new Robot[]{robot, coffeRobot, robotDancer, robotCooker};

        for (int i = 0; i < 4; ++i) {
            robots[i].work();
        }

        System.out.println("---------------");
        robot.work();
        coffeRobot.work();
        robotDancer.work();
        robotCooker.work();
    }
}