package oleksandr.smeshkin;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class newclasconstruktor {

  @Test
  private void metod() {
        constructor nnn  = new constructor("Лего",23.4f,74.4);
        List<String> mat = new ArrayList<>();
        mat.add("Орбіт");
        mat.add("23.4f");
        mat.add("74.4");
        System.out.println(nnn.getNnn()+" "+nnn.getJj()+ " "+ nnn.getKk() );

    }

}
