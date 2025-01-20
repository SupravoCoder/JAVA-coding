package protected_java;

public class employee_Test // class employee_Test
{
    public employee_Test() 
    {
        Employee[] staff = new Employee[3]; // array of Employee objects (Employee is a class)
        staff[0] = new Employee("John", 50000); // creating an object of Employee class
        staff[1] = new Employee("Mary", 60000);
        staff[2] = new Employee("Steve", 70000);
        for (int i = 0; i < 3; i++) {
            staff[i].display(); // calling the display method of the Employee class
        }
    }
    public static void main(String[] args) {
        new employee_Test(); // creating an object of the employee_Test class
    }
}

class Employee // Employee class
{
    protected String name; // protected instance variable
    protected double salary; // protected instance variable
    public Employee(String name, double salary) // constructor to initialize the instance variables
    {
        this.name = name; // initializing the name variable using the this keyword because the instance variable and the parameter have the same name
        this.salary = salary; 
    }
    void display() // method to display the name and salary of the employee
    {
        System.out.println("Name: " + name + "\nSalary: " + salary);
    }
}


