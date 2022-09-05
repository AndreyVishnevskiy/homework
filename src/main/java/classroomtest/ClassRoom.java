package classroomtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassRoom {
    private ArrayList<Pupil> pupil;

//    ClassRoom(Pupil ...pupil){
//        this.pupil = (ArrayList<Pupil>) Arrays.asList(pupil);
//    }
    ClassRoom(ArrayList<Pupil> pupil){
        this.pupil = pupil;
    }

    public ArrayList<Pupil> getPupil() {
        return pupil;
    }
}