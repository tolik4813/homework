package homework5;

public class Warrior {
    private String name;
    private int hp;
    private String weapon;
    private int damage;
    private boolean isLife;

    public Warrior(String name,int hp, String weapon, int damage,boolean isLife) {
        this.name=name;
        this.hp = hp;
        this.weapon = weapon;
        this.damage = damage;
        this.isLife=isLife;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isLife() {
        return isLife;
    }

    public void setLife(boolean life) {
        isLife = life;
    }

    public void attack(Warrior target){
        target.setHp(target.getHp()-this.getDamage());
        System.out.println(this.getName()+" нанес персонажу "+target.getName()+ " урон = "+target.getDamage());
        System.out.println(" у персонажа "+target.getName()+" осталось "+ target.getHp()+" ед.здоровя ");
    }

}