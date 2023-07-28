package creational.factory;

public class GetTicketPriceFactory {

    public Ticket getTicketPriceFactory(String ticketType) {

        return switch (ticketType.toLowerCase()) {
            case "flight" -> new FlightTicket();
            case "train" -> new TrainTicket();
            case "bus" -> new BusTicket();
            default -> null;
        };
    }
}
