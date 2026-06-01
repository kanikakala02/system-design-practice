package CreationalDesignPattern.BuilderPattern;

public class HouseMain {
    public static void main(String[] args) {
        House house= new House.HouseBuilder("Concrete","tile","Wooden")
                .setHasGarage(false)
                .setHasSwimmingPool(true)
                .setHasGarden(true)
                .build();

        System.out.println(house);
    }
}
