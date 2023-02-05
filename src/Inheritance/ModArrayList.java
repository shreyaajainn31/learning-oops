package Inheritance;

import java.util.ArrayList;

public class ModArrayList<T> extends ArrayList<T> {
        
    public T getModValue(int index){
        int length = this.size();
        System.out.println("length is: "+ length);
        index = Math.abs(index);
        System.out.println("Index is: " + (index % length));
        return this.get(index % length);

    }

}
