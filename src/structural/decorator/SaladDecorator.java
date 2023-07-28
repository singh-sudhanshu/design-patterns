package structural.decorator;


import java.math.BigDecimal;

/**
 * A Decorator class, which adds cheese (new functionality) into Sandwich object.
 * This Decorator class modifies price() and description to implement
 * new behaviour.
 *
 * @author Sudhanshu Singh
 */
public class SaladDecorator extends SandwichDecorator {

    private final Sandwich sandwich;

    public SaladDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + " with salad";
    }

    @Override
    public BigDecimal price() {
        return sandwich.price().add(BigDecimal.TEN);
    }
}
