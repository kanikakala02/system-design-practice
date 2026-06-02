package StructuralDesignPattern.DecoratorPattern;

public class PizzaApp {
    public static void main(String[] args) {
        Pizza pizza= new BasicPizza();
        pizza=new CheesePizza(pizza);
        pizza=new MushroomPizza(pizza);
        System.out.println(pizza.description());
        System.out.println(pizza.cost());
    }
}
