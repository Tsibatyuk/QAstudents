package zhenia.webtesting.rozetka.test;

public class Kata {

    public static String solution(String str) {
        // Your code here...

        String str2="";
        for(int i = str.length()-1; i>=0; i--){
            char letter = str.charAt(i);
            str2 += letter;
        }
        return str2;
    }
}
