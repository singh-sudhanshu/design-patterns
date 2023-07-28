package structural.decorator;

import java.math.BigDecimal;

/**
 * A Decorator class, which adds cheese (new functionality) into Sandwich object.
 * This Decorator class modifies price() and description to implement
 * new behaviour.
 *
 * @author Sudhanshu Singh
 */
public class CheeseDecorator extends SandwichDecorator {

    private final Sandwich sandwich;

    public CheeseDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + " with cheese";
    }

    @Override
    public BigDecimal price() {
        return sandwich.price().add(BigDecimal.ONE);
    }
}
