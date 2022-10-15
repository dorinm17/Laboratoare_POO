package task.no3;

import task.no2.Student;

public class TestEquality {
    public static void main(String[] args) {
        final double grade = 7.2;

        Student student1 = new Student();
        student1.setName("Gigel");
        student1.setGrade(grade);

        Student student2 = new Student();
        student2.setName("Gigel");
        student2.setGrade(grade);

        System.out.println(student1.equals(student2));
    }
}
