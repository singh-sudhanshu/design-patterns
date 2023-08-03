package behavioral.template;

import java.util.Map;

public class ShoppingMall {

    private final Map<String, String> parts;

    public ShoppingMall(Map<String, String> parts) {
        this.parts = parts;
    }

    public Map<String, String> getParts() {
        return parts;
    }
}
