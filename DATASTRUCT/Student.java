class Student extends Person {
    private String idNo;
    private String course;
    private String department;

    public Student(String firstName, String lastName,
                   String idNo, String course,
                   String department) {
        super(firstName, lastName);
        this.idNo = idNo;
        this.course = course;
        this.department = department;
    }

    // Getters
    public String getIdNo() { 
    return idNo;
     }
    public String getCourse() { 
    return course; 
    }
    public String getDepartment() { 
    return department; 
    }

    // Setters
    public void setIdNo(String idNo) { this.idNo = idNo; }
    public void setCourse(String course) { this.course = course; }
    public void setDepartment(String department) { this.department = department; }

    public String displayInfo() {
        return "Student: " + getFirstName() + " " + getLastName()
                + "\nID: " + idNo
                + "\nCourse: " + course
                + "\nDepartment: " + department;
    }
}
