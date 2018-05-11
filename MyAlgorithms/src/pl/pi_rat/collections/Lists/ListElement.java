package pl.pi_rat.collections.Lists;

import com.sun.xml.internal.ws.spi.db.FieldSetter;

import java.util.Iterator;
import java.util.Objects;

public class ListElement<T>  {
    T value;
    private ListElement<T> Next;
    private ListElement<T> Previous;
    //private int index;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListElement)) return false;
        ListElement<?> that = (ListElement<?>) o;
        return Objects.equals(value, that.value) &&
                Objects.equals(Next, that.Next) &&
                Objects.equals(Previous, that.Previous);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value, Next, Previous);
    }

    @Override
    public String toString() {
        return "ListElement{" +
                "value=" + value +
                '}';
    }



    public ListElement(T value){
        this.value = value;

    }

    public ListElement<T> getNext() {
        return Next;
    }

    public void setNext(ListElement<T> next) {
        Next = next;
    }

    public ListElement<T> getPrevious() {
        return Previous;
    }

    public void setPrevious(ListElement<T> previous) {
        Previous = previous;
    }

        public int compareTo(T other) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        if (this.toString() == other.toString()) return EQUAL;

        if (this.hashCode()< other.hashCode()) return BEFORE;
        else return AFTER;

    }
}
