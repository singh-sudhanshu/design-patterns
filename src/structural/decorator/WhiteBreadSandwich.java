package structural.decorator;

import java.math.BigDecimal;

/**
 * A Concrete implementation of abstract Sandwich class, which represent a WhiteBread.
 * Sandwich, whose price is 3.0$.
 *
 * @author Sudhanshu Singh
 */

public class WhiteBreadSandwich extends Sandwich {

    public WhiteBreadSandwich(String desc) {
        description = desc;
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(Math.abs(3.0));
    }
}
