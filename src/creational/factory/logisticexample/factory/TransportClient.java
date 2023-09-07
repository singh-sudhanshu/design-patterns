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
            case "air":
                deliveryFactory = new DeliverByAir();
                break;
            case "sea":
                deliveryFactory = new DeliveryFactoryBySea();
                break;
            case "road":
                deliveryFactory = new DeliveryFactoryByRoad();
                break;
            default:
                System.out.println("Delivery mode not available");
                break;
        }
    }
}
