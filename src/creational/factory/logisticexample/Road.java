package creational.factory.logisticexample;

/**
 * A class to transport the goods via road.
 *
 * @author Sudhanshu Singh
 */
public class Road implements Transport {

    @Override
    public void deliver() {
        System.out.println("Transportation will be done via road!");
    }
}
