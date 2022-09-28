package documentdefinition;

public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("DOC файл открыт!");
    }

    @Override
    void create() {
        System.out.println("DOC файл создан!");
    }

    @Override
    void change() {
        System.out.println("DOC файл изменен!");
    }

    @Override
    void save() {
        System.out.println("DOC файл сохранен!");
    }
}
