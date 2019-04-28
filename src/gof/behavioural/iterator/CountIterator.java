package gof.behavioural.iterator;

public class CountIterator implements java.util.Enumeration
{
    public int x;

    public CountIterator(){

    }

    /**
     * Tests if this enumeration contains more elements.
     *
     * @return <code>true</code> if and only if this enumeration object
     * contains at least one more element to provide;
     * <code>false</code> otherwise.
     */
    @Override
    public boolean hasMoreElements() {
        if(x<10){
            return true;
        }
        return false;
    }

    /**
     * Returns the next element of this enumeration if this enumeration
     * object has at least one more element to provide.
     *
     * @return the next element of this enumeration.
     * @throws NoSuchElementException if no more elements exist.
     */
    @Override
    public Object nextElement() {
        return x++;
    }
}
