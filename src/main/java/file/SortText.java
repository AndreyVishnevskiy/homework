package file;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class SortText {
    private final String text;
    private final List<String> words;
    private final List<String> numbers;

    public SortText(String text) {
        this.text = text;
        this.words = splitter("[a-zA-z]{2,}");
        this.numbers = splitter("\\d+");
    }

    private List<String > splitter(String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> element = new ArrayList<>();
        while(matcher.find()){
            element.add(matcher.group());
        }
        return element;
    }

    public long getWordCount(){
        return words.size();
    }

    public List<String> getWordsWithC(String uppercase, String lowercase){
        return words.stream()
                 .filter(item -> item.startsWith(uppercase) || item.startsWith(lowercase))
                 .collect(Collectors.toList());
    }

    public long getCountWordsWithC(String uppercase, String lowercase){
        return getWordsWithC(uppercase, lowercase).size();
    }

    public long getSpaceCount(){
        return Arrays.stream(text.split("\\S+"))
                .filter(item -> item.contains(" "))
                .count();
    }

    public List<String> get12Words(int count) {
        return words.stream()
                .limit(count)
                .collect(Collectors.toList());
    }

    public List<String> get12SortedWords(int count) {
        return words.stream()
                .limit(count)
                .sorted()
                .collect(Collectors.toList());
    }

    public String getAnyWord() {
        return words.stream()
                .findAny()
                .orElseThrow();
    }

    public String getFirstWord() {
        return words.stream()
                .findFirst()
                .orElseThrow();
    }

    public String getLastWord() {
        return words.stream()
                .skip(words.size() - 1)
                .findFirst()
                .orElseThrow();
    }

    public List<String> getAllNumbers(){
        return numbers;
    }

    public boolean have2006Year(String year){
        return Arrays.stream(text.split("\\D+"))
                .anyMatch(item -> item.trim().equals(year));
    }

    public Set<String> get30UniqueWords(int count) {
        return words.stream()
                .limit(count)
                .collect(Collectors.toSet());
    }
}