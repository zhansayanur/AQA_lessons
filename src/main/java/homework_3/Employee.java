package homework_3;

import java.util.Arrays;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo(){
        System.out.println("Full name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Salary: " + salary + " tenge");
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 350000, 43);
        persArray[1] = new Employee("Dove Cameron", "DevOps", "dovecameron@mailbox.com", "877774444", 400000, 28);
        persArray[2] = new Employee("Lana Del Rey", "UX/UI designer", "ultraviolence@gmail.com", "899914333", 250000, 38);
        persArray[3] = new Employee("Alex Turner", "QA", "arcticmonkeys@gmail.com", "822332211", 300000, 38);
        persArray[4] = new Employee("Cate Blanchett", "Software engineer", "carol2015@mailbox.com", "844412345", 500000, 54);

        System.out.println("Information on employees over the age of 40:");
        for (Employee employee : persArray) {
            if (employee.age > 40) {
                employee.getInfo();
            }
        }
    }
}
