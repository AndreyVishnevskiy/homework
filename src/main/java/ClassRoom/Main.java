package ClassRoom;

public class Main {
    public static void main(String[] args) {
        Pupil Alex = new ExcelentPupil("Alex");
        Pupil Lisa = new GoodPupil("Lisa");
        Pupil Dasha = new BadPupil("Dasha");
        Pupil Pasha = new BadPupil("Pasha");

        ClassRoom ClassRoom = new ClassRoom(Alex, Lisa, Dasha, Pasha);
        Pupil[] pupil = ClassRoom.getPupil();

        for (int i = 0; i < pupil.length; i++){
            System.out.println(pupil[i].name);
            pupil[i].study();
            pupil[i].read();
            pupil[i].write();
            pupil[i].relax();
        }
    }
}