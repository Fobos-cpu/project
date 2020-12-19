package Lesson6;


public class Employee {
    String firstName;
    String name;
    String lastName;
    String email;
    String phoneNumber;
    String post;
    double empSalary;
    int empAge;

    public Employee(String firstName, String name, String lastName, String post, String email, String phoneNumber, double empSalary, int empAge) {
        this.firstName = firstName;
        this.name = name;
        this.lastName = lastName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.empSalary = empSalary;
        this.empAge = empAge;
    }


    void PrintInfoEmployee(){
        System.out.println(this);
    }


    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    @Override
    public String toString() {
        return "Сотрудник:{" +
                "Фамилия:'" + firstName + '\'' +
                ", Имя:'" + name + '\'' +
                ", Отчество:'" + lastName + '\'' +
                ", email:'" + email + '\'' +
                ", Номер телефона :'" + phoneNumber + '\'' +
                ", Должность:'" + post + '\'' +
                ", Заработная плата=" + empSalary + "рублей" +
                ", Возраст=" + empAge +" лет "+
                '}';
    }
}

