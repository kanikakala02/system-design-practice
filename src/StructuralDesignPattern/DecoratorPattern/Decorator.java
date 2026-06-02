package StructuralDesignPattern.DecoratorPattern;

abstract class Decorator implements Pizza {
    Pizza pizza;
    public Decorator(Pizza pizza) {
        this.pizza=pizza;
    }

    @Override
    public String description() {
        return pizza.description();
    }

    @Override
    public double cost() {
        return pizza.cost();
    }
}
