package Hospital;

public class Doctor {
    private int doctorId;
    private String name;
    private String specialization;
    private Appointment[] appointments;
    private int appointmentCnt ;
    private final int MAX_APPOINTMENTS = 10;

    public Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.appointments = new Appointment[MAX_APPOINTMENTS];
        this.appointmentCnt = 0;
    }
    public void add_appoinment(Appointment appointment){
        if (appointmentCnt < MAX_APPOINTMENTS) {
            appointments[appointmentCnt] = appointment;
            appointmentCnt++;
        }else{
            System.out.println("Doctor's schedule is full!.");
        }
    }
    public void view_appointment(){
        if (appointmentCnt == 0) {
            System.out.println(name + " has no schedule appointment.");
            return;
        }
        System.out.println("Appointments for " + name + ":");
        for (int i = 0; i < appointmentCnt; i++) {
            appointments[i].displayDetails();
        }
    }
    public int getDoctorId() {
        return doctorId;
    }
    public String getName() {
        return name;
    }
    public String getSpecialization() {
        return specialization;
    }
}
