package creational.factory.example;

public class VeggieBurgerFactory extends BurgerBuilderFactory {

    @Override
    public Burger buildBurger() {
        return new VeggieBurger();
    }
}
