package student;
class Student {
    String name;
    int age;
    int studentID;
    boolean isStudentIDValid;
    byte semesterNumber;
    byte averageGrade;

    public void sayHello() {
        System.out.println("Hello from " + name);
    }

    public void displayName() {
        System.out.println(name);
    }

    public void displayAge() {
        System.out.println(age);
    }

    public void semesterNumber() {
        System.out.println(semesterNumber);
    }

    public void nameSemesterNumberAvgGrade() {
        System.out.println(name);
        System.out.println(semesterNumber);
        System.out.println(averageGrade);
    }

    public void changeStatusOfStudentIDCard() {
        isStudentIDValid = !isStudentIDValid;
    }

    public void nameIDVALID() {
        System.out.println(name);
        System.out.println(studentID);
        System.out.println(isStudentIDValid);
    }

    
}


public class StudentTest {
    public static void main(String[] args) {
        // Object creation
        Student s1 = new Student();
        
        // Object manipulation
        s1.name = "Peter";
        s1.age = 21;

        // Calling the methods of the Student class
        s1.sayHello();
        s1.displayName();
        s1.displayAge();
        System.out.println("");


        Student s2 = new Student();

        s2.name = "John";
        s2.age = 17;
        s2.studentID = 12121;
        s2.semesterNumber = 5;

        System.out.println("");
        s2.nameIDVALID();
        System.out.println("");
        s2.displayAge();
        System.out.println("");
        s2.semesterNumber();
        System.out.println("");
        s2.changeStatusOfStudentIDCard();
    }
}
