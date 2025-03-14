package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {    
        List<Integer> obj = new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(1,15);
        System.out.println(obj);

        List<Integer> newobj = new LinkedList<>();
        newobj.add(100);
        newobj.add(200);
        System.out.println(newobj);

        obj.addAll(newobj);
        System.out.println(obj);

        System.out.println(obj.contains(300));

        for (int i=0;i<obj.size();i++) {
            System.out.println(obj.get(i));
        }

        if(obj.contains(3000)) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }

        System.out.println(obj.get(4));
        System.out.println(obj.remove(1));
        System.out.println(obj);

        System.out.println(obj.remove(Integer.valueOf(200)));
        System.out.println(obj);
        obj.clear();
        System.out.println(obj);
    }
}
