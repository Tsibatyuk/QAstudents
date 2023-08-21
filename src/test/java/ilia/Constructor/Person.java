package ilia.Constructor;

import static java.lang.System.*;

public class Person
{
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private String name;
    private int age;
    private double weight;
    private double height;
    private String country;

    public Person(String name, int age, double weight, double height, String country)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.country = country;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getHeight()
    {
        return height;
    }

    public String getCountry()
    {
        return country;
    }


}
