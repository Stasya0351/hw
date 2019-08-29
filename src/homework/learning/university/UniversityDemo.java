package homework.learning.university;

import homework.learning.university.person.Person;
import homework.learning.university.staff.Staff;
import homework.learning.university.student.Student;


public class UniversityDemo {
    public static void main(String[] args) {
        Student vasya = new Student("Vasya", "First Street, 10",
                "Math", 5, 1000.0);
        Staff teacher = new Staff("Avdotya Petrovna",
                "Street Pushkina, house Kolotushkina", "First",
                10000.0);
        System.out.println(vasya + "\n" + teacher);
        Person friend = new Student("Friend", "Equestria street, 10",
                "Math", 5, 1000.0);
        System.out.println(friend);



    }
}
