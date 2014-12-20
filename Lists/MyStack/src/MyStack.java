import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * In order to save time, I'm going to implement the stack using Java's standard linked list. Of course I could do
 * everything from scratch rather easily, but seeing as how I just implemented linked list and stack is really just a
 * more restricted version of the linked list, I've decided this is sufficient to get the general idea.
 */
public class MyStack<E> {
    private LinkedList<E> stack;

    public MyStack() {
        stack = new LinkedList<E>();
    }

    /**
     * Push simply places the new element at the front of the array.
     */
    public void push(E e) {
        stack.addFirst(e);
    }

    /**
     * Pop removes and returns the element at the front of the array. Returns null if stack is empty.
     *
     * @return The element removed.
     */
    public E pop() {
        try {
            return stack.removeFirst();
        } catch (NoSuchElementException e) {
            return null;
        }

    }

    /**
     * Returns the element at the front of the array. (Without removing it) Returns null if stack is empty.
     *
     * @return the first element.
     */
    public E peek() {
        try {
            return stack.getFirst();
        } catch (NoSuchElementException e) {
            return null;
        }

    }

}
