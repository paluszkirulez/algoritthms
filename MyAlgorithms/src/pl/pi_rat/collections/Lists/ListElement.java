package pl.pi_rat.collections.Lists;

import com.sun.xml.internal.ws.spi.db.FieldSetter;

import java.util.Iterator;

public class ListElement<T>  {
    T value;
    private ListElement<T> Next;
    private ListElement<T> Previous;
    //private int index;



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
}
