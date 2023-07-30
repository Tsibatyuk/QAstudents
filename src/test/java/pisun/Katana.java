package pisun;


import org.testng.annotations.Test;


public class Katana {
    @Test
    public void User() {
        for (int k = 0; k < 3; k++) {
            if (k==0) {
                for (int i = 0; i < 3; i++) {


                    System.out.print(" * ");
                }
            }if(k==1){
                System.out.println("");
                for (int i = 0; i < 3; i++) {
                    if(i==0){
                        System.out.print(" ");
                    }else {
                        System.out.print(" * ");
                    }
                }
            }if(k==2){
                System.out.println("");
                for (int i = 0; i < 3; i++) {
                    if(i==2){
                        System.out.print(" * ");
                    }else{
                        System.out.print(" ");
                    }

                }
            }

        }
    }
}

