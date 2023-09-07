package creational.absfactory;

public class ModernFactory extends FurnitureFactory {

    @Override
    public Chair assembleChair() {
        return new ModernChair();
    }

    @Override
    public Couch assembleCouch() {
        return new ModernCouch();
    }
}
