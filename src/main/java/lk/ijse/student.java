package lk.ijse;

import java.io.Serializable;

public class student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private double grade;

    public student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + "}";
    }
}
