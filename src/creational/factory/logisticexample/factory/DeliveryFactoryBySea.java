package creational.factory.logisticexample.factory;

import creational.factory.logisticexample.Sea;
import creational.factory.logisticexample.Transport;

public class DeliveryFactoryBySea extends DeliveryFactory {

    @Override
    public Transport getTransport() {
        return new Sea();
    }
}
