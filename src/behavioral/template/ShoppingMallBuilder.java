package behavioral.template;

import java.util.HashMap;
import java.util.Map;

public abstract class ShoppingMallBuilder {

    private final Map<String, String> parts = new HashMap<>();

    protected final ShoppingMall buildShoppingMall() {
        buildParking();
        buildLowerLevel();
        buildFoodCourt();
        buildRoofTop();
        return new ShoppingMall(parts);
    }

    protected abstract void buildRoofTop();

    protected abstract void buildFoodCourt();

    protected abstract void buildLowerLevel();

    protected abstract void buildParking();

    public Map<String, String> getParts() {
        return parts;
    }
}
