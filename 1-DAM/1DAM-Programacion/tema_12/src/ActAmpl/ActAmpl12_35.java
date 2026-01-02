package ActAmpl;

import java.util.HashSet;
import java.util.Set;

class Course {
    private String name;
    private Set<String> students;

    public Course(String name) {
        this.name = name;
        this.students = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<String> getStudents() {
        return students;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void removeStudent(String student) {
        students.remove(student);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Course other = (Course) obj;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

class CourseManager {
    private Set<Course> courses;

    public CourseManager() {
        this.courses = new HashSet<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addAlumn(String courseName, String student) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                course.addStudent(student);
                break;
            }
        }
    }

    public void removeAlumn(String courseName, String student) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                course.removeStudent(student);
                break;
            }
        }
    }

    public Set<String> listAlumns(String courseName) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                return new HashSet<>(course.getStudents());
            }
        }
        return new HashSet<>();
    }

    public Set<String> listAlumnsBothCourses(String courseName1, String courseName2) {
        Set<String> students1 = null;
        Set<String> students2 = null;
        for (Course course : courses) {
            if (course.getName().equals(courseName1)) {
                students1 = new HashSet<>(course.getStudents());
            } else if (course.getName().equals(courseName2)) {
                students2 = new HashSet<>(course.getStudents());
            }
        }
        if (students1 != null && students2 != null) {
            students1.retainAll(students2);
            return students1;
        }
        return new HashSet<>();
    }

    public Set<String> listAlumnsDifference(String courseName1, String courseName2) {
        Set<String> students1 = null;
        Set<String> students2 = null;
        for (Course course : courses) {
            if (course.getName().equals(courseName1)) {
                students1 = new HashSet<>(course.getStudents());
            } else if (course.getName().equals(courseName2)) {
                students2 = new HashSet<>(course.getStudents());
            }
        }
        if (students1 != null && students2 != null) {
            students1.removeAll(students2);
            return students1;
        }
        return new HashSet<>();
    }

    public static void main(String[] args) {
        CourseManager manager = new CourseManager();

        Course course1 = new Course("Math");
        Course course2 = new Course("Science");
        Course course3 = new Course("History");

        // Agregar estudiantes únicos a "Math"
        course1.addStudent("MathStudent1");
        course1.addStudent("MathStudent2");
        course1.addStudent("MathStudent3");
        course1.addStudent("MathStudent4");
        course1.addStudent("MathStudent5");

        // Agregar estudiantes únicos a "Science"
        course2.addStudent("ScienceStudent1");
        course2.addStudent("ScienceStudent2");
        course2.addStudent("ScienceStudent3");
        course2.addStudent("ScienceStudent4");
        course2.addStudent("ScienceStudent5");

        // Agregar estudiantes únicos a "History"
        course3.addStudent("HistoryStudent1");
        course3.addStudent("HistoryStudent2");
        course3.addStudent("HistoryStudent3");
        course3.addStudent("HistoryStudent4");
        course3.addStudent("HistoryStudent5");

        manager.addCourse(course1);
        manager.addCourse(course2);
        manager.addCourse(course3);

        manager.removeAlumn("Math", "MathStudent3");

        System.out.println("Students in Math: " + manager.listAlumns("Math"));
        System.out.println("Students in both Math and Science: " + manager.listAlumnsBothCourses("Math", "Science"));
        System.out.println("Students in Math but not in Science: " + manager.listAlumnsDifference("Math", "Science"));
    }
}
