package employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employees");
            System.out.println("Please input 3 for search employee by employee");
            System.out.println("Please input 4 for search employee by company");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input employee name");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employeeID");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input salary");
                    String salary = scanner.nextLine();
                    System.out.println("Please input company");
                    String company = scanner.nextLine();
                    System.out.println("Please input position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeID,Double.parseDouble(salary), company, position);
                    System.out.println("employee is created");
                    break;

                case "2":
                    employeeStorage.print();
                    break;

                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchemployeeID(keyword);
                    break;

                case "4":
                    System.out.println("Please input keyword");
                    String keyword2 = scanner.nextLine();
                    employeeStorage.searchcompany(keyword2);
                    break;

                default:
                    System.out.println("Wrong command. Please try again.");
            }
        }
    }
}
