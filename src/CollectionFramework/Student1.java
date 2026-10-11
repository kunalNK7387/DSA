package CollectionFramework;

public class Student1 implements Comparable<Student1> {

    public int age;
    public String name;
    public int weight;

    public Student1(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student1 that) {
        // Sort students by age in ascending order
        if (this.age== that.age){
            return this.name.compareTo(that.name);
        };
        return Integer.compare( that.age,this.age);
    }

    @Override
    public String toString() {
        return "Student1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}