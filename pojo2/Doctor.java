package pojo2;

public class Doctor {
    private int doctorId;
    private String doctorName;
    private String doctorSpeciality;
    private int doctorAge;

    public Doctor() {
        System.out.println("Default constructor");
    }

    public Doctor(int doctorId) {
        this.doctorId = doctorId;
        System.out.println("Single parameter constructor");
    }

    public Doctor(int doctorId, String doctorName) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        System.out.println("Double parameter constructor");
    }

    public Doctor(int doctorId, String doctorName, String doctorSpeciality, int doctorAge) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorSpeciality = doctorSpeciality;
        this.doctorAge = doctorAge;
        System.out.println("Multiple Parameter constructor");
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSpeciality(String nurseSpeciality) {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }

    public int getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(int doctorAge) {
        this.doctorAge = doctorAge;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", doctorSpeciality='" + doctorSpeciality + '\'' +
                ", doctorAge=" + doctorAge +
                '}';
    }
}
