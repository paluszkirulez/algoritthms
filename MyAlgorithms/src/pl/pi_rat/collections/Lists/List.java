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
        int localSize = this.size;
        while(localSize>0){
            if (tmpEl.getIndex() == index){
                return tmpEl;
            }
            else{
                tmpEl = tmpEl.getNext();
            }
            localSize = localSize-1;
        }
        return null;

    }


    public void add(ListElement<T> element) {
        if(isEmpty()){
            this.First = element;
            this.Last = element;
            this.Last.setPrevious(null);
            this.Last.setNext(null);
        }
        else {
            this.Last.setNext(element);
            element.setPrevious(this.Last);
            this.Last = element;
            element.setIndex(this.size);
        }

        this.size++;
    }


    public void remove(int index) {
        ListElement tmpEl = this.get(index);
        if(tmpEl.getPrevious()!=null && tmpEl.getNext()!=null){
            tmpEl.getPrevious().setNext(tmpEl.getNext());
            tmpEl.getNext().setPrevious(tmpEl.getPrevious());
        }
        else if(tmpEl.getPrevious()==null && tmpEl.getNext()!=null){
            tmpEl.getNext().setPrevious(null);
            this.First = tmpEl.getNext();
        }
        else if(tmpEl.getPrevious()!=null && tmpEl.getNext()==null){
            tmpEl.getPrevious().setNext(null);
            this.Last=tmpEl.getPrevious();
        }

        this.size--;


    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size ==0;
    }




    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
