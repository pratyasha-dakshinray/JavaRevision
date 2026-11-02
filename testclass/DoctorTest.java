package testclass;

public class DoctorTest {
    public static void main(String[] args) {
        Doctor pratyasha = new Doctor();

        pratyasha.setFirstName("Pratyasha");
        pratyasha.setSurname("Dakshinray");
        pratyasha.setAddress("Kupari, Baleshwar, Odisha");
        pratyasha.setAge(23);
        pratyasha.setCity("Kupari");
        pratyasha.setState("Odisha");
        pratyasha.setCountry("India");
        pratyasha.setDOB("15-06-2003");
        pratyasha.setDOJ("15-01-2027");
        pratyasha.setEmail("pratyashadakshinray2610@gmail.com");
        pratyasha.setPassword("123456789");
        pratyasha.setID(6);
        pratyasha.setMobileNumber(987654321);
        pratyasha.setQualification("MBBS, MS");
        pratyasha.setSpecialty("General Surgery");
        pratyasha.setZipcode("756059");
        String[] services = {"Medicine" , "Surgery" };
        pratyasha.setServices(services);

        String errorMessage = pratyasha.validateDoctorInfo(pratyasha);

        if(errorMessage.equals("")) {
            System.out.println("Doctor information is correct ");
        }else{
            System.out.println("Error Message : " + errorMessage);
        }
    }
}
