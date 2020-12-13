package homework5;

public class Cavalryman extends Warrior {
    public Cavalryman(String name,int hp, String weapon, int damage,boolean isLife) {
        super(name,hp, weapon, damage,isLife);
    }
    @Override

    public void attack(Warrior target){
       target.setHp(target.getHp()-this.getDamage());
       System.out.println(this.getName()+" нанес персонажу "+target.getName()+ " урон = "+target.getDamage());
       System.out.println(" у персонажа "+target.getName()+" осталось "+ target.getHp()+" ед.здоровя ");
    }
}

