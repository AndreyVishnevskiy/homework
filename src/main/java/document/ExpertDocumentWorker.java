package document;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }

    @Override
    public String toString() {
        return "Вам доступна версия Expert!";
    }
}