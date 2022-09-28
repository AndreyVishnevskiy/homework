package documentdefinition;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("XML файл открыт!");
    }

    @Override
    void create() {
        System.out.println("XML файл создан!");
    }

    @Override
    void change() {
        System.out.println("XML файл изменен!");
    }

    @Override
    void save() {
        System.out.println("XML файл сохранен!");
    }
}