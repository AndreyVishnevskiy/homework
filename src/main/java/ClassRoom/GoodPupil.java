package ClassRoom;

public class GoodPupil extends Pupil{
    GoodPupil(String name){
        super.name = name;
    }
    @Override
    void study() {
        System.out.println("Учусь на 4");
    }

    @Override
    void read() {
        System.out.println("Читаю на 4");
    }

    @Override
    void write() {
        System.out.println("Пишу на 4");
    }

    @Override
    void relax() {
        System.out.println("Немного отдыхаю");
    }
}
