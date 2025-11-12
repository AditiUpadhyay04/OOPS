class Student {
    String name;
    int marks1, marks2, marks3;

    Student(String n, int m1, int m2, int m3) {
        name = n; marks1 = m1; marks2 = m2; marks3 = m3;
    }

    double getAverage() {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    void display() {
        System.out.println(name + "'s average marks: " + getAverage());
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Student s1 = new Student("Aditi", 85, 90, 80);
        s1.display();
    }
}

