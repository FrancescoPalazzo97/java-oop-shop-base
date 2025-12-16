package org.lessons.java.snacks.snack1;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Francesco", "Palazzo", 28);
        Student student2 = new Student("Mario", "Rossi", 29);

        System.out.println(student1.getStudentInfo());
        System.out.println(student2.getStudentInfo());
    }
}
