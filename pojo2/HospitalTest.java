package pojo2;

public class HospitalTest {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor();
        System.out.println("Default Constructor" + doctor1);

        Doctor doctor2 = new Doctor(4);
        System.out.println("Single parameter Constructor" + doctor2);

        Doctor doctor3 = new Doctor(1, "Pratyasha");
        System.out.println("Double parameter Constructor" + doctor3);

        Doctor doctor4 = new Doctor(2,"Ayesha", "Medicine",35);
        System.out.println("Multiple parameter Constructor" + doctor4);

        Nurse nurse1 = new Nurse();
        System.out.println("Single parameter Constructor" + nurse1);

        Nurse nurse2 = new Nurse(6);
        System.out.println("Double parameter Constructor" + nurse2);

        Nurse nurse3 = new Nurse(7, "Arti");
        System.out.println("Single parameter Constructor" + nurse3);

        Nurse nurse4 = new Nurse(9, "Anika", "Medicine",26);
        System.out.println("Single parameter Constructor" + nurse4);

        //Data transfer
        System.out.println("Before Data Transfer = " + doctor4);
        System.out.println("Before Data Transfer = " + nurse4);

        doctor4.setDoctorId(nurse4.getNurseId());
        doctor4.setDoctorAge(nurse4.getNurseAge());
        doctor4.setDoctorName(nurse4.getNurseName());
        doctor4.setDoctorSpeciality(nurse4.getNurseSpeciality());

        System.out.println("After Data Transfer = " + doctor4);
        System.out.println("After Data Transfer = " + nurse4);



    }
}
