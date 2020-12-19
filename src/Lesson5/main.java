package Lesson5;

public class main {


    public static void main(String[] args) {
        Employee employee1= new Employee("Иванов","Иван","Иванович","Консультант","ivanov@mail.ru","555-55-88",32545.50,30);
        Employee employee2= new Employee("Петров","Игорь","Дмитриевич","Консультант","petrov@mail.ru","555-55-89",32545.50,33);
        Employee employee3= new Employee("Сидоров","Дмитрий","Сергеевич","Ведущий инженер","sidorov@mail.ru","555-55-90",55200.50,42);
        Employee employee4= new Employee("Валуев","Сергей","Александрович","ГИП","valuev@mail.ru","777-00-03",70000.00,45);
        Employee employee5= new Employee("Трофимов","Александр","Андреевич","Заместитель директора","trofimov@mail.ru","777-00-02",95000.50,51);

        Employee[] employeesArray =new Employee[5]; // {employee1,employee2,employee3,employee4,employee5};
        employeesArray[0] =new Employee("Иванов","Иван","Иванович","Консультант","ivanov@mail.ru","555-55-88",32545.50,30);
        employeesArray[1] =new Employee("Петров","Игорь","Дмитриевич","Консультант","petrov@mail.ru","555-55-89",32545.50,33);
        employeesArray[2] =new Employee("Сидоров","Дмитрий","Сергеевич","Ведущий инженер","sidorov@mail.ru","555-55-90",55200.50,42);
        employeesArray[3] =new Employee("Валуев","Сергей","Александрович","ГИП","valuev@mail.ru","777-00-03",70000.00,45);
        employeesArray[4] =new Employee("Трофимов","Александр","Андреевич","Заместитель директора","trofimov@mail.ru","777-00-02",95000.50,51);

        for (Employee empArr: employeesArray
        ) {empArr.PrintInfoEmployee();
        }


        int empOld = 40;
        System.out.println("Сотрудники старше "+empOld +" лет: ");
        for (int i = 0; i <employeesArray.length; i++) {
            if (employeesArray[i].getEmpAge()>=empOld){
                employeesArray[i].PrintInfoEmployee();
            }

        }






    }



}

