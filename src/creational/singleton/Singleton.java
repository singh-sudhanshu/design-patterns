package creational.singleton;

public final class Singleton {

    private final String value;
    private static volatile Singleton instance;

    private Singleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Singleton getInstance(String value) {
        // To avoid double locking (DCL)
        // https://refactoring.guru/java-dcl-issue
        // Only initial few threads require the synchronization. Once the object is being created just return that.
        // Increases the performance
        var localRef = instance;
        if (localRef != null) {
            return localRef;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
