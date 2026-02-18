class Employee extends Person implements iCompute {
    private String idNo;
    private String position;
    private String department;
    private double hoursWrk;
    private double hourlyRate;

    public Employee(String firstName, String lastName,
                    String idNo, String position,
                    String department, double hoursWrk,
                    double hourlyRate) {
        super(firstName, lastName);
        this.idNo = idNo;
        this.position = position;
        this.department = department;
        this.hoursWrk = hoursWrk;
        this.hourlyRate = hourlyRate;
    }

    // Getters
    public String getIdNo() { return idNo; }
    public String getPosition() { return position; }
    public String getDepartment() { return department; }
    public double getHoursWrk() { return hoursWrk; }
    public double getHourlyRate() { return hourlyRate; }

    // Setters
    public void setIdNo(String idNo) { this.idNo = idNo; }
    public void setPosition(String position) { this.position = position; }
    public void setDepartment(String department) { this.department = department; }
    public void setHoursWrk(double hoursWrk) { this.hoursWrk = hoursWrk; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

    // Basic salary computation
    public double computeSalary() {
        return hoursWrk * hourlyRate;
    }

    public String displayInfo() {
        return "Employee: " + getFirstName() + " " + getLastName()
                + "\nID: " + idNo
                + "\nPosition: " + position
                + "\nDepartment: " + department
                + "\nSalary: " + computeSalary();
    }
}
