package CollectionFramework;

import java.util.*;

public class HashSetBasic {
    static void main(String[] args) {

//        Set<Integer> set1=new HashSet<>();
//        Set<Integer> set2=new HashSet<>();
//
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//
//        set2.add(3);
//        set2.add(4);
//        set2.add(5);
//        set2.add(6);
//
//        System.out.println(set1);
//        set1.retainAll(set2);
//        System.out.println(set1);
//        System.out.println(set2);
//
//        System.out.println(set2.containsAll(set1));

//        Set<Integer> st = new HashSet<>();

//        Set<Integer> st= new LinkedHashSet<>() ;
//        st.add(40);
//        st.add(10);
//        st.add(10);
//        st.add(10);
//        st.add(10);
//        st.add(20);
//        st.add(20);
//        st.add(30);
//        st.add(40);
//
//        System.out.println(st);

        //HashedSet -> O(1)
        //LinkedHashedSet -> O(n)
        //TreeSet -> BST -> O(logn)

        Set<Integer> st= new TreeSet<>() ;
        st.add(40);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);


        System.out.println(st);
    }

}
