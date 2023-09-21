package ilia.Project_Stream;

public class Person implements Comparable<Person>{
    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname, int age)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname()
    {return firstname;}
    public void setFirstname(String firstname)
    {this.firstname = firstname;}
    public String getLastname()
    {return lastname;}
    public void  setLastname(String lastname)
    {this.lastname = lastname;}
    public int getAge()
    {return age;}
    public void setAge()
    {this.age = age;}

    @Override
    public String toString()
    {
        return "Person{" +
                "firstname: " + firstname + "," +
                " lastname: " + lastname + ", " +
                "Age: " + age +
                "}";
    }

    @Override
    public int compareTo(Person o) {
        return firstname.compareTo(o.getFirstname());
    }
}
