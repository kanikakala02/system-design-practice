package CreationalDesignPattern.FactoryDesignPattern;

public class Train implements Transport {
    @Override
    public void deliver() {
        System.out.println("deliver by train");
    }
}
