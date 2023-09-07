package structural.adaptor;

public class RoundHole {

    double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean doesFit(RoundPeg roundPeg) {
        return this.radius >= roundPeg.getRadius();
    }
}
