package testclass;

public class Employee {
        private Integer employeeId;
        private String employeeName;
        private Integer employeeAge;
        private String employeeEmail;
        private Long employeeMobileNo;
        private String employeeDob;
        private Float employeeSalary;
        private String employeeDoj;
        private String employeeDepartment;
        private String employeeAddress;
        private String[] employeeSkills;

        public Integer getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(Integer employeeId) {
            this.employeeId = employeeId;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public Integer getEmployeeAge() {
            return employeeAge;
        }

        public void setEmployeeAge(Integer employeeAge) {
            this.employeeAge = employeeAge;
        }

        public String getEmployeeEmail() {
            return employeeEmail;
        }

        public void setEmployeeEmail(String employeeEmail) {
            this.employeeEmail = employeeEmail;
        }

        public Long getEmployeeMobileNo() {
            return employeeMobileNo;
        }

        public void setEmployeeMobileNo(Long employeeMobileNo) {
            this.employeeMobileNo = employeeMobileNo;
        }

        public String getEmployeeDob() {
            return employeeDob;
        }

        public void setEmployeeDob(String employeeDob) {
            this.employeeDob = employeeDob;
        }

        public Float getEmployeeSalary() {
            return employeeSalary;
        }

        public void setEmployeeSalary(Float employeeSalary) {
            this.employeeSalary = employeeSalary;
        }

        public String getEmployeeDoj() {
            return employeeDoj;
        }

        public void setEmployeeDoj(String employeeDoj) {
            this.employeeDoj = employeeDoj;
        }

        public String getEmployeeDepartment() {
            return employeeDepartment;
        }

        public void setEmployeeDepartment(String employeeDepartment) {
            this.employeeDepartment = employeeDepartment;
        }

        public String getEmployeeAddress() {
            return employeeAddress;
        }

        public void setEmployeeAddress(String employeeAddress) {
            this.employeeAddress = employeeAddress;
        }

        public String[] getEmployeeSkills() {
            return employeeSkills;
        }

        public void setEmployeeSkills(String[] employeeSkills) {
            this.employeeSkills = employeeSkills;
        }

        public String validateEmployeeInfo(Employee employee){

            String errorMessage = "";

            if(employee.getEmployeeId() == null || employee.getEmployeeId() <=0){
                errorMessage = "Please provide employee Id it cant be null or 0";
            }

            if(employee.getEmployeeName() == null || employee.getEmployeeName().trim().equals("") || employee.getEmployeeName().equals("null") || employee.getEmployeeName().length()>50){
                errorMessage = "Please provide employee Name it cant be null or blank";
            }

            if(employee.getEmployeeAge() == null || employee.getEmployeeAge()<=0 || employee.getEmployeeAge() >131 ){
                errorMessage = "Please provide employee age it cant be null or less than equal to zero";
            }

            if(employee.getEmployeeEmail() == null || employee.getEmployeeEmail().trim().equals("") || employee.getEmployeeEmail().equals("null") || !employee.getEmployeeEmail().contains("@")){
                errorMessage = "Please provide employee Email it cant be null or blank or invalid";
            }

            if(employee.getEmployeeMobileNo() == null || employee.getEmployeeMobileNo() <=0){
                errorMessage = "Please provide employee Mobile No it cant be null or 0";
            }

            if(employee.getEmployeeDob() == null || employee.getEmployeeDob().trim().equals("") || employee.getEmployeeDob().equals("null")){
                errorMessage = "Please provide employee DOB it cant be null or blank";
            }

            if(employee.getEmployeeSalary() == null || employee.getEmployeeSalary()<0){
                errorMessage = "Please provide employee Salary it cant be null or less than zero";
            }

            if(employee.getEmployeeDoj() == null || employee.getEmployeeDoj().trim().equals("") || employee.getEmployeeDoj().equals("null")){
                errorMessage = "Please provide employee DOJ it cant be null or blank";
            }

            if(employee.getEmployeeDepartment() == null || employee.getEmployeeDepartment().trim().equals("") || employee.getEmployeeDepartment().equals("null") || employee.getEmployeeDepartment().length()>50){
                errorMessage = "Please provide employee Department it cant be null or blank";
            }

            if(employee.getEmployeeAddress() == null || employee.getEmployeeAddress().trim().equals("") || employee.getEmployeeAddress().equals("null") || employee.getEmployeeAddress().length()>200){
                errorMessage = "Please provide employee Address it cant be null or blank or not more than 200 character";
            }

            if(employee.getEmployeeSkills() == null || employee.getEmployeeSkills().length == 0){
                errorMessage = "Please provide at least one employee Skill";
            }

            return errorMessage;

        }

    }
