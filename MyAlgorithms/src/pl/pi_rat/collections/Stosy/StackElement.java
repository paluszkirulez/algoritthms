package pl.pi_rat.collections.Stosy;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StackElement)) return false;
        StackElement that = (StackElement) o;
        return element == that.element;
    }

    @Override
    public int hashCode() {

        return Objects.hash(element);
    }
}
