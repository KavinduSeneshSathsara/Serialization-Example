package lk.ijse;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        student student = new student(1, "Alice", 4.0);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
            System.out.println("Student object serialized to student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
