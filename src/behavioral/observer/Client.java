package behavioral.observer;

public class Client {

    public static void main(String[] args) {

        NewsPublisher newsPublisher = new NewsPublisher(1L, "A news agency");
        NewsSubscriber newsSubscriber = new NewsSubscriber();
        newsPublisher.addPropertyChangeListener(newsSubscriber);
        newsPublisher.publish("This is breaking");

        Boolean isReceived = "This is breaking".equalsIgnoreCase(newsSubscriber.getNews());
        System.out.println(isReceived);

    }
}
