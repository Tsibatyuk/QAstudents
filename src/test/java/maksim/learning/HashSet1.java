package maksim.learning;

import java.util.HashSet;

public class HashSet1 {
    HashSet<Integer> hs = new HashSet();

    public static void main(String[] args) {
        HashSet1 hsss = new HashSet1();
        hsss.hsAdd();
    }

    public void hsAdd() {
        hs.add(23);
        hs.add(25);
        hs.add(23);
        hs.add(33);
        hs.add(43);
        hs.add(221);
        hs.add(263);
        hs.add(23);
        for (Integer num : hs) {
            System.out.println(num);
        }
    }
}
