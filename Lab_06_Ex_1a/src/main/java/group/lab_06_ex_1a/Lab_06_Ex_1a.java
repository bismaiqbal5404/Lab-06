package group.lab_06_ex_1a;

public class Lab_06_Ex_1a {

    public static void main(String[] args) {
       
        Course course1 = new Course("CS101", "Computer Programming", "3");
        Course course2 = new Course("CS102", "Object Oriented Programming", "3");

        Faculty faculty1 = new Faculty("Miss Samina ", "Professor", "samina@example.com", "1234567890", 80000, 1);
        Faculty faculty2 = new Faculty("Talat", "Associate Professor", "talath@example.com", "12368342", 70000, 2);

        faculty1.assignCourse(course1);
        faculty2.assignCourse(course2);

        Department csDepartment = new Department("Computer Science");

        csDepartment.addFaculty(faculty1);
        csDepartment.addFaculty(faculty2);

        csDepartment.addCourse(course1);
        csDepartment.addCourse(course2);

        csDepartment.displayDepartmentDetails();
    }
}
