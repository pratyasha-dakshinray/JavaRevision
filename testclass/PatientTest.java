package testclass;

public class PatientTest {
    public static void main(String[] args) {
        Patient pratyasha = new Patient();

        pratyasha.setFirstName("Pratyasha");
        pratyasha.setSurname("Dakshinray");
        pratyasha.setAddress("Kupari, Baleshwar, Odisha");
        pratyasha.setAge(23);
        pratyasha.setCity("Kupari");
        pratyasha.setState("Odisha");
        pratyasha.setCountry("India");
        pratyasha.setDOB("15-06-2003");
        pratyasha.setDOA("15-01-2027");
        pratyasha.setEmail("pratyashadakshinray2610@gmail.com");
        pratyasha.setID(6);
        pratyasha.setMobileNumber(987654321);
        pratyasha.setDisease("Normal Cold, Headache");
        pratyasha.setWard("General Medicine");
        pratyasha.setZipcode("756059");
        String[] symptoms = {"Normal Cold", "Headache"};
        pratyasha.setSymptoms(symptoms);

        String errorMessage = pratyasha.validatePatientInfo(pratyasha);

        if(errorMessage.equals("")) {
            System.out.println("Patient information is correct");
        }else{
            System.out.println("Error Message : " + errorMessage);
        }
    }
}
