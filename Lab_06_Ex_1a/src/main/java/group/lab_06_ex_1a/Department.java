package group.lab_06_ex_1a;

import java.util.ArrayList;

public class Department {
    
    private String departmentName;
    private ArrayList<Faculty> departmentFaculty;
    private ArrayList<Course> offeredCourses;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.departmentFaculty = new ArrayList<>();
        this.offeredCourses = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        departmentFaculty.add(faculty);
    }

    public void addCourse(Course course) {
        offeredCourses.add(course);
    }
    public void displayDepartmentDetails() {
        System.out.println("Department Name: " + departmentName);

        System.out.println("Faculty Members: ");
        for (Faculty faculty : departmentFaculty) {
            faculty.displayFacultyDetails();
            System.out.println(); 
        }
        System.out.println("Offered Courses: ");
        for (Course course : offeredCourses) {
            course.displayCourseDetails();
        }
    }
}
