package org.lessons.java.snacks.snack3;

import org.lessons.java.snacks.snack1.Student;

public class StudentRegister {
    private Student[] studentList;
    private int arrayLength = 0;

    public StudentRegister() {
        this.studentList = new Student[arrayLength];
    }

    public void addStudent(Student newStudent) {
        System.out.println("Aggiungo nuovo studente: " + newStudent.getStudentInfo());
        this.arrayLength++;
        System.out.println("Lunghezza array: " + this.arrayLength);
        Student[] newStudentList = new Student[this.arrayLength];
        int i = 0;
        while (i < studentList.length) {
            newStudentList[i] = studentList[i];
            i++;
        }
        newStudentList[i] = newStudent;
        this.studentList = newStudentList;
    }

    public void getStudents() {
        System.out.println("Stampo studenti");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(i + ": " + studentList[i].getStudentInfo());
        }
    }
}
