package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Map {
    static void main() {

        List<Student1> students=new ArrayList<>();
        students.add(new Student1(19,"Om",50));
        students.add(new Student1(23,"Kunal",45));
        students.add(new Student1(22,"Anij",70));
        students.add(new Student1(7,"Soham",60));

        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);


//        List<Integer> list = new ArrayList<>();
//        list.add(15);
//        list.add(8);
//        list.add(2);
//        list.add(90);
//
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
    }
}
