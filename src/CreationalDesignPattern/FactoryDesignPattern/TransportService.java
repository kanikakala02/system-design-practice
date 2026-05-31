package CreationalDesignPattern.FactoryDesignPattern;

public class TransportService {
    public static void main(String[] args) throws IllegalAccessException {
        Transport transport = TransportFactory.getTransport("car");
        transport.deliver();
        transport=TransportFactory.getTransport("bus");
        transport.deliver();
    }
}
