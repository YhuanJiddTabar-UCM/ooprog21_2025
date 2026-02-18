public class TestPerson {
    public static void main(String[] args) {

        RegularEmployee regEmp = new RegularEmployee(
                "Juan", "Dela Cruz",
                "E001", "Manager",
                "IT", 40, 200, 5000);

        ContractualEmployee conEmp = new ContractualEmployee(
                "Maria", "Santos",
                "E002", "Staff",
                "HR", 40, 150, 10);

        Student student = new Student(
                "Pedro", "Reyes",
                "S001", "BSIT",
                "CCS");

        System.out.println(regEmp.displayInfo());
        System.out.println("--------------------");
        System.out.println(conEmp.displayInfo());
        System.out.println("--------------------");
        System.out.println(student.displayInfo());
    }
}
