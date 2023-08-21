package olena.twoweeks;

public class Person1 {

    String name;
    String color;
    double weight;

    public Person1(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}