package org.example.code_smells.refactoring_techniques.part_2;

import java.util.ArrayList;
import java.util.List;

public class Change_Unidirectional_Associatin_to_Bidirectional {

    public class Student {
        private String name;
        private List<Course> courses;
        public Student(String name) {
            this.name = name;
            this.courses = new ArrayList<>();
        }
        public void enrollCourse(Course course) {
            courses.add(course);
            course.addStudent(this);
        }
        // Додаткові методи...
    }

    public class Course {
        private String title;
        private List<Student> students;
        public Course(String title) {
            this.title = title;
        }

        public void addStudent(Student student){
            students.add(student);
        }
        // Додаткові методи...
    }
}
