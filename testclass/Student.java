package testclass;

public class Student {


    private Integer studentId;
    private Integer studentRollNo;

    private String studentName;

    private Integer studentAge;
    private String studentEmail;

    private Long studentMobileNo;

    private String studentDob; //16/10/1990  16-10-1990

    private Float studentMarks;

    private String studentDoj;
    private String studentParentName;
    private String studentAddress;
    private String[]  studentCoures;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(Integer studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Long getStudentMobileNo() {
        return studentMobileNo;
    }

    public void setStudentMobileNo(Long studentMobileNo) {
        this.studentMobileNo = studentMobileNo;
    }

    public String getStudentDob() {
        return studentDob;
    }

    public void setStudentDob(String studentDob) {
        this.studentDob = studentDob;
    }

    public Float getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(Float studentMarks) {
        this.studentMarks = studentMarks;
    }

    public String getStudentDoj() {
        return studentDoj;
    }

    public void setStudentDoj(String studentDoj) {
        this.studentDoj = studentDoj;
    }

    public String getStudentParentName() {
        return studentParentName;
    }

    public void setStudentParentName(String studentParentName) {
        this.studentParentName = studentParentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String[] getStudentCoures() {
        return studentCoures;
    }

    public void setStudentCoures(String[] studentCoures) {
        this.studentCoures = studentCoures;
    }




    public String[] getCourseSelectBystudent(){


        return null;
    }

    public char getGrade(){
        char grade = 'F';

        if(studentMarks >=50 && studentMarks <= 60){
            grade = 'E';
        }

        if(studentMarks >=61 && studentMarks <= 70){
            grade = 'D';
        }
        if(studentMarks >=71 && studentMarks <= 80){
            grade = 'C';
        }
        if(studentMarks >=81 && studentMarks <= 90){
            grade = 'B';
        }

        if(studentMarks >=91 && studentMarks <= 100){
            grade = 'A';
        }

        return grade;
    }

    public String checkAllInformationIsCorrect() {

        String errorMessage = "";

        if (studentId == null || studentId == 0) {
            errorMessage = "Please provide student ID. ";
        }

        if (studentRollNo == null || studentRollNo == 0) {
            errorMessage = "Please provide student Roll No. ";
        }

        if(studentName== null || studentName.trim().equals("") ||studentName.equals("null")  || studentName.length()>50){
            errorMessage = "Please provide student Name it cant be null or blank";
        }
        //

        if(studentAge == null || studentAge<=0  || studentAge >131 ){
            errorMessage = "Please provide student age it cant be null or less than equal to zero";
        }
        //

        if(studentEmail== null || studentEmail.trim().equals("") ||studentEmail.equals("null") || !studentEmail.contains("@")){
            errorMessage = "Please provide student Address it cant be null or blank or not more thab 200 character";
        }
        //

        if (studentMobileNo == null || studentMobileNo <= 0) {
            errorMessage = "Please provide valid student Mobile No. ";
        }

        if (studentDob == null || studentDob.trim().isEmpty()) {
            errorMessage = "Please provide student Date of Birth. ";
        }

        if(studentMarks == null || studentMarks<0  || studentMarks >501 ){
            errorMessage = "Please provide student marks it cant be null or less than equal to zero";
        }
        //

        if (studentDoj == null || studentDoj.trim().isEmpty()) {
            errorMessage = "Please provide student Date of Joining. ";
        }

        if(studentParentName== null || studentParentName.trim().equals("") ||studentParentName.equals("null")  || studentParentName.length()>50){
            errorMessage = "Please provide student Parent Name it cant be null or blank";
        }
        //

        if(studentAddress== null || studentAddress.trim().equals("") ||studentAddress.equals("null")  || studentAddress.length()>200){
            errorMessage = "Please provide student Address it cant be null or blank or not more thab 200 character";
        }
        //

        if (studentCoures == null || studentCoures.length == 0) {
            errorMessage = "Please provide at least one student Course. ";
        }

        return errorMessage;


        }


    public String validateStudentInfo(Student student){

        String errorMessage = "";
        if (student == null) {
            errorMessage = "Student cannot be null. ";
        }
        else {


            if (student.getStudentId() == null || student.getStudentId() <= 0) {
                errorMessage = "Please provide student Id it cant be null or 0";
            }

            if (student.getStudentRollNo() == null || student.getStudentRollNo() <= 0) {
                errorMessage = "Please provide student Roll No it cant be null or 0";
            }

            if (student.getStudentName() == null || student.getStudentName().trim().equals("") || student.getStudentName().equals("null") || student.getStudentName().length() > 50) {
                errorMessage = "Please provide student Name it cant be null or blank";
            }

            if (student.getStudentAge() == null || student.getStudentAge() <= 0 || student.getStudentAge() > 131) {
                errorMessage = "Please provide student age it cant be null or less than equal to zero";
            }

            if (student.getStudentEmail() == null || student.getStudentEmail().trim().equals("") || student.getStudentEmail().equals("null") || !student.getStudentEmail().contains("@")) {
                errorMessage = "Please provide student Email it cant be null or blank or invalid";
            }

            if (student.getStudentMobileNo() == null || student.getStudentMobileNo() <= 0) {
                errorMessage = "Please provide student Mobile No it cant be null or 0";
            }

            if (student.getStudentDob() == null || student.getStudentDob().trim().equals("") || student.getStudentDob().equals("null")) {
                errorMessage = "Please provide student DOB it cant be null or blank";
            }

            if (student.getStudentMarks() == null || student.getStudentMarks() < 0 || student.getStudentMarks() > 501) {
                errorMessage = "Please provide student marks it cant be null or less than equal to zero";
            }

            if (student.getStudentDoj() == null || student.getStudentDoj().trim().equals("") || student.getStudentDoj().equals("null")) {
                errorMessage = "Please provide student DOJ it cant be null or blank";
            }

            if (student.getStudentParentName() == null || student.getStudentParentName().trim().equals("") || student.getStudentParentName().equals("null") || student.getStudentParentName().length() > 50) {
                errorMessage = "Please provide student Parent Name it cant be null or blank";
            }

            if (student.getStudentAddress() == null || student.getStudentAddress().trim().equals("") || student.getStudentAddress().equals("null") || student.getStudentAddress().length() > 200) {
                errorMessage = "Please provide student Address it cant be null or blank or not more thab 200 character";
            }

            if (student.getStudentCoures() == null || student.getStudentCoures().length == 0) {
                errorMessage = "Please provide at least one student Course";
            }
        }

        return errorMessage;

    }

}
