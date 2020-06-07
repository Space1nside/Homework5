public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNum;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNum, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void employeeInfo() {
        System.out.println("Name Surname and Middle name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNum);
        System.out.println("Salary: $" + salary);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
