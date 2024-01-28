public abstract class Animals implements IAnimal {
    private final String animalType;

    public Animals(String animalType) {
        this.animalType = animalType;
    }

    public Animals() {
        this("animal");
    }

    public void speak() {
        System.out.println("This " + this.animalType + " moves forward");
    }

    public void move() {
        System.out.println("This " + this.animalType + " speaks");
    };
}

interface IAnimal {
    speak();

    move();
}
