package document;

import java.util.Scanner;

public class Main {
    public static final String kay_pro = "RN2QX-FD4TJ-TKQ8H-DFF6X-T86WK";
    public static final String kay_exp = "GTBG2-FPNP2-V77QM-9PTPY-88JM9";
    public static Scanner sc = new Scanner(System.in);

    public static void document(DocumentWorker documentWorker) {
        System.out.println(documentWorker);
        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }

    public static void chek_kay() {
        String user_kay = sc.next();
        switch (user_kay) {
            case kay_pro:
                DocumentWorker ProDocumentWorker = new ProDocumentWorker();
                document(ProDocumentWorker);
//                document(new ProDocumentWorker());
                break;
            case kay_exp:
                ExpertDocumentWorker ExpertDocumentWorker = new ExpertDocumentWorker();
                document(ExpertDocumentWorker);
                break;
            default:
                System.out.println("Ключ неверный!");
                DocumentWorker DocumentWorker = new DocumentWorker();
                document(DocumentWorker);
                break;
        }
    }

    public static void main(String[] args) {
        System.out.print("У вас есть ключ (y/n)? ");
        String have_kay = sc.next();
        switch (have_kay) {
            case "y":
                System.out.print("Введите ключ: ");
                chek_kay();
                break;
            case "n":
                DocumentWorker DocumentWorker = new DocumentWorker();
                document(DocumentWorker);
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }
}