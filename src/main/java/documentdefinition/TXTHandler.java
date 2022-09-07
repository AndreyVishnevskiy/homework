package documentdefinition;

public class TXTHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("TXT файл открыт!");
    }

    @Override
    void create() {
        System.out.println("TXT файл создан!");
    }

    @Override
    void change() {
        System.out.println("TXT файл изменен!");
    }

    @Override
    void save() {
        System.out.println("TXT файл сохранен!");
    }
}
