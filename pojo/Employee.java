package pojo;

import java.util.Arrays;

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

    public Employee(){
        System.out.println("This is a default constructor object");
    }

    public Employee(Integer employeeId){
        this.employeeId = employeeId;
        System.out.println("This is a single parameter constructor object" + employeeId);
    }

    public Employee(Integer employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        System.out.println(employeeName + employeeId);
    }

    public Employee(Integer employeeId, String employeeName, Integer employeeAge, String employeeEmail,
                         Long employeeMobileNo, String employeeDob, Float employeeSalary, String employeeDoj,
                         String employeeDepartment, String employeeAddress, String[] employeeSkills){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeEmail = employeeEmail;
        this.employeeMobileNo = employeeMobileNo;
        this.employeeDob = employeeDob;
        this.employeeSalary = employeeSalary;
        this.employeeDoj = employeeDoj;
        this.employeeDepartment = employeeDepartment;
        this.employeeAddress = employeeAddress;
        this.employeeSkills = employeeSkills;
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

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
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

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeMobileNo=" + employeeMobileNo +
                ", employeeDob='" + employeeDob + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeDoj='" + employeeDoj + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", employeeSkills=" + Arrays.toString(employeeSkills) +
                '}';
    }


}
