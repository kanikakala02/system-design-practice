package StructuralDesignPattern.DecoratorPattern;

public class CheesePizza extends Decorator {
    public CheesePizza(Pizza pizza) {
        super(pizza);
    }

    public double cost() {
        return pizza.cost()+1.0;
    }
    public String description() {
        return pizza.description()+", Cheese";
    }
}
