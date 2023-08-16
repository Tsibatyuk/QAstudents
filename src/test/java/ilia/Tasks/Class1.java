package ilia.Tasks;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class1
{
    @Test


    public void task1()
    {
        List<String> fruit = new ArrayList<>();
        fruit.add("FRUIT");
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Grape");

        for(int i = 0; i < fruit.size(); i++)
        {
            System.out.println(fruit.get(i));
        }
    }
 @Test
    public void task2()
    {
        List <String> vegetable = new ArrayList<>();
        vegetable.add("VEGETABLE");
        vegetable.add("Carrot");
        vegetable.add("Potato");
        vegetable.add("Corn");
        vegetable.add("pea");

        for (int i = 0; i < vegetable.size(); i++)
        {
            System.out.println(vegetable.get(i));
        }
    }
    @Test
    public void task3()
    {
        List <String> productslist = new ArrayList<>();
        productslist.add("Banana");
        productslist.add("Apple");
        productslist.add("Orange");
        productslist.add("Grape");
        productslist.add("Carrot");
        productslist.add("Potato");
        productslist.add("Corn");
        productslist.add("Pea");
        Map<Integer, String> products = new HashMap<>();
        for (int i = 1; i <= productslist.size(); i++)
        {
            products.put(i,productslist.get(i - 1));
        }

        for(Map.Entry<Integer, String> entry : products.entrySet())
        {
            System.out.println("Products " + entry.getKey() + ": " + entry.getValue());
        }
    }
    @Test

    public void task4()
    {
        List <String> brandList = new ArrayList<>();
        brandList.add("Nike");
        brandList.add("Adidas");
        brandList.add("NB");
        brandList.add("Under Armour");
        for (int i = 0; i < brandList.size(); i++)
        {
            System.out.println( brandList.get(i));
        }

    }
    @Test
    public void task5()
    {
        int x = 4;

        if (x > 5)
            System.out.println("x більше за 5");
         else
            System.out.println("x не більше за 5");

    }

}
