import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
class EmployeeService {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "HR", LocalDate.of(2020, 5, 10), 60000),
            new Employee(2, "Bob", "IT", LocalDate.of(2019, 8, 15), 75000),
            new Employee(3, "Charlie", "Finance", LocalDate.of(2021, 3, 20), 50000),
            new Employee(4, "David", "IT", LocalDate.of(2018, 10, 5), 90000)
        );

        // Filter employees who joined before 2020 and have salary greater than 60K
        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.getDateOfJoining().isBefore(LocalDate.of(2020, 1, 1)) && emp.getSalary() > 60000)
                .collect(Collectors.toList());

        System.out.println("Filtered Employees:");
        filteredEmployees.forEach(System.out::println);

        // Finding an employee by name using Optional
        String searchName = "Charlie";
        Optional<Employee> employeeOptional = employees.stream()
                .filter(emp -> emp.getName().equalsIgnoreCase(searchName))
                .findFirst();

        System.out.println("\nEmployee found:");
        System.out.println(employeeOptional.orElse(new Employee(0, "Not Found", "N/A", LocalDate.now(), 0)));

        // Printing all employees using method reference
        System.out.println("\nAll Employees:");
        employees.forEach(System.out::println);
    }
}