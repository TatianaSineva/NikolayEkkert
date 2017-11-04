import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FileAnalizerTest
{
    @org.junit.Test
    public void countLetters() throws Exception
    {
        FileAnalizer customAnalizer = new FileAnalizer("file.txt");

        int actual = customAnalizer.countLetters();
        int expect = 25;
        assertEquals(actual, expect);
    }

    @org.junit.Test
    public void countWords() throws Exception
    {
        FileAnalizer customAnalizer = new FileAnalizer("file.txt");

        int actual = customAnalizer.countWords();
        int expect = 7;
        assertEquals(actual, expect);
    }

    @org.junit.Test
    public void countLines() throws Exception
    {
        FileAnalizer customAnalizer = new FileAnalizer("file.txt");

        int actual = customAnalizer.countLines();
        int expect = 5;
        assertEquals(actual, expect);
    }

    @org.junit.Test
    public void countFrequencyCharacteristic() throws Exception
    {
        FileAnalizer customAnalizer = new FileAnalizer("file.txt");

        Map actual = customAnalizer.countFrequencyCharacteristic();

        Map<Character, Integer> expect = new HashMap<Character, Integer>();
        expect.put('р', 1);
        expect.put(' ', 9);
        expect.put('b', 1);
        expect.put('d', 2);
        expect.put('f', 3);
        expect.put('g', 5);
        expect.put('.', 4);
        expect.put(',', 1);
        expect.put('а', 1);
        expect.put('Б', 1);
        expect.put('r', 2);
        expect.put('s', 1);
        expect.put('v', 2);
        expect.put('w', 3);
        expect.put('\\', 1);
        expect.put('|', 1);
        expect.put('н', 2);
        expect.put('о', 1);

        assertEquals(actual, expect);
    }

}