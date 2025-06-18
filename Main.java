class Person {
    public void eat() {
        System.out.println("Person is eating.");
    }

/*************  ✨ Windsurf Command ⭐  *************/
/**
 * Causes the Person to sleep, simulating a sleeping action by printing
 * a message to the console.
 */

/*******  6b9f5b01-4b31-492d-ab95-99529fd2c8ac  *******/
    public void sleep() {
        System.out.println("Person is sleeping.");
    }
}

class Student extends Person {
    public void eat() {
        System.out.println("Student is eating.");
    }

    public void study() {
        System.out.println("Student is studying.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.eat();    // Calls eat() in Student
        student.sleep();  // Inherited from Person
        student.study();  // Defined in Student
    }
}