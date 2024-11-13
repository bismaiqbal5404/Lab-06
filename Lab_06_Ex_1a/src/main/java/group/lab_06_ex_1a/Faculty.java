package group.lab_06_ex_1a;

import java.util.ArrayList;

public class Faculty {
    
   private String facultyName;
   private String facultyDesignation;
   private String facultyEmail;
   private String facultyContact;
   private int facultySalary;
    private int facultyId;
   private ArrayList<Course> courseList;

    public Faculty(String facultyName, String facultyDesignation, String facultyEmail, String facultyContact, int facultySalary, int facultyId) {
        this.facultyName = facultyName;
        this.facultyDesignation = facultyDesignation;
        this.facultyEmail = facultyEmail;
        this.facultyContact = facultyContact;
        this.facultySalary = facultySalary;
        this.facultyId = facultyId;
        this.courseList = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courseList.add(course);
    }
    public void displayFacultyDetails() {
        System.out.println("Faculty Name: " + facultyName + 
                           ", Designation: " + facultyDesignation + 
                           ", Email: " + facultyEmail + 
                           ", Contact: " + facultyContact + 
                           ", Salary: " + facultySalary + 
                           ", ID: " + facultyId);
        System.out.println("Assigned Courses: ");
        for (Course course : courseList) {
            course.displayCourseDetails();
        }
    }
}
