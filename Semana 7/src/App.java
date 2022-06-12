import java.text.DecimalFormat;

import src.models.Employee;

public class App {
    public static void main(String args[]) {

        Employee employee_1 = new Employee("Fernando", "Silva", 1350.30f);
        Employee employee_2 = new Employee("Catia", "Costa", 1500f);

        showAnnualSalary(employee_1);
        showAnnualSalary(employee_2);

        System.out.println("");

        employee_1.increaseSalary(10);
        employee_2.increaseSalary(10);

        System.out.println("O salario de " + employee_1.getFullName() + " aumentou em 10%.");
        System.out.println("O salario de " + employee_2.getFullName() + " aumentou em 10%.");

        System.out.println("");

        showAnnualSalary(employee_1);
        showAnnualSalary(employee_2);
        
    }

    public static void showAnnualSalary(Employee employee) {
        DecimalFormat decimalFormat = new DecimalFormat("R$ #,##0.00");
        
        System.out.println("O salario anual de " + employee.getFullName() 
            + " e de " + decimalFormat.format(employee.annualSalary()) + ".");
    }
}