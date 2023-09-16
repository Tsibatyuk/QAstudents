package zhenia.webtesting.rozetka.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

        @Test
        public void sampleTests() {
            assertEquals("dlrow", Kata.solution("world"));
        }

}
