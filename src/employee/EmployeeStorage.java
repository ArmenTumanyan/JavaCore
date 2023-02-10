package employee;

import employee.Employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Employee[] newArray = new Employee[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }


    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public Employee searchemployeeID(String keyword) {
        for (int i = 0; i < size; i++) {

            Employee employee = array[i];
            if (employee.getEmployeeID().contains(keyword)) {
                array[i].getEmployeeID().equals(keyword);
                return array[i];
            }
        }
        return null;
    }


    public Employee searchcompany(String keyword2) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().contains(keyword2)) {
                array[i].getCompany().equals(keyword2);
                return array[i];
            }
        }
        return null;
    }
}
