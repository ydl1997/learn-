package day39;

public class Student {
   String name;
   int age;
   String no;
   float length;
    public Student() {
    }
    public Student(String name, int age, String no, float length) {
        this.name = name;
        this.age = age;
        this.no = no;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", no='" + no + '\'' +
                ", length=" + length +
                '}';
    }
}
