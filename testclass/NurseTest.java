package testclass;

public class NurseTest {
    public static void main(String[] args) {
        Nurse pratyasha = new Nurse();

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
        pratyasha.setQualification("Bsc Nursing, MSc Nursing");
        pratyasha.setSpecialty("Surgery");
        pratyasha.setZipcode("756059");
        String[] services = {"General ward" , "Surgery" };
        pratyasha.setServices(services);

        String errorMessage = pratyasha.validateNurseInfo(pratyasha);

        if(errorMessage.equals("")) {
            System.out.println("Nurse information is correct");
        }else{
            System.out.println("Error Message : " + errorMessage);
        }
    }
}
