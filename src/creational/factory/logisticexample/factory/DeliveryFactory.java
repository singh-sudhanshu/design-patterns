package creational.factory.logisticexample.factory;

import creational.factory.logisticexample.Transport;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be created.
 *
 * @author Sudhanshu Singh
 */
public abstract class DeliveryFactory {

    public abstract Transport getTransport();
}
