public class ClassObject {
    public static void main(String[] args) {

        Chid child = new Chid();
        Man man = new Man();

        child.sayName();
        System.out.println(child.getAge());
        System.out.println(man.getAge());

        Pet dog = new Pet(5, "Bill", 15);
        dog.calculateInfo(20);

        dog.calculateInfo(20, 11);
    }
}

class Chid {
    int age = 10;
    String name = "Bob";

    public void sayName() {
        System.out.println(name);
    }

    public int getAge() {
        return age;
    }
}

class Man extends Chid {
    public int getAge() {
        return age + 10;
    }
}

// Inheritance

class Pet {
    int age;
    String name;
    int wight;

    Pet(int age, String name, int wight) {
        this.age = age;
        this.name = name;
        this.wight = wight;
    }

    public void sayName() {
        System.out.println(name);
    }

    public int getAge() {
        return age;
    }

    private String isOld(int oldLimit) {
        if (age > oldLimit) {
            return "I am old";
        } else {
            return "I am yang";
        }
    }

    private String isFat(int fatLimit) {
        if (wight > fatLimit) {
            return "I am fat";
        } else {
            return "I am slim";
        }
    }

    // Method Overloading

    public void calculateInfo(int oldLimit, int fatLimit) {
        System.out.println("My Info: ");
        System.out.println(isOld(oldLimit));
        System.out.println(isFat(fatLimit));
    }

    public void calculateInfo(int oldLimit) {
        System.out.println("My Info: ");
        System.out.println(isOld(oldLimit));
    }

}