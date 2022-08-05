package Printer;

public class Red extends Printer{
    @Override
    void print(String value) {
        super.print(value);
        System.out.println(ANSI_RED + value + ANSI_RESET);
    }
}