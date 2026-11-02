package constructor;

public class ConstructorStudentTest {

    public static void main(String[] args) {

        Student student = new Student();
        System.out.println("This is a default constructer object" + student);

        Student studentSuraj = new Student("Suraj");
        System.out.println("This is a string parameterised constructor" + studentSuraj);

        Student studentHimansu = new Student(25, "Himansu");
        System.out.println("This is a double parameterised constructor" + studentHimansu);

        Student studentAsit = new Student();
        studentAsit.setAge(28);
        studentAsit.setName("Asit");
        System.out.println(studentAsit);

        Student studentArti = new Student(23, "Arti");

        System.out.println("Constructor : " + studentArti);

        studentArti.setAge(24);
        studentArti.setName("Pratyasha");

        System.out.println("After setter : " + studentArti);
    }
}

