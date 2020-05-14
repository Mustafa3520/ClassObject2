package day30;
class Student {
    String firstName;
    String lastName;
    double examResult;

    //constructors: are special methods, which creates an object of class
    //default constructor
    public Student() {
        firstName = "John";
        lastName = "Black";
        examResult = 95.7;
    }

    //overloaded constructor
    public Student(String fname, String lname, double result) {
        firstName = fname;
        lastName = lname;
        examResult = result;
    }

    //overloaded constructor
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "FirstName: " + this.firstName+" "+this.lastName+" "+this.examResult;
    }
}
public class JavaConstructor {
    public static void main(String[] args) {
        Student student1 = new Student("seda","oz",12.9);
        System.out.println(student1);
        Student student2 = new Student("ayse","ayhan",81.2);
        System.out.println(student2);



    }


}
