package homework12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        People people1 = new People("Jon",16,"m");
        People people2 = new People("Alica",19,"w");
        People people3 = new People("Ira",33,"w");
        People people4 = new People("Tolik",22,"m");
        People people5 = new People("Andriy",15,"m");
        People people6 = new People("Siri",18,"w");
        People people7 = new People("Ivan",24,"m");
        People people8 = new People("Igor",29,"m");
        ArrayList<People> people = new ArrayList<>(Arrays.asList(people1, people2, people3, people4, people5, people6, people7, people8));

        //вибрати війсково зобовязаних
        List<People> army = people
                .stream()
                .filter(s->s.getSex().contains("m"))
                .filter(s->s.getAge()>=18 && s.getAge()<=27)
                .collect(Collectors.toList());
        army.forEach(ff-> System.out.println(ff.toString()));
        //знайти середній вік чоловіків
        OptionalDouble serAge = people
                .stream()
                .filter(f->f.getSex().contains("m"))
                .mapToInt(elem->elem.getAge())
                .average();
        System.out.println("средній вік чоловіків :" + serAge.toString());
        //Знайти кількість потенційно працездатних людей у вибірці
//        int worker = people
//                .stream()
//                .


    }
}
