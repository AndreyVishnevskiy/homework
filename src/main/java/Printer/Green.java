package Printer;

public class Green extends Printer{
    @Override
    void print(String value) {
        super.print(value);
        System.out.println(ANSI_GREEN + value + ANSI_RESET);
    }
}