package student;

import java.util.Scanner;

public class Student {

    private String name;
    private String sName;
    private String lName;

    public Student(String name, String sName, String lName) {
        if (!name.isBlank() && lName.isBlank()) {
            throw new StudentCreationException("You can`t init student with name but without last name", name, sName, lName);
        }
        this.name = name;
        this.sName = sName;
        this.lName = lName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sName='" + sName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student;

        try {
            student = createStudent();
        } catch (StudentCreationException ex) {
            student = new Student("AAA", "BBB", "CCC");
            ex.printStackTrace();
        } catch (Exception ex) {
            student = new Student("AAA", "BBB", "EX");
        }

        System.out.println(student);
    }

    public static Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        String lName = scanner.nextLine();

        return new Student("AAA", "BBB", lName);
    }
}
