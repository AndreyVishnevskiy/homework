package documentdefinition;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void executor(AbstractHandler abstractHandler) {
        abstractHandler.open();
        abstractHandler.create();
        abstractHandler.change();
        abstractHandler.save();
    }

    public static void typeHandler(AbstractHandler handler) {
        String name = handler.getClass().getName();
        if (name.contains("XML")) {
            executor(handler);
        } else if (name.contains("TXT")) {
            executor(handler);
        } else if (name.contains("DOC")) {
            executor(handler);
        }
    }

    public static void main(String[] args) {
        AbstractHandler handler = new XMLHandler();
        typeHandler(handler);
        typeHandler(new TXTHandler());
        typeHandler(new DOCHandler());
    }
}
