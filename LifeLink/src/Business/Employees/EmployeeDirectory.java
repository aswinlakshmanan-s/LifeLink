/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employees;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Aswin Lakshmanan Sriram <sriram.a@northeastern.edu>
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeDirectory;

    public EmployeeDirectory() {
        employeeDirectory = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public Employee createEmployee(int id, String name, Date dateOfBirth, String position, double salary, String department) {
        Employee employee = new Employee(id, name, dateOfBirth, position, salary, department);
        employeeDirectory.add(employee);
        return employee;
    }
    
}
