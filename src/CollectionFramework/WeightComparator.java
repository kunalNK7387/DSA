package CollectionFramework;

import java.util.Comparator;

public class WeightComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 student1, Student1 t1) {
        return student1.weight-t1.weight;
    }
}
