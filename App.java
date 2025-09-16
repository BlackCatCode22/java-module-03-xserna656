// App.java
// XS 9/12/25

public class App{
    public static void main(String [] args) {

        // Create a student
        Student myStudent = new Student();
        myStudent.firstName = "xavier";
        myStudent.lastName = "Serna";
        myStudent.major = "Developer";
        myStudent.gpa = 1.7;
        myStudent.age =  19;
        myStudent.onProbation = true;

        // Create a second student
        Student myStudent2 = new Student();
        myStudent2.firstName = "Pam";
        myStudent2.lastName = "Beasley";
        myStudent2.major = "Art";
        myStudent2.gpa = 3.1;
        myStudent2.age =  24;
        myStudent2.onProbation = false;


        System.out.println(myStudent.firstName);
        System.out.println(myStudent.lastName);
        System.out.println(myStudent.major);
        System.out.println(myStudent.gpa);
        System.out.println(myStudent.age);
        System.out.println(myStudent.onProbation);

        System.out.println(myStudent2.firstName);
        System.out.println(myStudent2.lastName);
        System.out.println(myStudent2.major);
        System.out.println(myStudent2.gpa);
        System.out.println(myStudent2.age);
        System.out.println(myStudent2.onProbation);

    }

}