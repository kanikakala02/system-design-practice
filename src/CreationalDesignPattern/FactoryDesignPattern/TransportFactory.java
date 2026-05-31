package CreationalDesignPattern.FactoryDesignPattern;

public class TransportFactory {
    public static Transport getTransport(String type) throws IllegalAccessException {
        switch (type.toLowerCase()){
            case "car":
                return new Car();
            case "Train":
                return new Train();
            case "bus":
                return new Bus();
            default:
                throw new IllegalAccessException("transporty type not supported");
        }
    }
}
