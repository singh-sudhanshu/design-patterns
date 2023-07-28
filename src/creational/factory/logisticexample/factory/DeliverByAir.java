package creational.factory.logisticexample.factory;

import creational.factory.logisticexample.Air;
import creational.factory.logisticexample.Transport;

public class DeliverByAir extends DeliveryFactory {

    @Override
    public Transport getTransport() {
        return new Air();
    }
}
