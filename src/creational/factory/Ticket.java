package creational.factory;

/**
 * A Factory Pattern or Factory Method Pattern says that just define an interface or abstract class for creating an object
 * but let the subclasses decide which class to instantiate.
 * In other words, subclasses are responsible to create the instance of the class.
 * <p>
 * Factory Method Pattern allows the subclasses to choose the type of objects to create.
 * It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code.
 * That means the code interacts solely with the resultant interface or abstract class, so that it will work with any
 * classes that implement that interface or that extends that abstract class.
 * @author Sudhanshu Singh
 */

public abstract class Ticket {

    protected double rate;

    public abstract void getPrice();

    public double calculatePrice(double unit) {
        return unit * rate;
    }
}
