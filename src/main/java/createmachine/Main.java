package createmachine;

public class Main {
    public static void main(String[] args) {
        Machine car1 = new Car("жовтий", "2");
        Machine car2 = new Car("синій", "4");
        System.out.println("Легкова автівка 1 має: " + car1);
        System.out.println("Легкова автівка 2 має: " + car2);
        car1.sound();

        Machine truck = new Truck();
        System.out.println("Вантажівка має: " + truck);
        truck.sound();

        Machine tank1 = new Tank("рожевий");
        Machine tank2 = new Tank("чорний", "одна");
        Machine tank3 = new Tank("5", 30);
        System.out.println("Танк 1 має: " + tank1);
        System.out.println("Танк 2 має: " + tank2);
        System.out.println("Танк 3 має: " + tank3);
        tank1.sound();
    }
}