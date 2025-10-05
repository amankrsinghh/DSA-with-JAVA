package OOPs;

import java.util.Arrays;

public class OOps_basic {

    ///  class is a user defined blueprint through an object is created
//    public static class Student {
//        String name;
//        int Roll_no;
//        String department;
//    }
//    public static void main(String[] args) {
//        Student s1 = new Student(); // Declaration of an object through Student class
//        ///  Object : - Class ka real-world instance. Har object ka apna state (data) aur behavior (methods) hota hai.
//        s1.name = "Aman";  // initialization
//        s1.Roll_no = 138018; // initialization
//        s1.department = "BTech CSE"; // initialization
//        System.out.println("Student Details:");
//        System.out.println("Name: "+s1.name);
//        System.out.println("Roll No: "+s1.Roll_no);
//        System.out.println("Department: "+s1.department);
//
//
//
//    }

    public static class Student { ///  Properties
        String name;
        int rollno;
        int marks;

        Student() { /// Default constructor
            this.name = "Satya";
            this.rollno = 20;
            this.marks = 200;
        }


        Student(int rollno, String name, int marks) { ///  parameterized constructor
            this.name = name;
            this.rollno = rollno;
            this.marks = marks;
        }

        void task() { /// function
            System.out.println("Hi my name is " + name);
            System.out.println("My roll No :- " + rollno);
            System.out.println("My marks is :- " + marks);
        }

    }

    static void main(String[] args) {

        Student aman = new Student(7, "Aman kr Singh", 100);
        aman.task();

        Student satya = new Student();
        satya.task();

    }






}
