package Tuple;

// TODO: Auto-generated Javadoc
/**
 * The Class Tuple.
 *
 * @param <X> the generic type
 * @param <Y> the generic type
 */
public class Tuple<X,Y>{ 
    
    /** The x. */
    public final X x; 
    
    /** The y. */
    public final Y y; 
    
    /**
     * Instantiates a new tuple.
     *
     * @param x the x
     * @param y the y
     */
    public Tuple(X x, Y y) { 
        this.x = x; 
        this.y = y; 
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    /**
     * Equals.
     *
     * @param other the other
     * @return true, if successful
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Tuple)){
            return false;
        }

        Tuple<X,Y> other_ = (Tuple<X,Y>) other;

        return other_.x.equals(this.x) && other_.y.equals(this.y);
    }

    /**
     * Hash code.
     *
     * @return the int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((x == null) ? 0 : x.hashCode());
        result = prime * result + ((y == null) ? 0 : y.hashCode());
        return result;
    }
}