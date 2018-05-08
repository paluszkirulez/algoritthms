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

            tmpStack.push(this.pop());
            if (first == 1){
                tmpStack.peek().previousElement = null;
                first = first-1;
            }

        }
        return tmpStack;
    }




    Stack sort(){
        Stack tmpStack = new Stack();
        Stack tmpStack2 = new Stack();
        tmpStack.push(this.pop());
        tmpStack2.push(this.pop());
        int i = 0;
        while(i <100){
            if(tmpStack2.peek() != null && tmpStack.peek().element>tmpStack2.peek().element){
                tmpStack.push(tmpStack2.pop());
            }
            if(this.peek() != null && tmpStack.peek().element>this.peek().element){
                tmpStack.push(this.pop());
            }
            if(tmpStack.peek() != null && this.peek().element>tmpStack.peek().element){
                this.push(tmpStack.pop());
            }
            if(tmpStack2.peek() != null && this.peek().element>tmpStack2.peek().element){
                this.push(tmpStack2.pop());
            }
            if(tmpStack.peek() != null && tmpStack2.peek().element>tmpStack.peek().element){
                tmpStack2.push(tmpStack.pop());
            }
            if(this.peek() != null && tmpStack2.peek().element>this.peek().element){
                tmpStack2.push(this.pop());
            }
            i++;
            System.out.println(tmpStack);
            System.out.println(tmpStack2);


        }




        return tmpStack;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "topElement=" + topElement +
                '}';
    }
}
