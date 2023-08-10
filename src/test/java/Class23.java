import java.util.Scanner;

public class Class23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int credit = scanner.nextInt();
        System.out.println("сума" + credit + "отриманого кредита");
        int morecredit = scanner.nextInt();
        if (morecredit > 0) {
            System.out.println("сума" + morecredit + "як додатковий кредит");
        } else {
            System.out.println("кредитор не взяв грошей");}
            int summ = credit + morecredit;
            System.out.println("повна сума кредиту" + summ);
            if (summ > 100000) {
                int morelimit = summ - 100000;
                int penalty = morelimit * 10;
                System.out.println("кредит був перевищений на" + morelimit + " кредиту більше і має заплатити штраф 10 відсотків від суми надлишку. В сумі штраф дорівнює" + penalty);
            }
        }

    }

