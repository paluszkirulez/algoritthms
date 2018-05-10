package pl.pi_rat.collections.Lists;

import java.util.Iterator;

public class List<T> implements Iterable<T> {
    private ListElement<T> First;
    private ListElement<T> Last;
    private int size = 0;


    public ListElement<T> getFirst() {
        return First;
    }


    public ListElement<T> getLast() {
        return Last;
    }


    public ListElement<T> get(int index) {
        ListElement<T> tmpEl = getFirst();
        //System.out.println(getFirst());
        int localSize = this.size - 1;
        ListElement<T> initEl = this.Last;
        if (index > localSize) {
            return null;
        }
        while (localSize >= 0) {
            if (localSize == index) {
                return initEl;
            } else {
                initEl = initEl.getPrevious();
            }
            localSize = localSize - 1;
        }
        return null;

    }


    public void add(ListElement<T> element) {
        if (isEmpty()) {
            this.First = element;
            this.Last = element;
            this.Last.setPrevious(null);
            this.Last.setNext(null);
        } else {
            this.Last.setNext(element);
            element.setPrevious(this.Last);
            this.Last = element;

        }

        this.size++;
    }


    public void remove(int index) {
        ListElement tmpEl = this.get(index);
        if(this.size ==1){
            this.First = null;
            this.Last = null;
        }
        else if (tmpEl.getPrevious() != null && tmpEl.getNext() != null) {
            tmpEl.getPrevious().setNext(tmpEl.getNext());
            tmpEl.getNext().setPrevious(tmpEl.getPrevious());
        } else if (tmpEl.getPrevious() == null && tmpEl.getNext() != null) {
            tmpEl.getNext().setPrevious(null);
            this.First = tmpEl.getNext();

        } else if (tmpEl.getPrevious() != null && tmpEl.getNext() == null) {
            tmpEl.getPrevious().setNext(null);
            this.Last = tmpEl.getPrevious();

        }

        this.size--;


    }

    public void getAll() {
        getNext(this.Last);
    }

    public ListElement<T> getNext(ListElement<T> nextElement) {
        if (nextElement.getPrevious() == null) {
            System.out.println(nextElement);
            return nextElement;
        } else {
            getNext(nextElement.getPrevious());
            System.out.println(nextElement);
            return nextElement;
        }

    }

    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public Iterator<T> iterator() {
        return new IteratorListy();

    }

    public List<T> reverse() {
        List<T> tmpList = new List<T>();

        ListElement<T> intEl = this.Last;
        ListElement<T> tmp = this.Last;
        while (tmp != null) {

            tmp = intEl.getPrevious();
            tmpList.add(intEl);
            intEl = tmp;

        }

        return tmpList;
    }

    private class IteratorListy implements Iterator<T> {
        private ListElement<T> tmpEl = First;

        @Override
        public boolean hasNext() {

            return tmpEl != null;
        }

        @Override
        public T next() {
            T tmp = tmpEl.value;
            tmpEl = tmpEl.getNext();
            return tmp;
        }
    }

    public List<T> sort(){

        boolean nothingChanged = false;
        while(!nothingChanged){
            int myIterator = 0;
            while(myIterator<this.size-2){
                ListElement<T> tmpElement = null;
                if(this.get(myIterator).compareTo(this.get(myIterator+1).value) == 1){
                    for(int i = myIterator+1;myIterator<=this.size-2;myIterator++){
                        if(this.get(myIterator).compareTo(this.get(i).value) == 1){

                        }
                    }

                }
            }
        }

        return null;
    }
}
