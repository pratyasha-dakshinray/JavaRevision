package testclass;
    public class Nurse {
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

        public String validateNurseInfo(testclass.Nurse Nurse) {
            String errorMessage = "";

            if (Nurse.getFirstName() == null || Nurse.getFirstName().equals("") || Nurse.getFirstName().trim().equals("") || Nurse.getFirstName().trim().equals("") || Nurse.getFirstName().length() > 20) {
                errorMessage += "Enter valid first name!\n";
                return errorMessage;
            }

            if (Nurse.getSurname() == null || Nurse.getSurname().equals("") || Nurse.getSurname().trim().equals("") || Nurse.getSurname().trim().equals("") || Nurse.getSurname().length() > 20) {
                errorMessage += "Enter valid Surname!\n";
                return errorMessage;
            }

            if(Nurse.getEmail() == null || Nurse.getEmail().equals("") || Nurse.getEmail().equals("null") || !Nurse.getEmail().contains("@")) {
                errorMessage = "Please provide a valid Email";
                return errorMessage;
            }

            if(Nurse.getMobileNumber() == null || Nurse.getMobileNumber() <= 0) {
                errorMessage = "Please provide a valid Mobile Number";
                return errorMessage;
            }

            if(Nurse.getAddress() == null || Nurse.getAddress().equals("") || Nurse.getAddress().equals("null") || Nurse.getAddress().length() > 200) {
                errorMessage = "Please provide a valid Address";
                return errorMessage;
            }

            if(Nurse.getCity() == null || Nurse.getCity().equals("") || Nurse.getCity().equals("null")) {
                errorMessage = "Please provide a valid City";
                return errorMessage;
            }

            if(Nurse.getState() == null || Nurse.getState().equals("") || Nurse.getState().equals("null")) {
                errorMessage = "Please provide a valid State";
                return errorMessage;
            }

            if(Nurse.getZipcode() == null || Nurse.getZipcode().equals("") || Nurse.getZipcode().equals("null")) {
                errorMessage = "Please provide a valid Zipcode";
                return errorMessage;
            }

            if(Nurse.getCountry() == null || Nurse.getCountry().equals("") || Nurse.getCountry().equals("null")) {
                errorMessage = "Please provide a valid Country";
                return errorMessage;
            }

            if(Nurse.getPassword() == null || Nurse.getPassword().equals("") || Nurse.getPassword().equals("null") || Nurse.getPassword().length() < 8) {
                errorMessage = "Please provide a valid Password";
                return errorMessage;
            }

            if(Nurse.getAge() == null || Nurse.getAge() <= 0 || Nurse.getAge() > 130) {
                errorMessage = "Please provide a valid Age";
                return errorMessage;
            }

            if(Nurse.getDOJ() == null || Nurse.getDOJ().equals("") || Nurse.getDOJ().equals("null")) {
                errorMessage = "Please provide a valid Date Of Joining";
                return errorMessage;
            }

            if(Nurse.getDOB() == null || Nurse.getDOB().equals("") || Nurse.getDOB().equals("null")) {
                errorMessage = "Please provide a valid Date Of Birth";
                return errorMessage;
            }

            if(Nurse.getSpecialty() == null || Nurse.getSpecialty().equals("") || Nurse.getSpecialty().equals("null") || Nurse.getSpecialty().length() > 50) {
                errorMessage = "Please provide a valid Specialty";
                return errorMessage;
            }

            if(Nurse.getQualification() == null || Nurse.getQualification().equals("") || Nurse.getQualification().equals("null") || Nurse.getQualification().length() > 100) {
                errorMessage = "Please provide a valid Qualification";
                return errorMessage;
            }

            if(Nurse.getServices() == null || Nurse.getServices().length == 0) {
                errorMessage = "Please provide at least one Service";
                return errorMessage;
            }

            return errorMessage;



        }
    }

