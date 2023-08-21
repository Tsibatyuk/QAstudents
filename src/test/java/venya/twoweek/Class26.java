package venya.twoweek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Class26 {
    public static void main(String[] args) {
        List<Character> qm = new ArrayList<>();



        for (char b = 'a'; b <= 'z'; b++) {
            qm.add(b);
        }
        Map<Integer, String> abc = new HashMap<>();
        int counter = 1;
        for (int i = 0; i <= qm.size(); i++) {
            if ((i + 1) % 2 == 0) {
                abc.put(counter, String.valueOf(qm.get(i)));
                counter++;
            }
        }
                for (Map.Entry<Integer, String> entry : abc.entrySet()) {
                    System.out.println("Position: " + entry.getKey() + ", b: " + entry.getValue());
                }
            }

        }


