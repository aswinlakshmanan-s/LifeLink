/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employees;

import java.util.Date;

/**
 *
 * @author Aswin Lakshmanan Sriram <sriram.a@northeastern.edu>
 */
public class Employee {
    
      private int employeeId;
    private String employeeName;
    private Date dateOfBirth;
    private String position;
    private double salary;
    private String department;

    public Employee(int employeeId, String employeeName, Date dateOfBirth, String position, double salary, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.salary = salary;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Additional methods can be added as needed

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
    
}
