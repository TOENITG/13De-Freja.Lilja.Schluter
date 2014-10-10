
package multi.dimensional.arrays.in.java;

import java.util.ArrayList;
import java.util.Iterator;



public class MultiDimensionalArraysInJava {

    
    public static void main(String[] args) {
        
        ArrayList listTest= new ArrayList ();
        
        listTest.add("first item");
        listTest.add("second item");
        listTest.add("third item");
        listTest.add(7);
        
        Iterator it= listTest.iterator();
        
        while (it.hasNext ()) {
            System.out.println(it.next ());
        }
        
        //REMOVE AN ITEM FROM THE LIST
        listTest.remove("second item");
        
        //PRINT OUT THE NEW LIST
        System.out.println("whole list=" + listTest);
        
        //GET THE ITEM AT INDEX POSITION 1
        System.out.println("position 1=" + listTest.get(1));
        
    }
    
}
