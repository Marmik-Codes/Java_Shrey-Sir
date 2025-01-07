package Hospital;

public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String gender;
    private Appointment[] appointments;
    private int appointmentCnt;
    private final int MAX_APPOINTMENTS = 10;

    public Patient(int patientId, String name, int age, String gender) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.appointmentCnt = 0;
        this.appointments = new Appointment[MAX_APPOINTMENTS];
    }

    public void add_appoinment(Appointment appointment){
        if (appointmentCnt < MAX_APPOINTMENTS) {
            appointments[appointmentCnt] = appointment;
            appointmentCnt++;
        }else{
            System.out.println(name + " has reached the maximum number of appointments.");

        }
    }
    public void view_appointment(){
        if (appointmentCnt == 0) {
            System.out.println(name + " has no scheduled appointments.");
            return;
        }
        System.out.println("Appointments for patient " +  name + ".");
        for (int i = 0; i < appointmentCnt; i++) {
            appointments[i].displayDetails();
        }
    }

    public int getPatientId() {
        return patientId;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    


}
