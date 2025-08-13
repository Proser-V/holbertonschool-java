public class Employee {
    private double fixedSalary;

    public Employee(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() { return fixedSalary; }

    double calculateBonus(Department department) {
            return fixedSalary * 10 / 100;
    }

    double calculateTotalSalary(Department department) {
        if (department.reachedTarget() == true) {
            double newSalary = fixedSalary + calculateBonus(department);
            return newSalary;
        } else {
            return fixedSalary;
        }
    }
}
