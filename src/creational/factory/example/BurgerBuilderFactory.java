package creational.factory.example;

public abstract class BurgerBuilderFactory {

    public Burger orderBurger() {
        Burger burger = buildBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger buildBurger();
}
