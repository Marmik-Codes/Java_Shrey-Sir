package Hospital;

public class Appointment {
    private int appointmentID;
    private Doctor doctor;
    private Patient patient;
    private String date;
    private String time;

    public Appointment(int appointmentID, Doctor doctor, Patient patient, String date, String time) {
        this.appointmentID = appointmentID;
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.time = time;
    }

    public void displayDetails(){
        System.out.println("Appointment ID: " + appointmentID);
        System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getSpecialization() + ")");
        System.out.println("Patient: " + patient.getName());
        System.out.println("Gender: " + patient.getGender());
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("---------------------------");
    }

}
