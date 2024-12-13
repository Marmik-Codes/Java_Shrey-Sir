// Employee Payroll System
// Develop an employee payroll system where an organization has multiple employees. The organization class contains a list of employee objects, representing an aggregation relationship.

class Employee{
    String emp_name ;
    String emp_id;
    String emp_dept;
    String hire_date;
    double salary;

    Employee(String emp_name,String emp_id,double salary,String emp_dept,String hire_date){
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.hire_date = hire_date;
        this.salary = salary;
        this.emp_dept = emp_dept;
    }
    public String toString(){
        return "Faculty Name: " + emp_name + ", Employee_Id: " + emp_id + ",Department: " + emp_dept + ",Hire_Date: " + hire_date + ",Salary: " + salary;
    }

}
class Organization{
    String company_name ;
    Employee [] employees;
    int emp_cnt;

    Organization(String company_name,int capacity){
        this.company_name = company_name;
        this.employees = new Employee[capacity];
        this.emp_cnt = 0;

    }
    void addemp(Employee employee){
        if (employee != null && emp_cnt < employees.length) {
            employees[emp_cnt] = employee;
            emp_cnt++;
        }else{
            System.out.println("Error: Cannot add more employees or invalid employee.");
        }
    }

    void emp_remove(String Employee_Id){
        boolean found = false;

        for (int i = 0; i < emp_cnt; i++) {
           if (employees[i].emp_id == Employee_Id) {
            found = true;
            System.out.println("Employee of Employee ID " + Employee_Id + " has successfully removed " );
            for(int j = i ; j < emp_cnt-1 ; j++){
                employees[j] = employees[j+1];
            }
            employees[emp_cnt-1] = null;
            emp_cnt--;
            break;
           }
        }
        if (!found) {
            System.out.println("No employee found with Employee ID " + Employee_Id + ".");
        }
    }
    void displayEmployees() {
        if (emp_cnt == 0) {
            System.out.println("The organization has no employees.");
        } else {
            System.out.println("Employees in " + company_name + ":");
            for (int i = 0; i < emp_cnt; i++) {
                System.out.println("- " + employees[i]);
            }
        }
    }
}

public class Employee_payroll {
    public static void main(String[] args) {
        Organization o1 = new Organization("TATA", 2);
        Organization o2 = new Organization("Amazon", 3);

        Employee e1 = new Employee("Marmik", "2133", 2500000, "Data Analyst", "13-12-2024");
        Employee e2 = new Employee("Falgun", "2135", 250000, "Data Analyst", "13-11-2024");
        Employee e4 = new Employee("Falgun", "2137", 250000, "Data Analyst", "13-11-2024");
        Employee e5 = new Employee("Falgun", "2138", 250000, "Data Analyst", "13-11-2024");
        Employee e3 = new Employee("Patel Bhai", "21356", 253525, "Web Developer", "21-9-2014");
        

        o1.addemp(e1);
        o1.addemp(e2);
        o1.addemp(e4);
        o1.addemp(e5);
        o1.displayEmployees();
        o1.emp_remove("2133");
        o1.displayEmployees();

        o2.addemp(e3);
        o2.displayEmployees();
    }
}
