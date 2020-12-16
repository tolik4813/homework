package homework5;
public class Main1 {
    public static void main(String[] args){
        Bowman bowman = new Bowman("Лучник",(int)(Math.random() * (200 - 100 + 1) + 100),"Лук",(int)(Math.random() * (50 - 40 + 1) + 40),true);
        Swordsman swordsman =new Swordsman("Мечник",(int)(Math.random() * (200 - 100 + 1) + 100),"Меч",(int)(Math.random() * (50 - 40 + 1) + 40),true);
        Knight knight =new Knight("Лицар",(int)(Math.random() * (200 - 100 + 1) + 100),"дворучний меч",(int)(Math.random() * (50 - 40 + 1) + 40),true);
        Cavalryman cavalryman = new Cavalryman("Наезник",(int)(Math.random() * (200 - 100 + 1) + 100),"Копьё",(int)(Math.random() * (50 - 40 + 1) + 40),true);
        Warrior[] team1 = new  Warrior [] {swordsman, knight};
        Warrior[] team2 = new Warrior[]{bowman, cavalryman};
        System.out.println("!!!Битва почалась!!!");
        System.out.println();
        do {
            attack(team1, team2);
            attack(team1, team2);
            if((!team1[1].isLife() && !team1[0].isLife()) || (!team2[1].isLife() && !team2[0].isLife() ))
                break;
        }
        while (true);
        if (!team1[0].isLife()&&!team1[1].isLife()) {
            System.out.println("team 2 win ");
        }
        else if(!team2[0].isLife()&&!team2[1].isLife())
        {
            System.out.println("team 1 win");
        }
        else
        {
            System.out.println("Draw!");
        }
    }
    public static void attack( Warrior []team1, Warrior []team2 )
    {
        int a = (int) (Math.random()*2);
        int b = (int) (Math.random()*2);
        int x = (int) (Math.random()*(200+1)) - 100;
        if(x%2==0)
        {
            if (team1[a].getHp()<=0){
                team1[a].setLife(false);

            }
            if (team2[b].isLife() && team1[a].isLife() ) {
                team1[a].attack(team2[b]);
            }
            if (team2[b].getHp()<=0){
                team2[b].setLife(false);
            }
            System.out.println();
            if (team2[b].isLife() && team1[a].isLife()) {
                team2[b].attack(team1[a]);
            }
        }
        else
        {
            if (team2[a].getHp()<=0){
                team2[a].setLife(false);

            }
            if (team2[b].isLife() && team1[a].isLife() ) {
                team2[a].attack(team1[b]);
            }
            if (team1[b].getHp()<=0){
                team1[b].setLife(false);

            }
            System.out.println();
            if (team2[b].isLife() && team1[a].isLife()) {
                team1[b].attack(team2[a]);
            }
        }
    }
}