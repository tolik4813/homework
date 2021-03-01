package homework9;

import java.util.Comparator;

public class Commodity {
    private String name;
    private  int  length;//довжина
    private  int width;//ширина
    private  int weight;//вага

    public Commodity(String name, int length, int width, int weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static class ComparatorByName implements Comparator<Commodity>{

        @Override
        public int compare(Commodity o1, Commodity o2) {
            int res = o1.getName().compareTo(o2.getName());
            return res;
        }
    }

    public static class ComparatorByLength implements Comparator<Commodity>{

        public int compare(Commodity o1, Commodity o2)
        {
            if (o1.getLength() > o2.getLength()) {
                return 1;
            } else if (o1.getLength() < o2.getLength()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static class ComparatorByWidth implements Comparator<Commodity>{

        @Override
        public int compare(Commodity o1, Commodity o2) {

            if (o1.getWidth() > o2.getWidth()) {
                return 1;
            } else if (o1.getWidth() < o2.getWidth()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static  class ComparatorByWeight implements Comparator<Commodity>{
        @Override
        public int compare(Commodity o1, Commodity o2) {

            if (o1.getWeight() > o2.getWeight()) {
                return 1;
            } else if (o1.getWeight() < o2.getWeight()) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}
