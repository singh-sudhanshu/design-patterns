package structural.decorator;

/**
 * Test class to demonstrate How Decorator Pattern in Java work together.
 * This class first creates a Sandwich and decorates it with extra cheese.
 * This is nice example of how to provide new functionalities to an object at runtime using Decorator Pattern.
 *
 * @author Sudhanshu Singh
 */
public class SandwichClient {

    public static void main(String[] args) {
        Sandwich sandwich = new WhiteBreadSandwich("White bread sandwich");
        System.out.printf("Price of %s is $%.2f %n", sandwich.getDescription(),
                sandwich.price());

        sandwich = new CheeseDecorator(sandwich);
        System.out.printf("Price of %s is $%.2f %n", sandwich.getDescription(),
                sandwich.price());

        sandwich = new SaladDecorator(sandwich);
        System.out.printf("Price of %s is $%.2f %n", sandwich.getDescription(),
                sandwich.price());
    }
}
