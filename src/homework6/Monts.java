package homework6;
public enum Monts {
    JANUARY(Sezon.Winter, 31, "январь"), FEBRUARY(Sezon.Winter, 28, "февраль"),
    MARCH(Sezon.Spring, 31, "март"), APRIL(Sezon.Spring, 30, "апрель"),
    MAY(Sezon.Spring, 31, "май"), JUNE(Sezon.Summer, 30, "июнь"),
    JULY(Sezon.Summer, 31, "июль"), AUGUST(Sezon.Summer, 31, "август"),
    SEPTEMBER(Sezon.AUTUMN, 30, "сентябрь"), OCTOBER(Sezon.AUTUMN, 31, "октябрь"),
    NOVEMBER(Sezon.AUTUMN, 30, "ноябрь"), DECEMBER(Sezon.Winter, 31, "декабрь");
    String titel;
    Sezon sezon;
    int day;
    Monts(Sezon sezon, int day, String titel) {
        this.sezon = sezon;
        this.day = day;
        this.titel = titel;
    }
    public Sezon getSezon() {
        return sezon;
    }
    public int getDay() {
        return day;
    }
    public String getTitel() {
        return titel;
    }
    public static Monts fromString(String montsString) {
        for (Monts monts : values()) {
            if (monts.name().equalsIgnoreCase(montsString) || monts.getTitel().equalsIgnoreCase(montsString)) {
                return monts;
            }
        }
        return null;
    }
    public static void Season(String montsString) {
        Monts mons =  fromString(montsString);
        System.out.println(mons.getSezon());
    }
    public static void Day(String montsString) {
        for (Monts monts : values()) {
            if (monts.name().equalsIgnoreCase(montsString) || monts.getTitel().equalsIgnoreCase(montsString)) {
                for (Monts monts1 : values()) {
                    if (monts1.getDay() == monts.getDay()) {
                        System.out.println(monts1);
                    }
                }
            }
        }
    }
    public static void minusDay(String montsString) {
        for (Monts monts : values()) {
            if (monts.name().equalsIgnoreCase(montsString) || monts.getTitel().equalsIgnoreCase(montsString)) {
                for (Monts monts1 : values()) {
                    if (monts1.getDay() < monts.getDay()) {
                        System.out.println(monts1);
                    }
                }
            }
        }
    }
    public static void plusDay(String montsString) {
        for (Monts monts : values()) {
            if (monts.name().equalsIgnoreCase(montsString) || monts.getTitel().equalsIgnoreCase(montsString)) {
                for (Monts monts1 : values()) {
                    if (monts1.getDay() > monts.getDay()) {
                        System.out.println(monts1);
                    }
                }
            }
        }
    }
    public static void parnyiLiDay(String montsString) {
        if (fromString(montsString).getDay()%2==0){
            System.out.println("");
            System.out.println("в веденому місяці парна кількість днів");
        }else {
            System.out.println("");
            System.out.println("в веденому місяці непарна кількість днів");
        }
    }
    public static void vsiParni() {
        for (Monts monts : values()) {
         if (monts.getDay()%2==0){
             System.out.println(monts.name());
         }
        }
    }
    public static void vsiNeparni() {
        for (Monts monts : values()) {
            if (monts.getDay()%2!=0){
                System.out.println(monts.name());
            }
        }
    }
    public  static void nextSeason(String montsString){
        int a =fromString(montsString).getSezon().ordinal();
        Sezon[] sezons =Sezon.values();
            System.out.println(sezons[a+1]);
    }
    public  static void minusSeason(String montsString){
        int a =fromString(montsString).getSezon().ordinal();
        Sezon[] sezons =Sezon.values();
        System.out.println(sezons[a-1]);
    }
    public static void allMetod(String montsString){
        Monts.fromString(montsString);
        System.out.println("-----------------------------------------");
        System.out.println("Пора року");
        Monts.Season(montsString);
        System.out.println("-----------------------------------------");
        System.out.println("Місяці які мають таку ж кількість днів");
        Monts.Day(montsString);
        System.out.println("-----------------------------------------");
        System.out.println("Місяці які мають меньшу кількість днів");
        Monts.minusDay(montsString);
        System.out.println("-----------------------------------------");
        System.out.println("Місяці які мають більшу кулькість днів");
        Monts.plusDay(montsString);
        System.out.println("-----------------------------------------");
        System.out.println("Парна чи непрана кількість днів у веденму місяці:");
        Monts.parnyiLiDay(montsString);
        System.out.println("-----------------------------------------");
        System.out.println("Виводить всі парні місяці");
        Monts.vsiParni();
        System.out.println("-----------------------------------------");
        System.out.println("Виводить всі непарні місяці");
        Monts.vsiNeparni();
        System.out.println("-----------------------------------------");
        System.out.println("Наступна пора року");
        Monts.nextSeason(montsString);
        System.out.println("-----------------------------------------");
        System.out.println("Попередня пора року");
        Monts.minusSeason(montsString);

    }
}







