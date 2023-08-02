package behavioral.observer;

import java.beans.PropertyChangeEvent;

public class NewsSubscriber extends ObserverClient {

    private String news;

    public String getNews() {
        return news;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.news = evt.getNewValue().toString();
    }
}
