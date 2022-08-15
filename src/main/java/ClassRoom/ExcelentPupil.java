package ClassRoom;

public class ExcelentPupil extends Pupil{
    ExcelentPupil(String name){
        super.name = name;
    }
    @Override
    void study() {
        System.out.println("Учусь на 5");
    }

    @Override
    void read() {
        System.out.println("Читаю на 5");
    }

    @Override
    void write() {
        System.out.println("Пишу на 5");
    }

    @Override
    void relax() {
        System.out.println("Не отдыхаю");
    }
}