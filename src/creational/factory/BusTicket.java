package creational.factory;

public class BusTicket extends Ticket {

    @Override
    public void getPrice() {
        rate = 100.20;
    }
}
