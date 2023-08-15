package maksim;

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

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        /*people.add(new Person("Анна", 30, "Ж"));
        people.add(new Person("іван", 28, "М"));
        people.add(new Person("Марія", 22, "Ж"));
        people.add(new Person("Петька", 35, "М"));
        people.add(new Person("Екатерина", 26, "Ж"));*/

        List<String> filtered = people.stream()
                .filter(person -> person.getAge() > 25)
                .sorted(Comparator.comparing(Person::getName))
                .map(person -> person.getName() + " "+person.getGender()+" - " + person.getAge())
                .collect(Collectors.toList());

        filtered.forEach(System.out::println);

    public void setWeigh(double weigh) {
        this.weigh = weigh;
}
    }
}
