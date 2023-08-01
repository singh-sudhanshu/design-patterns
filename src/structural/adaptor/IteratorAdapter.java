package structural.adaptor;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * This is using the Object Adapter pattern which uses the composition and delegates the method.
 *
 * @author sudhanshu
 */
public class IteratorAdapter<E> implements Iterator<E> {

    private final Enumeration<E> enumeration;

    public IteratorAdapter(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }
}
