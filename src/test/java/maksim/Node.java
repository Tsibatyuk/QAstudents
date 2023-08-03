package maksim;

import java.util.LinkedList;

public class Node {

    private LinkedList<String> ll=new LinkedList<>();

    public static void main(String[] args) {
       Node node = new Node();
       node.ll.add("fire");
       node.ll.add("wather");
       node.ll.add("rain");
       node.ll.add("sun");
        System.out.println(node.ll.get(0));

    }

}



