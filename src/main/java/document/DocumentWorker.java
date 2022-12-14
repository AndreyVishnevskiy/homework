package document;

public class DocumentWorker {
    void openDocument() {
        System.out.println("Документ открыт");
    }

    void editDocument(){
        System.out.println("Редактирование документа доступно в версии Про");
    }

    void saveDocument(){
        System.out.println("Сохранение документа доступно в версии Про");
    };

    @Override
    public String toString() {
        return "Вам доступна базовая версия!";
    }
}