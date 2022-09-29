package file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader();
        System.out.println(reader.read());
        List<String> file = new ArrayList<>(reader.read());

//        List<String> c = file.stream().filter(element -> element.("c"))
//                .collect(Collectors.toList());
//        System.out.println(c);
    }
}
