package behavioral.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public abstract class ObservableAgency {

    private final Long id;
    private final String name;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public ObservableAgency(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PropertyChangeSupport getPcs() {
        return pcs;
    }

    public abstract void publish(String value);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }
}
