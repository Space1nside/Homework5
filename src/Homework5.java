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

public class Homework5 {
    public static void main(String[] args) {
        Employee employee = new Employee("Adilet Sooronbaev Sheradilovich", "Game developer", "jostonfer@gmail.com", "0775523764", 15000, 24);
        employee.employeeInfo();

        Employee[] stuffArr = new Employee[5];
        stuffArr[0] = new Employee("John Jonah Jameson", "Publisher", "jjjameson@gmail.com", "023564897", 10000, 56);
        stuffArr[1] = new Employee("Alex Mercer", "Head researcher", "alex_m@gmail.com", "067865946", 13000, 48);
        stuffArr[2] = new Employee("Peter Parker", "Journalist", "peter_parker@gmail.com", "047832514", 5600, 20);
        stuffArr[3] = new Employee("Akbermet Toktobekova Toktobekovna", "Secretary", "akBemTy@gmail.com", "056454126", 3000, 25);
        stuffArr[4] = new Employee("Kartofel Kartoshka Kartofanovich", "Food", "kartoha@gmail.com", "04345879", 500000, 12);

        for(int i = 0; i < stuffArr.length; i++) {
            if(stuffArr[i].getAge() > 40) {
                stuffArr[i].employeeInfo();
            }
        }
    }
}
