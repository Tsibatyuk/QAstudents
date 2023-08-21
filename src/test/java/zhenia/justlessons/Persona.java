package zhenia.justlessons;

import abstractpages.BasePage;
import org.testng.annotations.Test;

public class Persona {

    public Persona(String name, int age, int langht, double weight, double lenghtOfTheDick) {
        this.name = name;
        this.age = age;
        this.langht = langht;
        this.weight = weight;
        this.lenghtOfTheDick = lenghtOfTheDick;
    }
    public Persona(String name, int age, int langht, double weight) {
        this.name = name;
        this.age = age;
        this.langht = langht;
        this.weight = weight;
    }

    public Persona(String name, int age, int langht) {
        this.name = name;
        this.age = age;
        this.langht = langht;
    }

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;
    int langht;

    public double getLenghtOfTheDick() {
        return lenghtOfTheDick;
    }

    public void setLenghtOfTheDick(double lenghtOfTheDick) {
        this.lenghtOfTheDick = lenghtOfTheDick;
    }

    double lenghtOfTheDick;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLanght(int langht) {
        this.langht = langht;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    double weight;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getLanght() {
        return langht;
    }

    public double getWeight() {
        return weight;
    }



}
