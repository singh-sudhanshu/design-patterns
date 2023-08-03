package behavioral.observer;

public class Client {

    public static void main(String[] args) {

        NewsPublisher newsPublisher = new NewsPublisher(1L, "A news agency");
        NewsSubscriber newsSubscriber = new NewsSubscriber();
        ChannelSubscriber channelSubscriber = new ChannelSubscriber();
        newsPublisher.addPropertyChangeListener(newsSubscriber);
        newsPublisher.addPropertyChangeListener(channelSubscriber);
        newsPublisher.publish("This is breaking");

        Boolean isReceived = "This is breaking".equalsIgnoreCase(newsSubscriber.getNews());
        System.out.println(isReceived);
        System.out.println(channelSubscriber.getNews() + "from channel subscriber");
        System.out.println(newsSubscriber.getNews() + "from news subscriber");
    }
}
