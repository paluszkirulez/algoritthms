package pl.pi_rat.collections.Stosy;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        //System.out.println(myStack.peek());
        myStack.push(new StackElement(21));
        myStack.push(new StackElement(32));
        myStack.push(new StackElement(33));
        myStack.push(new StackElement(34));
        myStack.push(new StackElement(35));
        //myStack.push(null);
        //myStack.peekAll();
        //myStack.reversAdd();
        myStack.peekAll();
        Stack reversedStack = myStack.reversAdd();
        reversedStack.peekAll();
        /*System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
        myStack.pop();
        myStack.pop();*/

    }
}
