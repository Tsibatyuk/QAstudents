package maksim.learning;

public class Person {
    String name;
    String color;
    double weigh;

    public Person(String name, String color, double weigh) {
        this.name = name;
        this.color = color;
        this.weigh = weigh;
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

    public double getWeigh() {
        return weigh;
    }

    public void setWeigh(double weigh) {
        this.weigh = weigh;
    }
}
