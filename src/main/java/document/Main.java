package document;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String kay_pro = "RN2QX-FD4TJ-TKQ8H-DFF6X-T86WK";
        final String kay_exp = "GTBG2-FPNP2-V77QM-9PTPY-88JM9";
        Scanner sc = new Scanner(System.in);

        System.out.print("У вас есть ключ (y/n)? ");
        String have_kay = sc.next();
        switch (have_kay) {
            case "y":
                System.out.print("Введите ключ: ");
                String user_kay = sc.next();
                switch (user_kay){
                    case kay_pro:
                        System.out.println("Вам доступна версия Pro!");
                        ProDocumentWorker ProDocumentWorker = new ProDocumentWorker();
                        ProDocumentWorker.openDocument();
                        ProDocumentWorker.editDocument();
                        ProDocumentWorker.saveDocument();
                        break;
                    case kay_exp:
                        System.out.println("Вам доступна версия Expert!");
                        ExpertDocumentWorker ExpertDocumentWorker = new ExpertDocumentWorker();
                        ExpertDocumentWorker.openDocument();
                        ExpertDocumentWorker.editDocument();
                        ExpertDocumentWorker.saveDocument();
                        break;
                    default:
                        System.out.println("Ключ неверный!\nВам доступна базовая версия!");
                        DocumentWorker DocumentWorker = new DocumentWorker();
                        DocumentWorker.openDocument();
                        DocumentWorker.editDocument();
                        DocumentWorker.saveDocument();
                }
                break;
            case "n":
                System.out.println("Вам доступна базовая версия!");
                DocumentWorker DocumentWorker = new DocumentWorker();
                DocumentWorker.openDocument();
                DocumentWorker.editDocument();
                DocumentWorker.saveDocument();
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }
}