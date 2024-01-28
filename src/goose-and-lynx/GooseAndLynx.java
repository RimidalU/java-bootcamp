// Several design properties for a problem are presented below. Use these properties in order to write all the necessary classes and/or interfaces for a solution to the problem. Focus on class structure and interaction. You may implement your solution however you wish, but you will be graded on the appropriateness of your solution to the requirements. Note the use of capitalization and parentheses for clarification. You may use whatever constructors or additional methods you wish.
// You must define a structure that can represent Animals. Animals have two behaviors; they can speak() and they can move(). By default, when an animal moves, the text ”This animal moves forward” is displayed. By default, when an animal speaks, the text ”This animal speaks” is displayed. A general Animal should not be able to be instantiated.
// Define also two classes, Goose and Lynx, that are Animals. Both Goose and Lynx behave such that where "animal" is displayed in speak() or move(), ”goose” or ”lynx” is displayed by the appropriate classes.
// Finally, any instance of Goose can fly(), just as any Flying object can. An Airplane is also a Flying object. Define the Airplane class such that it is Flying and make sure that any instance of Goose is also Flying. The specific behaviors when instances of either class fly() are up to you. Instances of either Goose or Airplane should be able to be stored in a variable of type Flying.

public class GooseAndLynx {
    public static void main(String[] args) {
        Goose goose = new Goose();
        Airplane airplane = new Airplane();
        Lynx lynx = new Lynx();

        goose.speak();
        goose.move();
        goose.fly();
        System.out.println(goose instanceof IFlying);
        System.out.println(airplane instanceof IFlying);
        lynx.speak();
        lynx.move();
    }
}


// Bootcamp variant

abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this("animal");
    }

    public void speak() {
        System.out.println("This " + name + " speaks");
    }

    public void move() {
        System.out.println("This " + name + " moves forward");
    }
}

class Lynx extends Animal {
    public Lynx() {
        super("lynx");
    }
}

interface Flying {
    public void fly();
}

class Goose extends Animal implements Flying {
    public Goose() {
        super("goose");
    }

    public void fly() {
        System.out.println("This " + getClass().getName() + " soars, wings flapping.");
    }
}

class Airplane implements Flying {
    public void fly() {
        System.out.println("This " + getClass().getName() + " soars, engines running.");
    }
}