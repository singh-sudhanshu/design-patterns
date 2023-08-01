package structural.adaptor;

public class SquarePeg {

    private final double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(this.getWidth(), 2);
    }
}
