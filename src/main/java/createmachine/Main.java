package createmachine;

public class Main {
    public static void main(String[] args) {
        Machine car1 = new Machine ();
        car1.setColor("жовтогй");
        car1.setDoor("2");
        System.out.println("Легкова автівка 1 має: " + car1);

        Machine car2 = new Machine ();
        car2.setColor("синій");
        car2.setDoor("4");
        System.out.println("Легкова автівка 2 має: " + car2 + "\n");

        Machine truck = new Machine ();
        System.out.println("Вантажівка має: " + truck + "\n");

        Machine tank1 = new Machine ();
        tank1.setColor("рожевий");
        System.out.println("Танк 1 має: " + tank1);

        Machine tank2 = new Machine ();
        tank2.setColor("чорний");
        tank2.setDoor("одна");
        System.out.println("Танк 2 має: " + tank2);

        Machine tank3 = new Machine ();
        tank3.setDoor("5");
        tank3.setWeight("30т");
        System.out.println("Танк 3 має: " + tank3);


    }
}
