package creational.factory.logisticexample;

/**
 * A class to transport the goods via Sea.
 *
 * @author Sudhanshu Singh
 */
public class Sea implements Transport {

    @Override
    public void deliver() {
        System.out.println("Transportation will be done via sea!");
    }
}
