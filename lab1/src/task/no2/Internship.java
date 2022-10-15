package task.no2;

import java.util.Random;
import java.util.ArrayList;
public class Internship {
    private String name;
    private double minGrade;
    private ArrayList<Student> students;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinGrade(double minGrade) {
        this.minGrade = minGrade;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    /**
     * @return random candidate student for the internship
     */
    Student chooseCandidateRandomly() {
        var rand = new Random();
        var randStudent = rand.nextInt(students.size());
        return students.get(randStudent);
    }

    /**
     * Shows all candidate students selected for a phone interview.
     */
    void chooseCandidatesForInterview() {
        for (Student student : students) {
            if (student.getGrade() >= minGrade) {
                System.out.println("Candidate " + student.getName()
                        + " got a phone interview at " + name);
            }
        }
    }
}
