public class Manager extends Employee {

    public Manager(double fixedSalary) {
        super(fixedSalary);
    }

    @Override
    double calculateBonus(Department department) {
        double delta = department.getAchivedTargetValue() - department.getTargetValue();
        return (getFixedSalary() * 20 / 100) + (delta * 1 / 100);
    }
}
