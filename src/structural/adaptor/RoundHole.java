package structural.adaptor;

public record RoundHole(double radius) {

    public boolean doesFit(RoundPeg roundPeg) {
        return this.radius() >= roundPeg.getRadius();
    }
}
