
package testclass;

public class Teacher {
        private Integer teacherId;
        private String teacherName;
        private Integer teacherAge;
        private String teacherEmail;
        private Long teacherMobileNo;
        private String teacherDob;
        private Float teacherSalary;
        private String teacherDoj;
        private String teacherSubject;
        private String teacherAddress;
        private String[] teacherCoures;

        public Integer getTeacherId() {
            return teacherId;
        }

        public void setTeacherId(Integer teacherId) {
            this.teacherId = teacherId;
        }

        public String getTeacherName() {
            return teacherName;
        }

        public void setTeacherName(String teacherName) {
            this.teacherName = teacherName;
        }

        public Integer getTeacherAge() {
            return teacherAge;
        }

        public void setTeacherAge(Integer teacherAge) {
            this.teacherAge = teacherAge;
        }

        public String getTeacherEmail() {
            return teacherEmail;
        }

        public void setTeacherEmail(String teacherEmail) {
            this.teacherEmail = teacherEmail;
        }

        public Long getTeacherMobileNo() {
            return teacherMobileNo;
        }

        public void setTeacherMobileNo(Long teacherMobileNo) {
            this.teacherMobileNo = teacherMobileNo;
        }

        public String getTeacherDob() {
            return teacherDob;
        }

        public void setTeacherDob(String teacherDob) {
            this.teacherDob = teacherDob;
        }

        public Float getTeacherSalary() {
            return teacherSalary;
        }

        public void setTeacherSalary(Float teacherSalary) {
            this.teacherSalary = teacherSalary;
        }

        public String getTeacherDoj() {
            return teacherDoj;
        }

        public void setTeacherDoj(String teacherDoj) {

            this.teacherDoj = teacherDoj;
        }

        public String getTeacherSubject() {

            return teacherSubject;
        }

        public void setTeacherSubject(String teacherSubject) {

            this.teacherSubject = teacherSubject;
        }

        public String getTeacherAddress() {

            return teacherAddress;
        }

        public void setTeacherAddress(String teacherAddress)
        {
            this.teacherAddress = teacherAddress;
        }

        public String[] getTeacherCoures() {

            return teacherCoures;
        }

        public void setTeacherCoures(String[] teacherCoures) {

            this.teacherCoures = teacherCoures;
        }

        public String validateTeacherInfo(Teacher  teacher){

            String errorMessage = "";
            if(teacher == null){
                errorMessage = "Teacher cannot be null. ";
                return errorMessage;
            }


            if(teacher.getTeacherId() == null || teacher.getTeacherId() <=0){
                errorMessage = "Please provide teacher Id it cant be null or 0";
            }


            if(teacher.getTeacherName() == null || teacher.getTeacherName().trim().equals("") || teacher.getTeacherName().equals("null") || teacher.getTeacherName().length()>50){
                errorMessage = "Please provide teacher Name it cant be null or blank";
            }

            if(teacher.getTeacherAge() == null || teacher.getTeacherAge()<=0 || teacher.getTeacherAge() >131 ){
                errorMessage = "Please provide teacher age it cant be null or less than equal to zero";
            }

            if(teacher.getTeacherEmail() == null || teacher.getTeacherEmail().trim().equals("") || teacher.getTeacherEmail().equals("null") || !teacher.getTeacherEmail().contains("@")){
                errorMessage = "Please provide teacher Email it cant be null or blank or invalid";
            }

            if(teacher.getTeacherMobileNo() == null || teacher.getTeacherMobileNo() <=0){
                errorMessage = "Please provide teacher Mobile No it cant be null or 0";
            }

            if(teacher.getTeacherDob() == null || teacher.getTeacherDob().trim().equals("") || teacher.getTeacherDob().equals("null")){
                errorMessage = "Please provide teacher DOB it cant be null or blank";
            }

            if(teacher.getTeacherSalary() == null || teacher.getTeacherSalary()<0){
                errorMessage = "Please provide teacher Salary it cant be null or less than zero";
            }

            if(teacher.getTeacherDoj() == null || teacher.getTeacherDoj().trim().equals("") || teacher.getTeacherDoj().equals("null")){
                errorMessage = "Please provide teacher DOJ it cant be null or blank";
            }

            if(teacher.getTeacherSubject() == null || teacher.getTeacherSubject().trim().equals("") || teacher.getTeacherSubject().equals("null") || teacher.getTeacherSubject().length()>50){
                errorMessage = "Please provide teacher Subject it cant be null or blank";
            }

            if(teacher.getTeacherAddress() == null || teacher.getTeacherAddress().trim().equals("") || teacher.getTeacherAddress().equals("null") || teacher.getTeacherAddress().length()>200){
                errorMessage = "Please provide teacher Address it cant be null or blank or not more than 200 character";
            }

            if(teacher.getTeacherCoures() == null || teacher.getTeacherCoures().length == 0){
                errorMessage = "Please provide at least one teacher Course";
            }

            return errorMessage;

        }

    }
