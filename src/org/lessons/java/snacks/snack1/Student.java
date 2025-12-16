package org.lessons.java.snacks.snack1;

public class Student {
    private String name;
    private String surname;
    private int age;

    public Student(String name, String surname, int age) {
        if (name.trim() != "" && surname.trim() != "" && age > 0) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        } else {
            System.out.println("Valori inseriti non validi!");
        }
    }

    public String getStudentInfo() {
        if (this.name != null && this.surname != null && this.age > 0) {
            return name + " " + surname + ", " + age + "anni";
        } else {
            return "Impossibile recuperare i valori";
        }
    }
}
