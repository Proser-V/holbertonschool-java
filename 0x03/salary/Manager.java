public class Manager extends Employee {

    public Manager(double fixedSalary) {
        super(fixedSalary);
    }

    @Override
    public double calculateBonus(Department department) {
        double delta = department.getAchievedTargetValue() - department.getTargetValue();
        if (department.reachedTarget() == true) {
        return (getFixedSalary() * 20 / 100) + (delta * 1 / 100);
        } else {
            return 0;
        }
    }
}
