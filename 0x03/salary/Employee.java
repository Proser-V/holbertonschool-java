public class Employee {
    private double fixedSalary;

    public Employee(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getFixedSalary() { return fixedSalary; }

    public double calculateBonus(Department department) {
        if (department.reachedTarget() == true) {
            return fixedSalary * 10 / 100;
        } else {
            return 0;
        }
    }

    public double calculateTotalSalary(Department department) {
        if (department.reachedTarget() == true) {
            double newSalary = fixedSalary + calculateBonus(department);
            return newSalary;
        } else {
            return fixedSalary;
        }
    }
}
