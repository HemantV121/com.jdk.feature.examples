class Employee {
    private int id;
    private String name;
    private String department;
    private LocalDate dateOfJoining;
    private double salary;

    public Employee(int id, String name, String department, LocalDate dateOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public LocalDate getDateOfJoining() { return dateOfJoining; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', dateOfJoining=" + dateOfJoining + ", salary=" + salary + "}";
    }
}