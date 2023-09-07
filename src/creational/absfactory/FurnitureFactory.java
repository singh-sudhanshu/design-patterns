package creational.absfactory;

public abstract class FurnitureFactory {

    public Chair getChair() {
        var chair = assembleChair();
        chair.buildChair();
        return chair;
    }

    public Couch getCouch() {
        var couch = assembleCouch();
        couch.assembleCouch();
        return couch;
    }

    public abstract Chair assembleChair();

    public abstract Couch assembleCouch();
}
