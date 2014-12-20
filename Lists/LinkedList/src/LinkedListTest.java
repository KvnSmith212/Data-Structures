import static org.junit.Assert.*;

public class LinkedListTest {

    @org.junit.Test
    public void testAdd() throws Exception {
        LinkedList<Integer> test = new LinkedList<Integer>();
        test.add(3);
        test.add(2);
        test.add(1);
        test.add(0);

        //oops, did these backwards. Should be expected, then actual. Will fix in future tests.
        //Simple testing for add, just make sure everything is where it should be and size is correct.
        assertEquals("FAILURE - Should return 0", test.valueAt(0), (Integer) 0);
        assertEquals("FAILURE - Should return 1", test.valueAt(1), (Integer) 1);
        assertEquals("FAILURE - Should return 2", test.valueAt(2), (Integer) 2);
        assertEquals("FAILURE - Should return 3", test.valueAt(3), (Integer) 3);

        assertEquals("FAILURE - Size should be 4", test.sizeOf(), 4);
    }

    @org.junit.Test
    public void testRemove() throws Exception {
        LinkedList<Integer> test = new LinkedList<Integer>();

        //Removing only one thing in list should result in empty list.
        test.add(1);
        assertEquals("FAILURE - Should return object removed", (Integer) 1, test.remove(1));
        assertNull("FAILURE - Empty list should have null head", test.valueAt(0));

        test.add(5);
        test.add(4);
        test.add(3);
        test.add(2);
        test.add(1);
        test.add(0);

        //Testing an element within the list should update pointers appropriately.
        assertEquals("FAILURE - Removal should return object removed", (Integer) 3, test.remove(3));
        assertEquals("FAILURE - Should be 2", (Integer) 2, test.valueAt(2));
        assertEquals("FAILURE - Should be 4", (Integer) 4, test.valueAt(3));

        //Testing edge cases back, front, and not in list.
        assertEquals("FAILURE - Removal should return object removed", (Integer) 5, test.remove(5));
        assertNull("FAILURE - Removed object should return null", test.valueAt(4));
        assertEquals("FAILURE - Removal should return object removed", (Integer) 0, test.remove(0));
        assertEquals("FAILURE - Front after removal should be next in line", (Integer) 1, test.valueAt(0));
        assertNull("FAILURE - Removal of item not in list should return null", test.remove(8));


    }

    @org.junit.Test
    public void testValueAt() throws Exception {
        LinkedList<Integer> test = new LinkedList<Integer>();
        test.add(3);
        test.add(2);
        test.add(1);
        test.add(0);

        //Test a value within the list
        assertEquals("FAILURE - should return the correct value at the specified index", (Integer) 2, test.valueAt(2));

        //Test a value at each end
        assertEquals("FAILURE - should return the first element in list", (Integer) 0, test.valueAt(0));
        assertEquals("FAILURE - should return the last element in the list", (Integer) 3, test.valueAt(test.sizeOf()
                - 1));

        //Test a negative value and a positive value > index
        assertNull("FAILURE - negative index should return null", test.valueAt(-1));
        assertNull("FAILURE - index >= size should return null", test.valueAt(test.sizeOf()));
    }
}