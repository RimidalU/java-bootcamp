public class Flying implements IFlying {
    public void fly() {
        System.out.println("It's the one that flies");
    };
}

interface IFlying {
    fly();
}
