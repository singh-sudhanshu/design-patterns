package creational.factory.logisticexample;

/**
 * A class to transport the goods via air.
 *
 * @author Sudhanshu Singh
 */
public class Air implements Transport {

    @Override
    public void deliver() {
        System.out.println("Transportation will be done via air!");
    }
}
