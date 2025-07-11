package practice.designpatterns.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription()+", Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 3.0d;
    }
}
