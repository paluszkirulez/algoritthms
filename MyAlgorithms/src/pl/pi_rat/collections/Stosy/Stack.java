package pl.pi_rat.collections.Stosy;

public class Stack {
    StackElement topElement;
    StackElement previousElement;
    int size = 0;
    boolean isEmpty(){
        return size==0;
    }
    void push(StackElement element){
        if(element== null){}
        else if(this.isEmpty()){
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

            this.size--;
            return tmpTop;
         } else if(this.size ==1){
            StackElement tmpTop = this.topElement;
            this.topElement = null;
            this.size--;
            return tmpTop;

        }else  {
            return null;
        }

    }


    Stack reversAdd() {
        Stack tmpStack = new Stack();
        int first = 1;
        while (this.peek() != null) {
            //System.out.println(this.size);
            //StackElement tmpEl = tmpStack.peek();

            tmpStack.push(this.pop());
            if (first == 1){
                tmpStack.peek().previousElement = null;
                first = first-1;
            }

        }
        return tmpStack;


    }
    StackElement reverse(StackElement myEl){
        StackElement tmpEl = myEl;
        myEl = myEl.previousElement;
        return tmpEl;

    }
    void sort(){

    }

    @Override
    public String toString() {
        return "Stack{" +
                "topElement=" + topElement +
                '}';
    }
}
