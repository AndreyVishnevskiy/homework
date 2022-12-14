package classroomtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pupil Alex = new ExcelentPupil("Alex");
        Pupil Lisa = new GoodPupil("Lisa");
        Pupil Dasha = new BadPupil("Dasha");
        Pupil Pasha = new BadPupil("Pasha");

//      Обычный спооб инициализации ArrayList.
        ArrayList<Pupil> pupils1 = new ArrayList<Pupil>();
        pupils1.add(Alex);
        pupils1.add(Lisa);
        pupils1.add(Dasha);
        pupils1.add(Pasha);

//        Способо обявления через Java 8.
        ArrayList<Pupil> pupils2 = new ArrayList<>(Arrays.asList(Alex, Lisa, Dasha, Pasha));
//        Разпространенный вариант.
        List<Pupil> pupils3 = List.of(Alex, Lisa, Dasha, Pasha);

        ClassRoom classRoom = new ClassRoom(pupils1);
        ClassRoom classRoom1 = new ClassRoom(pupils2);
//        ClassRoom classRoom2 = new ClassRoom ((ArrayList<Pupil>) pupils3);
//        ClassRoom classRoom3 = new ClassRoom(Alex, Lisa, Dasha, Pasha);
         ArrayList<Pupil> classRoomList = classRoom.getPupil();

//        for (int i = 0; i < pupil.length; i++){
//            System.out.println(pupil[i].name);
//            pupil[i].study();
//            pupil[i].read();
//            pupil[i].write();
//            pupil[i].relax();
//        }
        classRoomList.forEach(element -> {
            System.out.println(element.name);
            element.study();
            element.read();
            element.write();
            element.relax();
        });
    }
}