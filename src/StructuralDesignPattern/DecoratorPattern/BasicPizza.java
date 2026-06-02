package StructuralDesignPattern.DecoratorPattern;

public class BasicPizza implements Pizza {
    @Override
    public String description() {
        return "Basic Pizza";
    }
    @Override
    public double cost() {
        return 1.5;
    }
}
