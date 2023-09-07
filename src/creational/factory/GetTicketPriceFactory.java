package creational.factory;

public class GetTicketPriceFactory {

    public Ticket getTicketPriceFactory(String ticketType) {

        switch (ticketType.toLowerCase()) {
            case "flight":
                return new FlightTicket();
            case "train":
                return new TrainTicket();
            case "bus":
                return new BusTicket();
            default:
                throw new IllegalArgumentException("ticket type is not being supported");
        }
    }
}
