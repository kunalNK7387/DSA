package CollectionFramework;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class ArrayList1 {
    static void main() {
        //ArrayList
        ArrayList<Integer> arrlist = new ArrayList<>();

        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);
        System.out.println(arrlist);
        arrlist.add(40);

        arrlist.remove(0);
        System.out.println(arrlist);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(101);
        arrayList2.add(102);

        arrlist.addAll(arrayList2);
        System.out.println(arrlist);

        arrlist.removeAll(arrayList2);
        System.out.println(arrlist);

        System.out.println(arrlist.size());

        System.out.println("list 2 " + arrayList2);

        arrayList2.clear();
        System.out.println("list 2 " + arrayList2);

        Iterator<Integer> iterator = arrlist.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element : " + iterator.next());
        }


        List<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(12);
        list.add(14);
        System.out.println(list.get(1));
        System.out.println("before:" + list);
        list.set(0, 100);
        System.out.println(list);


        //toArray
        Object[] arr = list.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        //Contains
        System.out.println(list.contains(100));


//        Collection<Integer> collection = new ArrayList<>();

        arrlist.add(12);
        arrlist.add(6);
        System.out.println("printing 1st list :"+arrlist);

        //sort
        Collections.sort(arrlist);
        System.out.println("printing sorted list :"+arrlist);

        Collections.sort(arrlist,Collections.reverseOrder());
        System.out.println("printing sorted list :"+arrlist);

        //Clone
        ArrayList<Integer> newList= (ArrayList<Integer>) arrlist.clone();
        System.out.println("New ArrLlist: "+arrlist);

        //ensureCapacity
        ArrayList<Integer> marks=new ArrayList<>();
        marks.ensureCapacity(100);

        //isEmpty
        System.out.println(newList.isEmpty());

        //indexOf
        System.out.println(newList.indexOf(20));



        //LINKEDLIST
        List<Integer> arr1 = new LinkedList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);
        arr1.add(40);

        System.out.println("LinkedList : "+arr1);

    }
}
