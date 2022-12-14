package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileTextReader {
    public String read(String filePath) throws IllegalAccessException {
        Path path = Path.of(filePath);
        try {
            return Files.readString(path);
        } catch (IOException e) {
           throw new IllegalAccessException("" + e);
        }
    }
}