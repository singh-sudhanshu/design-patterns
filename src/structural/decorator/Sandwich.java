package structural.decorator;

import java.math.BigDecimal;

/**
 * Base class for all types of Sandwich, cost method is abstract because
 * different sandwiches has different price.
 *
 * @author Sudhanshu Singh
 */
public abstract class Sandwich {

    protected String description = "sandwich";

    public String getDescription() {
        return description;
    }

    public abstract BigDecimal price();
}
