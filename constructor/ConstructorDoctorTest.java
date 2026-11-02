package constructor;

public class ConstructorDoctorTest {

    public static void main(String[] args) {

        Doctor doctor = new Doctor();
        System.out.println(doctor);

        Doctor doctorSuraj = new Doctor("Suraj");
        System.out.println(doctorSuraj);

        Doctor doctorHimansu = new Doctor(35, "Himansu");
        System.out.println(doctorHimansu);

        Doctor doctorAsit = new Doctor();
        doctorAsit.setAge(28);
        doctorAsit.setName("Asit");
        System.out.println(doctorAsit);

        Doctor doctorArti = new Doctor(30, "Arti");

        System.out.println("Constructor : " + doctorArti);

        doctorArti.setAge(32);
        doctorArti.setName("Pratyasha");

        System.out.println("After setter : " + doctorArti);
    }
}
