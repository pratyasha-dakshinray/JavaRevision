package pojo;

import java.util.Arrays;

public class Student {

    private Integer studentId;
    private Integer studentRollNo;
    private String studentName;
    private Integer studentAge;
    private String studentEmail;
    private Long studentMobileNo;
    private String studentDob;
    private Float studentMarks;
    private String studentDoj;
    private String studentParentName;
    private String studentAddress;
    private String[] studentCourse;


    public Student() {
        System.out.println("This is a default constructor object");
    }

    public Student(Integer studentId) {
        this.studentId = studentId;
        System.out.println("This is a single parameter constructor object");
    }

    public Student(Integer studentId, String studentName) {
        this.studentId = studentId;
        this.studentRollNo = studentRollNo;
        System.out.println("This is a double parameter constructor object");
    }

    public Student(Integer studentId, Integer studentRollNo, String studentName,
                   Integer studentAge, String studentEmail, Long studentMobileNo,
                   String studentDob, Float studentMarks, String studentDoj,
                   String studentParentName, String studentAddress,
                   String[] studentCourse) {

        this.studentId = studentId;
        this.studentRollNo = studentRollNo;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentEmail = studentEmail;
        this.studentMobileNo = studentMobileNo;
        this.studentDob = studentDob;
        this.studentMarks = studentMarks;
        this.studentDoj = studentDoj;
        this.studentParentName = studentParentName;
        this.studentAddress = studentAddress;
        this.studentCourse = studentCourse;
        System.out.println("This is a multiple parameter constructor object");
    }


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

    public String[] getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String[] studentCourse) {
        this.studentCourse = studentCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentRollNo=" + studentRollNo +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentMobileNo=" + studentMobileNo +
                ", studentDob='" + studentDob + '\'' +
                ", studentMarks=" + studentMarks +
                ", studentDoj='" + studentDoj + '\'' +
                ", studentParentName='" + studentParentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentCourse=" + Arrays.toString(studentCourse) +
                '}';
    }
}
