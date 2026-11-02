package testclass;

public class Doctor {
    private String firstName;
    private String surname;
    private String email;
    private Integer mobileNumber;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String country;
    private String password;
    private Integer age;
    private Integer ID;
    private String DOJ;
    private String DOB;
    private String specialty;
    private String qualification;
    private String[] services;

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

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
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

    public String getDOJ() {
        return DOJ;
    }
    public void setDOJ(String DOJ) {
        this.DOJ = DOJ;
    }

    public String getDOB() {
        return DOB;
    }
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String[] getServices() {
        return services;
    }
    public void setServices(String[] services) {
        this.services = services;
    }

    public String validateDoctorInfo(Doctor doctor) {
        String errorMessage = "";

        if (doctor.getFirstName() == null || doctor.getFirstName().equals("") || doctor.getFirstName().trim().equals("") || doctor.getFirstName().trim().equals("") || doctor.getFirstName().length() > 20) {
            errorMessage += "Enter valid first name!\n";
            return errorMessage;
        }

        if (doctor.getSurname() == null || doctor.getSurname().equals("") || doctor.getSurname().trim().equals("") || doctor.getSurname().trim().equals("") || doctor.getSurname().length() > 20) {
            errorMessage += "Enter valid Surname!\n";
            return errorMessage;
        }

        if(doctor.getEmail() == null || doctor.getEmail().equals("") || doctor.getEmail().equals("null") || !doctor.getEmail().contains("@")) {
            errorMessage = "Please provide a valid Email";
            return errorMessage;
        }

        if(doctor.getMobileNumber() == null || doctor.getMobileNumber() <= 0) {
            errorMessage = "Please provide a valid Mobile Number";
            return errorMessage;
        }

        if(doctor.getAddress() == null || doctor.getAddress().equals("") || doctor.getAddress().equals("null") || doctor.getAddress().length() > 200) {
            errorMessage = "Please provide a valid Address";
            return errorMessage;
        }

        if(doctor.getCity() == null || doctor.getCity().equals("") || doctor.getCity().equals("null")) {
            errorMessage = "Please provide a valid City";
            return errorMessage;
        }

        if(doctor.getState() == null || doctor.getState().equals("") || doctor.getState().equals("null")) {
            errorMessage = "Please provide a valid State";
            return errorMessage;
        }

        if(doctor.getZipcode() == null || doctor.getZipcode().equals("") || doctor.getZipcode().equals("null")) {
            errorMessage = "Please provide a valid Zipcode";
            return errorMessage;
        }

        if(doctor.getCountry() == null || doctor.getCountry().equals("") || doctor.getCountry().equals("null")) {
            errorMessage = "Please provide a valid Country";
            return errorMessage;
        }

        if(doctor.getPassword() == null || doctor.getPassword().equals("") || doctor.getPassword().equals("null") || doctor.getPassword().length() < 8) {
            errorMessage = "Please provide a valid Password";
            return errorMessage;
        }

        if(doctor.getAge() == null || doctor.getAge() <= 0 || doctor.getAge() > 130) {
            errorMessage = "Please provide a valid Age";
            return errorMessage;
        }

        if(doctor.getDOJ() == null || doctor.getDOJ().equals("") || doctor.getDOJ().equals("null")) {
            errorMessage = "Please provide a valid Date Of Joining";
            return errorMessage;
        }

        if(doctor.getDOB() == null || doctor.getDOB().equals("") || doctor.getDOB().equals("null")) {
            errorMessage = "Please provide a valid Date Of Birth";
            return errorMessage;
        }

        if(doctor.getSpecialty() == null || doctor.getSpecialty().equals("") || doctor.getSpecialty().equals("null") || doctor.getSpecialty().length() > 50) {
            errorMessage = "Please provide a valid Specialty";
            return errorMessage;
        }

        if(doctor.getQualification() == null || doctor.getQualification().equals("") || doctor.getQualification().equals("null") || doctor.getQualification().length() > 100) {
            errorMessage = "Please provide a valid Qualification";
            return errorMessage;
        }

        if(doctor.getServices() == null || doctor.getServices().length == 0) {
            errorMessage = "Please provide at least one Service";
            return errorMessage;
        }

        return errorMessage;



    }
}
