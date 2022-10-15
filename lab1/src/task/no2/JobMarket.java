package task.no2;

import java.util.ArrayList;

/**
 * Tests if the given candidate students for internships at the given companies
 * have been selected for a phone interview.
 * It also returns a random student that applied for an internship at each
 * company.
 */
public class JobMarket {
    public static void main(String[] args) {
        ArrayList<Student> allStudents = new ArrayList<>();
        final double[] grades = {7.2, 6.8, 8.5, 9.7};
        int ct = 0;

        Student stud1 = new Student();
        stud1.setName("Gigel");
        stud1.setGrade(grades[ct++]);
        allStudents.add(stud1);

        Student stud2 = new Student();
        stud2.setName("Dorel");
        stud2.setGrade(grades[ct++]);
        allStudents.add(stud2);

        Student stud3 = new Student();
        stud3.setName("Marcel");
        stud3.setGrade(grades[ct++]);
        allStudents.add(stud3);

        Student stud4 = new Student();
        stud4.setName("Ionel");
        stud4.setGrade(grades[ct]);
        allStudents.add(stud4);

        ArrayList<Internship> allInternships = new ArrayList<>();
        final double[] minGrades = {9, 6.3, 7, 8.5};
        ct = 0;

        Internship inter1 = new Internship();
        inter1.setName("Google");
        inter1.setMinGrade(minGrades[ct++]);
        inter1.setStudents(allStudents);
        allInternships.add(inter1);

        Internship inter2 = new Internship();
        inter2.setName("Amazon");
        inter2.setMinGrade(minGrades[ct++]);
        inter2.setStudents(allStudents);
        allInternships.add(inter2);

        Internship inter3 = new Internship();
        inter3.setName("Facebook");
        inter3.setMinGrade(minGrades[ct++]);
        inter3.setStudents(allStudents);
        allInternships.add(inter3);

        Internship inter4 = new Internship();
        inter4.setName("Microsoft");
        inter4.setMinGrade(minGrades[ct]);
        inter4.setStudents(allStudents);
        allInternships.add(inter4);

        for (Internship internship : allInternships) {
            internship.chooseCandidatesForInterview();
        }

        System.out.println();

        for (Internship internship : allInternships) {
            System.out.println("Random candidate at "
                    + internship.getName() + ": "
                    + internship.chooseCandidateRandomly().getName());
        }
    }
}
