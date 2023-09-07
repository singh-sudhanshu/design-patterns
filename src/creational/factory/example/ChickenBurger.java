package creational.factory.example;

public class ChickenBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Chicken burger being built");
    }
}
