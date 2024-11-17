

class Faculty{
    String name;
    String designation;
    String employee_id;

    Faculty(String name, String designation, String employee_id ){
        this.name = name;
        this.designation = designation;
        this.employee_id = employee_id;
    }

    public String toString() {
        return "Faculty Name: " + name + ", Designation: " + designation + ", Employee ID: " + employee_id;
    }
}

class Department{
    String department_name;
    Faculty[] facultyarr;
    int faccnt;
    
    Department(String department_name , int maxfaculty){
        this.department_name = department_name;
        this.facultyarr = new Faculty[maxfaculty];
        this.faccnt = 0;

    }

    void add_faculty(Faculty faculty){
        if (faccnt < facultyarr.length) {
            facultyarr[faccnt++] = faculty;
            System.out.println(faculty.name + " has been added to " + department_name + " department");
        }
        else {
            System.out.println("Cannot add faculty. Department is full.");
        }
    }

    void remove_faculty(String employeeid){
        boolean found = false;

        for (int i = 0; i < faccnt; i++) {
            if (facultyarr[i].employee_id == employeeid) {
                found = true;
                System.out.println("Faculty of Employee ID " + employeeid + " has been removed successfully from department " + department_name + "department");
                for (int j = i; j < faccnt -1; j++) {
                    facultyarr[j] = facultyarr[j+1];
                }
                facultyarr[faccnt -1] = null;
                faccnt--;
                break;
            }

        }
        if (!found) {
            System.out.println("No faculty found with Employee ID " + employeeid + ".");
        }
    }

    public void listFaculty() {
        System.out.println("\nFaculty Members in " + department_name + " Department:");
        if (faccnt == 0) {
            System.out.println("No faculty members.");
        } else {
            for (int i = 0; i < faccnt; i++) {
                System.out.println(facultyarr[i]);
            }
        }
    }
}


public class UniversityManagement {
    public static void main(String[] args) {
        Department department = new Department("Computer Science", 5);

        Faculty faculty1 = new Faculty("Shrey Sir", "Asst. Professor", "2365");
        Faculty faculty2 = new Faculty("Zafar Sir", "Asst. Professor", "2265");


        department.add_faculty(faculty1);
        department.add_faculty(faculty2);

        department.listFaculty();
    }    
}
