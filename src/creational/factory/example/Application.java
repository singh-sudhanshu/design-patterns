package creational.factory.example;

public class Application {

    public static void main(String[] args) {

        BurgerBuilderFactory veggieBurgerFactory = new VeggieBurgerFactory();
        var burger = veggieBurgerFactory.orderBurger();
        System.out.println(burger);
    }
}
