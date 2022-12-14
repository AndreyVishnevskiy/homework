package PlayerInterface;

public class Player implements Playable, Recodable{

    @Override
    public void play() {
        System.out.println("Я воспроизвожу!");
    }

    @Override
    public void record() {
        System.out.println("Я записываю!");
    }

    @Override
    public void pause() {
        System.out.println("Я ставлю на паузу!");
    }

    @Override
    public void stop() {
        System.out.println("Я останавливаю!");
    }
}