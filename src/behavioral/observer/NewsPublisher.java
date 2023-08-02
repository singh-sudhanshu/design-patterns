package behavioral.observer;

public class NewsPublisher extends ObservableAgency {

    private String news;

    public NewsPublisher(Long id, String name) {
        super(id, name);
    }

    @Override
    public void publish(String news) {
        String oldNews = this.news;
        this.news = news;
        this.getPcs().firePropertyChange("news", oldNews, this.news);
    }
}
