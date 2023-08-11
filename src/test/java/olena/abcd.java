package olena;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class abcd {

    public static void main(String[] args) {

        List<Character> alphabet = new ArrayList<>();

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            alphabet.add(letter);
        }
        Map<Integer, String> abc = new HashMap<>();
        int counter = 1;
        for (int i = 0; i < alphabet.size(); i++) {
            if ((i + 1) % 2 == 0) {
                abc.put(counter, String.valueOf(alphabet.get(i)));
                counter++;
            }
        }
        for (Map.Entry<Integer, String> entry : abc.entrySet()) {
            System.out.println("Position: " + entry.getKey() + ", Letter: " + entry.getValue());
        }
    }
}
