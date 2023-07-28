package creational.factory;

public class FlightTicket extends Ticket {

    @Override
    public void getPrice() {
        rate = 5000.99;
    }
}
