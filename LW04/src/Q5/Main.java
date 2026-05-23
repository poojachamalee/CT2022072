package Q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lecturer lecturer1 = new Lecturer("Dr. Muditha", "Database");
        Course course1 = new Course("Relational Schema", "CT22043");
        course1.setLecturer(lecturer1);

        Student student1 = new Student("Amal Silva", "Computer Science", "Relational Schema");

        System.out.println("Student Name     : " + student1.getStudentName());
        System.out.println("Degree Program   : " + student1.getDegreeName());
        System.out.println("Course Following : " + student1.getCourseFollowing());
        System.out.println("Course Code      : " + course1.getCourseCode());

        System.out.println("Assigned Lecturer: " + course1.getLecturer().getLecturerName());


    }

}
