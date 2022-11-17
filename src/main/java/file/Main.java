package file;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        String filePath = "/Users/andreyvishnevskiy/Work/Test/src/main/java/file/JavaHistory.txt";

        FileTextReader reader = new FileTextReader();
        String text = reader.read(filePath);
        SortText sortText = new SortText(text);

        System.out.println("Количество слов: " + sortText.getWordCount());
        System.out.println("Слова которые начинаются на буквы “с“: " + sortText.getWordsWithC("C", "c"));
        System.out.println("Количество слов которые начинаются на буквы “с“: " + sortText.getCountWordsWithC("C", "c"));
        System.out.println("Количество пробелов: " + sortText.getSpaceCount());
        System.out.println("Вывести всего 12 слов: " + sortText.get12Words(12));
        System.out.println("Вывести 12 отсартированых слов: " + sortText.get12SortedWords(12));
        System.out.println("Любое слово: " + sortText.getAnyWord("Microsystems"));
        System.out.println("Первое слово: " + sortText.getFirstWord());
        System.out.println("Последнее слово: " + sortText.getLastWord());
        System.out.println("Все цифры: " + sortText.getAllNumbers());
        System.out.println("Содержится ли 2006 год в тексте: " + sortText.have2006Year("2006"));
        System.out.println("Вывести 30 уникальных слов: " + sortText.get30UniqueWords(30));
    }
}
