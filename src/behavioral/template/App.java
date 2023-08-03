package behavioral.template;

public class App {

    public static void main(String[] args) {

        ShoppingMall shoppingMall = new MallWithoutParkingBuilder().buildShoppingMall();
        shoppingMall.getParts().forEach((k, v) -> System.out.println(v));

    }
}
