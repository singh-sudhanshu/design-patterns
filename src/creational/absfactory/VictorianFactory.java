package creational.absfactory;

public class VictorianFactory extends FurnitureFactory {

    @Override
    public Chair assembleChair() {
        return new VictorianChair();
    }

    @Override
    public Couch assembleCouch() {
        return new VictorianCouch();
    }
}
