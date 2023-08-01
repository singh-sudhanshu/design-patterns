package structural.adaptor;

public class Client {
    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(3);

        if (roundHole.doesFit(roundPeg)) {
            System.out.println("It does fit");
        } else {
            System.out.println("It does not fit");
        }

        SquarePeg squarePeg = new SquarePeg(6);
        // will not compile. Need adapter to solve this problem
        //roundHole.doesFit(squarePeg);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        if (roundHole.doesFit(squarePegAdapter)) {
            System.out.println("It does fit");
        } else {
            System.out.println("It does not fit");
        }

    }
}
