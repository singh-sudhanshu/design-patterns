package creational.factory.logisticexample.factory;

import creational.factory.logisticexample.Road;
import creational.factory.logisticexample.Transport;

public class DeliveryFactoryByRoad extends DeliveryFactory {

    @Override
    public Transport getTransport() {
        return new Road();
    }
}
