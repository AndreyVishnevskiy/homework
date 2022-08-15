package ClassRoom;

public class BadPupil extends Pupil{
    BadPupil(String name){
        super.name = name;
    }
    @Override
    void study() {
        System.out.println("Учусь на 3");
    }

    @Override
    void read() {
        System.out.println("Читаю на 2");
    }

    @Override
    void write() {
        System.out.println("Пишу на 2");
    }

    @Override
    void relax() {
        System.out.println("Всегда отдыхаю");
    }
}
