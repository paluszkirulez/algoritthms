package pl.pi_rat.collections.Stosy;

public class StackElement {
    int element;
    StackElement previousElement;

    public StackElement(int element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "StackElement{" +
                "element=" + element +

                '}';
    }
}
