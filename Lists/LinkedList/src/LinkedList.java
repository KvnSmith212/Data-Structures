/**
 * Singularly linked list using Node.
 */
public class LinkedList<E> {

    private Node<E> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    /**
     * Add to the front for O(1) time.
     *
     * @param e Generic element to be added to the list.
     */
    public void add(E e) {
        Node<E> n = new Node<E>(e);

        n.setNext(head);
        head = n;
        size++;
    }

    /**
     * Remove the first found node with the desired element from the list.
     *
     * @param e Generic element to be removed from the list.
     * @return The element being removed or null if no such element is in the list.
     */
    public E remove(E e) {
        Node<E> curr = head;
        E temp;

        if (head == null) {
            return null;
        }
        //Because we only have a next pointer and we must fix the pointers to remove the desired element, we must
        // search from one node behind. This results in head being left out, so we check that first as an edge case.
        else if (curr.getValue().equals(e)) {
            temp = curr.getValue();
            head = curr.getNext();

            size--;
            return temp;
        } else {
            while (curr.getNext() != null) {
                if (curr.getNext().getValue().equals(e)) {
                    temp = curr.getNext().getValue();
                    curr.setNext(curr.getNext().getNext());

                    size--;
                    return temp;
                } else {
                    curr = curr.getNext();
                }
            }
        }

        //because if it gets to here, nothing is found
        return null;
    }

    /**
     * Returns the value at the specified index.
     *
     * @param index The index of the value you want.
     * @return The value at the specified index.
     */
    public E valueAt(int index) {
        if (index >= size || index < 0) {
            return null;
        } else {
            Node<E> curr = head;

            for (int i = 0; i < size; i++) {
                if (i == index) {
                    return curr.getValue();
                } else {
                    curr = curr.getNext();
                }
            }
        }

        //because intellij is complaining at me
        return null;
    }

    /**
     * Gives a string representation of the list in the from of e1; e2; e3; ... eN
     *
     * @return the string representation.
     */
    public String toString() {
        String s = "";
        Node<E> curr = head;

        while (curr != null) {
            s = s + "; " + curr.getValue().toString();
            curr = curr.getNext();
        }

        return s;
    }

    /**
     * Returns the size of the linked list. ie how many nodes it contains.
     *
     * @return an integer representing the size of the list.
     */
    public int sizeOf() {
        return size;
    }
}
