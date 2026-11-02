package constructor;

public class ConstructorNurseTest {
    public static void main(String[] args) {

        Nurse nurse1 = new Nurse();
        System.out.println(nurse1);

        Nurse nurse2 = new Nurse(23, "Ayesha", "Odisha", 45);
        System.out.println(nurse2);

        Nurse nurse3 = new Nurse();
        nurse3.setAge(25);
        nurse3.setName("Saesha");
        nurse3.setAddress("Odisha");
        nurse3.setId(60);
        System.out.println(nurse3);

        Nurse nurse4 = new Nurse(20, "Arti", "Bihar", 3);
        System.out.println("Before setter = " + nurse4);
        nurse4.setAge(23);
        System.out.println("After setter = " + nurse4);
        nurse4.setName("Pratyasha");
        System.out.println("After setter = " + nurse4);
        nurse4.setAddress("Odisha");
        System.out.println("After setter = " + nurse4);
        nurse4.setId(11);
        System.out.println("After setter = " + nurse4);
    }


}
