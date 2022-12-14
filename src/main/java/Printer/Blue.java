package Printer;

public class Blue extends Printer{
    @Override
    void print(String value) {
        super.print(value);
        System.out.println(ANSI_BLUE + value + ANSI_RESET);
    }
}