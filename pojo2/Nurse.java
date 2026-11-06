package pojo2;

public class Nurse {
    private int nurseId;
    private String nurseName;
    private String nurseSpeciality;
    private int nurseAge;

    public Nurse(){
        System.out.println("Default Constructor");
    }

    public Nurse(int  nurseId){
        this.nurseId = nurseId;
        System.out.println("Single parameter Constructor");
    }

    public Nurse(int nurseId, String nurseName){
        this.nurseId = nurseId;
        this.nurseName = nurseName;
        System.out.println("Double parameter Constructor");
    }

    public Nurse(int nurseId, String nurseName, String nurseSpeciality, int nurseAge){
        this.nurseId = nurseId;
        this.nurseName = nurseName;
        this.nurseSpeciality = nurseSpeciality;
        this.nurseAge = nurseAge;
        System.out.println("Multiple parameter Constructor");
    }

    public String getNurseName() {
        return nurseName;
    }
    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }
    public String getNurseSpeciality() {
        return nurseSpeciality;
    }
    public void setNurseSpeciality(String nurseSpeciality) {
        this.nurseSpeciality = nurseSpeciality;
    }
    public int getNurseAge() {
        return nurseAge;
    }
    public void setNurseAge(int nurseAge) {
        this.nurseAge = nurseAge;
    }
    public int getNurseId() {
        return nurseId;
    }
    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "nurseId=" + nurseId +
                ", nurseName='" + nurseName + '\'' +
                ", nurseSpeciality='" + nurseSpeciality + '\'' +
                ", nurseAge=" + nurseAge +
                '}';
    }
}
