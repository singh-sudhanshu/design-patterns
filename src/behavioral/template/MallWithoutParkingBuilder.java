package behavioral.template;

public class MallWithoutParkingBuilder extends ShoppingMallBuilder {

    @Override
    protected void buildRoofTop() {
        this.getParts().put("roof", "roof top has been built");
    }

    @Override
    protected void buildFoodCourt() {
        this.getParts().put("food", "food court has been built");
    }

    @Override
    protected void buildLowerLevel() {
        this.getParts().put("lower", "lower level has been built");
    }

    @Override
    protected void buildParking() {
        throw new UnsupportedOperationException("Parking is not available");
    }
}
