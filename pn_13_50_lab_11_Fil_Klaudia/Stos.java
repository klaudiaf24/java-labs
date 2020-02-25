public class Stos<T> { // Last in, first out
    private Element<T> head = null;

    public void push(T obj) {
        Element<T> newEl = new Element<T>(obj);
        newEl.next = head;
        head = newEl;
    }

    public void pop() {
        this.head = head.next;
    }

    public String toString() {
        Element<T> temp = head;
        String toReturn = new String();
        while (temp != null) {
            toReturn += "{" + temp.getElement() + "} ";
            temp = temp.next;
        }
        return toReturn;
    }
}

class Element<T> {
    private T value;
    Element<T> next;

    public Element(T val) {
        this.value = val;
    }

    public T getElement() {
        return this.value;
    }

    public String toString() {
        return this.value.toString();
    }
}