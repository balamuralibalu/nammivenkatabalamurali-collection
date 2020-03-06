package registration.collection;
/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        List list = new List();
        System.out.println("Initial size: "+list.size());
        list.add(9);
        list.add(1);
        list.add(4);
       list.add(2);
        System.out.println("After insertion: "+list.size());
        System.out.println(list);
        list.removeByIndex(1);
        System.out.println(list);
        for(int i=0;i<10;i++)
        {
        	list.add(i*10);
        }
        list.removeByValue(20);
        System.out.println(list);
        List arr1 = new List();
        arr1.add(12);
        System.out.println(arr1);
        arr1.removeByValue(12);
        arr1.add(13);
        arr1.removeByValue(1);
    }
}
