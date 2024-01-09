public class AbstractClass {

    public static void main(String[] args) {

        Car Bmw = new Car(4);
        Track Actros = new Track(10);

        Bmw.useThis();
        Bmw.openTank();
        System.out.println(Bmw.getNumberWheels());

        Actros.useThis();
        Actros.openTank();
        System.out.println(Actros.getNumberWheels());
    }
}

abstract class Vehicle {
    int wheel;

    protected Vehicle(int wheel) {
        this.wheel = wheel;
    }

    abstract public void useThis();

    abstract public int getNumberWheels();

    public void openTank() {
        System.out.println("Tank is opened!");
    }
}

class Car extends Vehicle {

    protected Car(int wheel) {
        super(wheel);
    }

    @Override
    public void useThis() {
        System.out.println("I drive several people");
    }

    @Override
    public int getNumberWheels() {
        return this.wheel;
    }
}

class Track extends Vehicle {

    protected Track(int wheel) {
        super(wheel);
    }

    @Override
    public void useThis() {
        System.out.println("I transport goods");
    }

    @Override
    public int getNumberWheels() {
        return this.wheel;
    }
}