package creational.factory.example;

public class ChickenBurgerFactory extends BurgerBuilderFactory {

    @Override
    public Burger buildBurger() {
        return new ChickenBurger();
    }
}
