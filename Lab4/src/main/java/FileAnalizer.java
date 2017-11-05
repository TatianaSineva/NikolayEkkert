import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class FileAnalizer {

    private String linesFile;


    public FileAnalizer(String path) {

        try {

            linesFile = new String(Files.readAllBytes(Paths.get(path)));
            System.out.println(linesFile.length());

//           Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(System.out::println);
        }
        catch (IOException e) {

            System.out.println("Ошибка, файл не найден!");
            System.exit(1);
        }
    }


    public int countLetters() {

        return linesFile.replaceAll("[^a-zA-Zа-яА-Я]", "")
                        .length();
    }

    public int countWords() {

        return linesFile.replaceAll("([^A-Za-zА-Яа-я])([\\s\\W]+)", " ")
                        .split(" ").length;
    }

    public int countLines() {

        return linesFile.split("\n").length;
    }

    public Map<Character, Integer> countFrequencyCharacteristic() {

        Map<Character, Integer> countSymbol = new HashMap<Character, Integer>();
//        for (Object line : linesFile) {
//
//            String storageLine = line.toString();
//            if (storageLine.length() != 0) {
//
//                char[] symbols = storageLine.toCharArray();
//                for (char element : symbols) {
//
//                    if (countSymbol.get(element) != null) {
//                        countSymbol.put(element, countSymbol.get(element) + 1);
//                        continue;
//                    }
//                    countSymbol.put(element, 1);
//                }
//            }
//        }

        return countSymbol;
    }
}
