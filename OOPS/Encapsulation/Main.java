import Hospital.Appointment;
import Hospital.Doctor;
import Hospital.Patient;

public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(101, "Dr.Marmik Patel", "Cardiologist");
        Patient p1 = new Patient(01, "Himesh", 20, "Male");

        Appointment ap1 = new Appointment(1011, d1, p1, "10-01-2025", "10:00 Am");
        d1.add_appoinment(ap1);
        p1.add_appoinment(ap1);

        d1.view_appointment();
        p1.view_appointment();
    }
}
