package testclass;

public class Patient {
    private String firstName;
    private String surname;
    private String email;
    private Integer mobileNumber;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String country;
    private Integer age;
    private Integer ID;
    private String DOA;
    private String DOB;
    private String disease;
    private String ward;
    private String[] symptoms;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDOA() {
        return DOA;
    }
    public void setDOA(String DOA) {
        this.DOA = DOA;
    }

    public String getDOB() {
        return DOB;
    }
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getWard() {
        return ward;
    }
    public void setWard(String ward) {
        this.ward = ward;
    }

    public String[] getSymptoms() {
        return symptoms;
    }
    public void setSymptoms(String[] symptoms) {
        this.symptoms = symptoms;
    }

    public String validatePatientInfo(Patient patient) {
        String errorMessage = "";

        if (patient.getFirstName() == null || patient.getFirstName().equals("") || patient.getFirstName().trim().equals("") || patient.getFirstName().trim().equals("") || patient.getFirstName().length() > 20) {
            errorMessage += "Enter valid first name!\n";
            return errorMessage;
        }

        if (patient.getSurname() == null || patient.getSurname().equals("") || patient.getSurname().trim().equals("") || patient.getSurname().trim().equals("") || patient.getSurname().length() > 20) {
            errorMessage += "Enter valid Surname!\n";
            return errorMessage;
        }

        if(patient.getEmail() == null || patient.getEmail().equals("") || patient.getEmail().equals("null") || !patient.getEmail().contains("@")) {
            errorMessage = "Please provide a valid Email";
            return errorMessage;
        }

        if(patient.getMobileNumber() == null || patient.getMobileNumber() <= 0) {
            errorMessage = "Please provide a valid Mobile Number";
            return errorMessage;
        }

        if(patient.getAddress() == null || patient.getAddress().equals("") || patient.getAddress().equals("null") || patient.getAddress().length() > 200) {
            errorMessage = "Please provide a valid Address";
            return errorMessage;
        }

        if(patient.getCity() == null || patient.getCity().equals("") || patient.getCity().equals("null")) {
            errorMessage = "Please provide a valid City";
            return errorMessage;
        }

        if(patient.getState() == null || patient.getState().equals("") || patient.getState().equals("null")) {
            errorMessage = "Please provide a valid State";
            return errorMessage;
        }

        if(patient.getZipcode() == null || patient.getZipcode().equals("") || patient.getZipcode().equals("null")) {
            errorMessage = "Please provide a valid Zipcode";
            return errorMessage;
        }

        if(patient.getCountry() == null || patient.getCountry().equals("") || patient.getCountry().equals("null")) {
            errorMessage = "Please provide a valid Country";
            return errorMessage;
        }

        if(patient.getAge() == null || patient.getAge() <= 0 || patient.getAge() > 130) {
            errorMessage = "Please provide a valid Age";
            return errorMessage;
        }

        if(patient.getDOA() == null || patient.getDOA().equals("") || patient.getDOA().equals("null")) {
            errorMessage = "Please provide a valid Date Of Admission";
            return errorMessage;
        }

        if(patient.getDOB() == null || patient.getDOB().equals("") || patient.getDOB().equals("null")) {
            errorMessage = "Please provide a valid Date Of Birth";
            return errorMessage;
        }

        if(patient.getDisease() == null || patient.getDisease().equals("") || patient.getDisease().equals("null") || patient.getDisease().length() > 50) {
            errorMessage = "Please provide a valid Disease";
            return errorMessage;
        }

        if(patient.getWard() == null || patient.getWard().equals("") || patient.getWard().equals("null") || patient.getWard().length() > 100) {
            errorMessage = "Please provide a valid Ward";
            return errorMessage;
        }

        if(patient.getSymptoms() == null || patient.getSymptoms().length == 0) {
            errorMessage = "Please provide at least one Symptom";
            return errorMessage;
        }

        return errorMessage;



    }
}
