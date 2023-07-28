package creational.factory;

public class Main {

    public static void main(String[] args) {

        var getTicketPrice = new GetTicketPriceFactory();
        Ticket ticket = getTicketPrice.getTicketPriceFactory("flight");
        ticket.getPrice();

        var totalPrice = ticket.calculatePrice(2);
        System.out.println("Total price is: " + totalPrice);
    }
}
