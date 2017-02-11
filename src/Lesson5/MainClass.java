package Lesson5;

/**
 * Created by Евгений Чашурин on 07.02.2017.
 * echashurin@gmail.com
 */
public class MainClass {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Иванов Иван Иванович", "Завхоз", "ivanov3245@mail.ru", 123456, 25000, 21);
        persArray[1] = new Person("Петров Федор Сергеевич", "Инженер", "petrofff@mail.ru", 98789573, 35000, 28);
        persArray[2] = new Person("Сидоров Акакий Евгеньевич", "Специалист", "sidr_akakiy@mail.ru", 54273618, 28000, 47);
        persArray[3] = new Person("Бугров Василий Александрович", "Директор", "vasiliy_bugor@mail.ru", 9784612, 50000, 54);
        persArray[4] = new Person("Пупкин Васийлий Петрович", "Юрист", "pupok_glavniy@mail.ru", 6537218, 20000, 38);

        for (int i = 0; i <persArray.length ; i++) {
            int age = persArray[i].getAge();
            if (age > 40) {
                persArray[i].outPerson();
            }
        }
    }
}
