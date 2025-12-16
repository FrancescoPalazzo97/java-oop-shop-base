package org.lessons.java.snacks.snack3;

import org.lessons.java.snacks.snack1.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Francesco", "Palazzo", 28);
        Student student2 = new Student("Mario", "Rossi", 28);
        Student student3 = new Student("Elena", "Bianchi", 28);
        Student student4 = new Student("Marco", "Andreotti", 28);
        Student student5 = new Student("Andrea", "Gialli", 28);
        Student student6 = new Student("Gianni", "Franchi", 28);

        StudentRegister classe5A = new StudentRegister();
        StudentRegister classe5B = new StudentRegister();

        classe5A.addStudent(student1);
        classe5A.addStudent(student2);
        classe5A.addStudent(student3);

        classe5B.addStudent(student4);
        classe5B.addStudent(student5);
        classe5B.addStudent(student6);

        classe5A.getStudents();
        classe5B.getStudents();
    }
}
