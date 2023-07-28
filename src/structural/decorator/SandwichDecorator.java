package structural.decorator;

import java.math.BigDecimal;

/**
 * Base class for Decorators, this class inherit from Sandwich, so that
 * it can be of same type, which is required to pass decorators where original object is expected.
 * Later, this class will also come handy to provide common functionalities to Decorators.
 *
 * @author Sudhanshu Singh
 */
public abstract class SandwichDecorator extends Sandwich {

    public abstract BigDecimal price();
}
