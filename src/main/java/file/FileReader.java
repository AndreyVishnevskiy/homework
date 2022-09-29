package file;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileReader {
    String file = "/Users/andreyvishnevskiy/Work/Test/src/main/java/file/JavaHistory.txt";
    String file2 = "/Users/andreyvishnevskiy/Work/Test/src/main/java/file/test.txt";
//        File file = new File("/Users/andreyvishnevskiy/Work/Test/src/main/java/file/JavaHistory.rtf");

    public List<String> read() throws IOException {
        BufferedReader reader = new BufferedReader(new java.io.FileReader(file));
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null){
            lines.add(line);
        }
        reader.close();
        return lines;
    }
}
