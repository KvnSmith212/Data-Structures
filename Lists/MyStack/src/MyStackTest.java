import static org.junit.Assert.*;

public class MyStackTest {

    @org.junit.Test
    public void testPush() throws Exception {
        MyStack<Integer> stack = new MyStack<Integer>();

        //Can't really check without peek, so I guess just push to make sure no funny business going on with a couple
        // pushes? Then more testing to be sure below for peak.
        stack.push(1);
        stack.push(2);

    }

    @org.junit.Test
    public void testPop() throws Exception {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);

        //Check for return value & then check to make sure empty
        assertEquals("FAILURE - Pop should return previously pushed", (Integer) 2, stack.pop());
        assertEquals("FAILURE - Pop should return second previously pushed", (Integer) 1, stack.pop());
        assertNull("FAILURE - Popping from empty stack should return null", stack.pop());
    }

    @org.junit.Test
    public void testPeek() throws Exception {
        MyStack<Integer> stack = new MyStack<Integer>();

        //Test empty stack, then add an element, then add another element.
        assertNull("FAILURE - Peek of empty stack should return null", stack.peek());
        stack.push(1);
        assertEquals("FAILURE - Peek should return head of stack", (Integer) 1, stack.peek());
        stack.push(2);
        assertEquals("FAILURE - Peek should return head of stack", (Integer) 2, stack.peek());
    }
}