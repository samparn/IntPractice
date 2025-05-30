package practice.designpatterns.template;

public abstract class Beverage {

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    public final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
}
