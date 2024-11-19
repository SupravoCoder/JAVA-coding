//Iterator Pattern is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.). The Iterator pattern is used to access the elements of an aggregate object sequentially without exposing its underlying representation.

class Employee
{
    private String name; // private variable to store the name of the employee
    private String dept; // private variable to store the department of the employee
    private double salary; // private variable to store the salary of the employee

    public Employee(String name, String dept, double salary) // constructor to set the values
    {
        this.name = name;// setting the name  
        this.dept = dept;// setting the department
        this.salary = salary; // setting the salary
    }

    public String getName() // getter method to get the name
    {
        return name;
    }

    public String getDept() // getter method to get the department
    {
        return dept;
    }

    public double getSalary() // getter method to get the salary
    {
        return salary;
    }

    public String toString() // toString method to return the string representation of the object
    {
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");
        // returns the string representation of the object
    }
}

class Iterator_Pattern 
{
    public static void main(String[] args) {
        Employee[] employees = new Employee[7]; // creating an array of Employee objects
        employees[0] = new Employee("John", "Engineering", 10000); // creating an object of Employee class
        employees[1] = new Employee("David", "Engineering", 15000); // creating an object of Employee class
        employees[2] = new Employee("Scott", "Engineering", 20000); // creating an object of Employee class
        employees[3] = new Employee("Smith", "Engineering", 25000); // creating an object of Employee class
        employees[4] = new Employee("Mark", "HR", 30000); // creating an object of Employee class
        employees[5] = new Employee("Paul", "HR", 35000); // creating an object of Employee class
        employees[6] = new Employee("Steven", "HR", 40000); // creating an object of Employee class
        double totalSalary = 0; // variable to store the total salary
        for (Employee e : employees) // for each loop to iterate through the array
        {
            totalSalary += e.getSalary(); // adds the salary of each employee to the totalSalary
        }
        System.out.println("Total salary of all employees : " + totalSalary); // prints the total salary

        for (Employee e : employees) // for each loop to iterate through the array
        {
            System.out.println(e); // prints the object
        }
    }

}