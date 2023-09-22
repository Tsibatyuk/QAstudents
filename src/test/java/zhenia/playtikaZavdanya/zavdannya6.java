package zhenia.playtikaZavdanya;

import java.util.HashSet;

public class zavdannya6 {

        public static boolean sumOf2(int[] arr, int sum) {
            HashSet<Integer> set = new HashSet<>();
            for (int num : arr) {
                int complement = sum - num;
                if (set.contains(complement)) {
                    System.out.println(complement+" "+num);
                    // Знайдено пару чисел, сума яких дорівнює заданому числу
                    return true;
                }
                // Додаємо поточне число до множини
                set.add(num);
            }

            // Немає такої пари
            return false;
        }

        public static void main(String[] args) {
            int[] arr = new int[] {-8, -6, 1, 2, 3, 5, 8};
            int sum = 4;

            boolean result = sumOf2(arr, sum);
            System.out.println("Чи є пара чисел, сума яких дорівнює " + sum + "? " + result);
        }

//        через стрім

//    public static boolean sumOf2(int[] arr, int sum) {
//        HashSet<Integer> set = new HashSet<>();
//
//        return IntStream.of(arr)
//                .anyMatch(num -> {
//                    int complement = sum - num;
//                    if (set.contains(complement)) {
//                        // Знайдено пару чисел, сума яких дорівнює заданому числу
//                        return true;
//                    }
//                    // Додаємо поточне число до множини
//                    set.add(num);
//                    return false;
//                });
//    }



    }
