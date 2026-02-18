class ContractualEmployee extends Employee {
    private double overtimeHours;

    public ContractualEmployee(String firstName, String lastName,
                               String idNo, String position,
                               String department, double hoursWrk,
                               double hourlyRate, double overtimeHours) {
        super(firstName, lastName, idNo, position, department, hoursWrk, hourlyRate);
        this.overtimeHours = overtimeHours;
    }

    public double computeSalary() {
        return super.computeSalary() + (overtimeHours * getHourlyRate());
    }
}
