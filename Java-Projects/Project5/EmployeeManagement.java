package Week1.Day5;

import java.util.*;

public class EmployeeManagement {
    private static List<Employees> employees = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEmployee Management System");
            System.out.println("1.Add Employee");
            System.out.println("2.View All Employee");
            System.out.println("3.Update Employee");
            System.out.println("4.Delete Employee");
            System.out.println("5.Sort Employees by Name");
            System.out.println("6.Sort Employees by Salary");
            System.out.println("7.Search by Name");
            System.out.println("8.Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    viewAllEmployees();
                    break;
                
                case 3:
                    updateEmployee(sc);
                    break;

                case 4:
                    deleteEmployee(sc);
                    break;

                case 5:
                    sortByName();
                    break;

                case 6:
                    sortBySalary();
                    break;

                case 7:
                    searchByName(sc);
                    break;

                case 8:
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Wrong option. Enter again..");
            }
        } while (choice!=8);

        sc.close();
    }

    private static void addEmployee(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees.add(new Employees(id, name, department, salary));
        System.out.println("Employee added successfully!");
    }

    private static void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("\nEmployee List:");
            for (Employees e : employees) {
                System.out.println(e);
            }
        }
    }

    private static void updateEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();

        for (Employees e : employees) {
            if (e.getId() == id) {
                sc.nextLine(); 
                System.out.print("Enter New Name: ");
                e.setName(sc.nextLine());
                System.out.print("Enter New Department: ");
                e.setDepartment(sc.nextLine());
                System.out.print("Enter New Salary: ");
                e.setSalary(sc.nextDouble());
                System.out.println("Employee updated successfully!");
                return;
            }
        }

        System.out.println("Employee not found!");
    }

    private static void deleteEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        Iterator<Employees> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employees e = iterator.next();
            if (e.getId() == id) {
                iterator.remove();
                System.out.println("Employee deleted successfully!");
                return;
            }
        }

        System.out.println("Employee not found!");
    }

    private static void sortByName() {
        employees.sort(Comparator.comparing(Employees::getName));
        System.out.println("Employees sorted by name!");
        viewAllEmployees();
    }

    private static void sortBySalary() {
        employees.sort(Comparator.comparingDouble(Employees::getSalary));
        System.out.println("Employees sorted by salary!");
        viewAllEmployees();
    }

    private static void searchByName(Scanner sc) {
        System.out.print("Enter Name to search: ");
        sc.nextLine();
        String name = sc.nextLine();
        boolean found = false;

        for (Employees e : employees) {
            if (e.getName().equalsIgnoreCase(name)) {
                System.out.println(e);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employee found with the name " + name);
        }
    }
}
