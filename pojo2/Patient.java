package pojo2;

public class Patient {
    private int patientId;
    private String patientName;
    private String patientDisease;
    private int patientAge;

    public Patient() {
        System.out.println("Default Constructor");
    }

    public Patient(int patientId) {
        this.patientId = patientId;
        System.out.println("Single parameter Constructor");
    }

    public Patient(int patientId, String patientName) {
        this.patientId = patientId;
        this.patientName = patientName;
        System.out.println("Double parameter Constructor");
    }

    public Patient(int patientId, String patientName, int patientAge, String patientDisease) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientDisease = patientDisease;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientDisease() {
        return patientDisease;
    }

    public void setPatientDisease(String patientDisease) {
        this.patientDisease = patientDisease;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }
}
