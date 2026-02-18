class RegularEmployee extends Employee {
    private double bonus;

    public RegularEmployee(String firstName, String lastName,
                           String idNo, String position,
                           String department, double hoursWrk,
                           double hourlyRate, double bonus) {
        super(firstName, lastName, idNo, position, department, hoursWrk, hourlyRate);
        this.bonus = bonus;
    }

    public double computeSalary() {
        return super.computeSalary() + bonus;
    }
}
