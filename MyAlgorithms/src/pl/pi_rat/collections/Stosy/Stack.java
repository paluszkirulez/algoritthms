package pl.pi_rat.collections.Stosy;

public class Stack {
    StackElement topElement;
    StackElement previousElement;
    int size = 0;
    boolean isEmpty(){
        return size==0;
    }
    void push(StackElement element){
        if(this.isEmpty()){
            this.topElement = element;
            this.size++;
        }
        else{
            element.previousElement = this.topElement;
            this.topElement = element;
            this.size++;
        }

    }
    StackElement peek(){
        return topElement;
    }


    void peekAll(){
        peekPrevious(this.topElement);

    }
    StackElement peekPrevious(StackElement previous){
        StackElement myEl = previous.previousElement;
        if(myEl!=null){
        peekPrevious(myEl);
            System.out.println(previous);
        return myEl;
        }
        else {
            System.out.println(previous);
            return previous;
        }

    }
    StackElement pop(){
        if(this.size>1) {

            StackElement tmpTop = this.topElement;
            this.topElement = this.topElement.previousElement;
            this.previousElement = this.topElement.previousElement;
            //this.previousElement = this.topElement.previousElement;
            //System.out.println(size);
            this.size--;
            return tmpTop;
        } else if(this.size ==1){
            this.topElement = null;
            this.size--;
            return this.topElement;

        }else  {
            return null;
        }

    }


}
