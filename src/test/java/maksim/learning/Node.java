package maksim.learning;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Node {
    private static LinkedList<Integer> ll=new LinkedList<>();

    public void main() {

       ll.add(10);
       ll.add(21);
       ll.add(30);
       ll.add(22);

  List<Integer> evenNumbers=  ll.stream().filter(number -> number % 2 == 0)
                .collect(Collectors.toList());


        System.out.println("Числа, которые делятся на 2: " + evenNumbers);}


    ArrayList<String> fg=new ArrayList<>();

    public void ntg(){

        fg.add("Сашка");
        fg.add("Женька");
        fg.add("Оленка");
        fg.add("Владік");
        fg.add("Ілюшка");
        fg.add("Максімка");
        fg.add("Піся");




    String thirdElement = fg.stream().skip(3).findFirst().orElse(null);


    String lastElement = fg.stream().reduce((first, second) -> second).orElse(null);


    System.out.println("Третий элемент: " + thirdElement);
    System.out.println("Последний элемент: " + lastElement);


}}





