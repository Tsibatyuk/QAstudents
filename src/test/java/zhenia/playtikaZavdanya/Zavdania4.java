package zhenia.playtikaZavdanya;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zavdania4 {

    public static void main(String[] args) {
        String title = "Today I have an interview at 16:30 o'clock";
        Pattern pat = Pattern.compile(".*(\\d{2}:\\d{2}).*");

        Stream<String> stream = Stream.of(title);
        String interviewTime = stream
                .map(pat::matcher)
                .filter(Matcher::find)
                .map(matcher -> matcher.group(1))
                .collect(Collectors.joining());

        System.out.println( interviewTime);


    }
}