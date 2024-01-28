public class Goose extends Animals implements IFlying {

    public Goose(){
        super("goose");
    }

    public void fly() {
        System.out.println("This goose is flying");
    };
}
