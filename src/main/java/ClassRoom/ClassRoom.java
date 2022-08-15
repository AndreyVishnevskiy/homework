package ClassRoom;

public class ClassRoom {
    private Pupil[] pupil;

    ClassRoom(Pupil ...pupil){
        this.pupil = pupil;
    }

    public Pupil[] getPupil() {
        return pupil;
    }
}