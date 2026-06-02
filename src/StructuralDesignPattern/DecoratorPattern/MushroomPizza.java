package StructuralDesignPattern.DecoratorPattern;

public class MushroomPizza extends Decorator{
    public MushroomPizza(Pizza pizza) {
        super(pizza);
    }

    public double cost(){
        return pizza.cost()+0.5;
    }

    public String description(){
        return pizza.description()+", Mushroom";
    }
}
