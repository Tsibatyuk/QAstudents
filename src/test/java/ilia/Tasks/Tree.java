package ilia.Tasks;

import org.testng.annotations.Test;
import org.testng.util.Strings;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    public static void main(String[] args)
    {
        int height = 5;
        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < height - i - 1; j++)
            {
                System.out.print(" ");
            }
            System.out.println("*".repeat(2 * i + 1));
        }
    }

}
