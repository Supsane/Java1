package Lesson5;

/**
 * Created by Евгений Чашурин on 07.02.2017.
 * echashurin@gmail.com
 */
public class Person {
    private String fio;
    private String position;
    private String email;
    private int telephone;
    private int salary;
    private int age;

    Person (String fio, String position, String email, int telephone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public void outPerson () {
        System.out.println(fio + ", " + position + ", " + email + ", " + telephone + ", " + salary + ", " + age);
    }

}
