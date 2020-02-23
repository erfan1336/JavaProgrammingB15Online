package day59;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public static void main(String[] args) throws IOException {

        List<String> allLine = Files.readAllLines(Paths.get("src/ErfansInputFile"));
        //System.out.println("/Users/yierfanhaimiti/IdeaProjects/JavaProgrammingB15Online/src/ErfansInputFile");
        System.out.println("allLine = " + allLine);

        for (String eachLine : allLine){
            System.out.println(eachLine);
        }
    }
}
