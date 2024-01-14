interface Animal {
    void eat();

    void sleep();
}

interface Human extends Animal {
    void talk();
}

// Nested interface -an interface can be declared as a member of class another
// interface.

class Worker {
    public interface CheckWork {
        boolean isGoodWork(int workTime);
    }
}

class Foreman implements Worker.CheckWork {

    public boolean isGoodWork(int workTime) {
        return workTime < 10 ? true : false;
    }
}

class Main {
    public static void main(String[] args) {

        Worker.CheckWork currentForeman = new Foreman();

        if (currentForeman.isGoodWork(9)) {
            System.out.println("Good work!");
        } else {
            System.out.println("Tray again!");
        }
    }
}