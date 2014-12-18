/**
 * Created by kvnsm_000 on 12/18/2014.
 */
public class Test {

    public static void main(String[] args){
        LinkedList<Integer> test = new LinkedList<Integer>();
        test.add(1);
        test.add(2);
        test.add(3);
        //test.remove(2);

        System.out.println(test.valueAt(0));
        System.out.println(test.valueAt(1));
        System.out.println(test.valueAt(3));

        //System.out.println(test.toString());


    }
}
