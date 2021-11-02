package Exercise06_DefiningClasses.Cafe;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private List<Employee> employees;
    private String name;
    private int capacity;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        if (employees.size() < capacity) {
            employees.add(employee);
        }
    }

    public boolean removeEmployee(String name) {
        int constant = -1;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(name)) {
                constant = i;
            }
        }
        if (constant != -1) {
            employees.remove(constant);
            return true;
        }
        return false;
//        employees.removeIf(e -> e.getName().equals(name));
    }

    public Employee getOldestEmployee() {
//        int oldestEmployee = 0;
//        int index = -1;
//        for (int i = 0; i < employees.size(); i++) {
//            if (employees.get(i).getAge() > oldestEmployee) {
//                oldestEmployee = employees.get(i).getAge();
//                index = i;
//            }
//        }
//        return employees.get(index);
        return employees.stream().max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())).get();
    }

    public Employee getEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public int getCount() {
        return employees.size();
    }

    public String report() {
        StringBuilder builder = new StringBuilder("Employees working at Cafe ");
        builder.append(this.name).append(":").append(System.lineSeparator());
        employees.forEach(employee -> builder.append(employee).append(System.lineSeparator()));
        return builder.toString();
    }

}
