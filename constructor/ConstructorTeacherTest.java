
package constructor;

public class ConstructorTeacherTest {

    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        System.out.println(teacher);

        Teacher teacherSuraj = new Teacher("Suraj");
        System.out.println(teacherSuraj);

        Teacher teacherHimansu = new Teacher(35, "Himansu");
        System.out.println(teacherHimansu);

        Teacher teacherAsit = new Teacher();
        teacherAsit.setAge(28);
        teacherAsit.setName("Asit");
        System.out.println(teacherAsit);

        Teacher teacherArti = new Teacher(30, "Arti");

        System.out.println("Constructor : " + teacherArti);

        teacherArti.setAge(32);
        teacherArti.setName("Pratyasha");

        System.out.println("After setter : " + teacherArti);
    }
}

