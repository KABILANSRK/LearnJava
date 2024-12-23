# Employee Management System

## Overview
The Employee Management System is a simple Java application that demonstrates the use of **ArrayList**, **Encapsulation**, **Custom Sorting with Comparator**, and **CRUD operations**. This system allows users to manage employee data with various operations such as adding, viewing, updating, deleting, sorting, and searching for employees.

## Features
1. **Add Employee**: Add new employees with details like ID, Name, Department, and Salary.
2. **View All Employees**: Display a list of all employees.
3. **Update Employee**: Modify the details of an employee using their unique ID.
4. **Delete Employee**: Remove an employee from the list using their unique ID.
5. **Sort Employees**:
   - By Name (alphabetically)
   - By Salary (ascending order)
6. **Search Employee**: Search employees by their name.

## Learning Objectives
Through this project, you will learn:

- How to use **ArrayList** to store and manage objects.
- Encapsulation through **Getters and Setters**.
- Writing and using **Custom Comparators** for sorting.
- Implementing **CRUD operations** in Java.
- Searching and filtering data in collections.

## Classes

### 1. Employee.java
This class encapsulates the details of an employee.

- **Fields**: `id`, `name`, `department`, `salary`
- **Constructor**: Initialize employee details.
- **Getters and Setters**: Access and modify employee details.
- **toString()**: Represent employee details as a formatted string.

### 2. EmployeeManagement.java
This is the main class that contains the program logic and operations.

- **ArrayList**: Used to store and manage Employee objects.
- **Operations**:
  - Add an employee
  - View all employees
  - Update employee details
  - Delete an employee
  - Sort employees by name or salary
  - Search for an employee by name

## How to Run
1. Compile the classes:
   ```
   javac Employee.java EmployeeManagement.java
   ```

2. Run the program:
   ```
   java EmployeeManagement
   ```

## Sample Input/Output

### Main Menu
```
Employee Management System
1. Add Employee
2. View All Employees
3. Update Employee
4. Delete Employee
5. Sort Employees by Name
6. Sort Employees by Salary
7. Search by Name
8. Exit
Enter your choice: 
```

### Example Operation: Add Employee
```
Enter ID: 101
Enter Name: John Doe
Enter Department: IT
Enter Salary: 55000
Employee added successfully!
```

### Example Operation: View All Employees
```
Employee List:
ID: 101, Name: John Doe, Department: IT, Salary: 55000.0
```

### Example Operation: Search by Name
```
Enter Name to search: John
ID: 101, Name: John Doe, Department: IT, Salary: 55000.0
```
