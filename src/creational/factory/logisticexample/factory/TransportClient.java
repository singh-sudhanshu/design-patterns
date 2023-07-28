package creational.factory.logisticexample.factory;

/**
 * Demo class. Everything comes together here.
 *
 * @author sudhanshu Singh
 */
public class TransportClient {

    private static DeliveryFactory deliveryFactory;

    public static void main(String[] args) {
        var mode = "air";
        getDelivery(mode);
        deliveryFactory.getTransport().deliver();
    }

    private static void getDelivery(String mode) {
        switch (mode.toLowerCase()) {
            case "air" -> deliveryFactory = new DeliverByAir();
            case "sea" -> deliveryFactory = new DeliveryFactoryBySea();
            case "road" -> deliveryFactory = new DeliveryFactoryByRoad();
            default -> System.out.println("Delivery mode not available");
        }
    }
}
