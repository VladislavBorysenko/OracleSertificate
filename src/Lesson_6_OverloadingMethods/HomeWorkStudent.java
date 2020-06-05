package Lesson_6_OverloadingMethods;

public class HomeWorkStudent {

    int idTicket;
    int year;

    double averageRatingOfMath;
    double averageRatingOfEconomy;
    double averageRatingOfForeignLanguage;

    String nameStudent;
    String surName;
    String course;

    HomeWorkStudent(int idTicket1, int year1, double averageRatingOfMath1, double averageRatingOfEconomy1,
                    double averageRatingOfForeignLanguage1, String nameStudent1, String surName1,String course1) {

        idTicket = idTicket1;
        year = year1;
        averageRatingOfMath = averageRatingOfMath1;
        averageRatingOfEconomy = averageRatingOfEconomy1;
        averageRatingOfForeignLanguage = averageRatingOfForeignLanguage1;
        nameStudent = nameStudent1;
        surName = surName1;
        course=course1;
    }

    HomeWorkStudent(int idTicket2, String nameStudent2,String surName2, String course2) {
        this(idTicket2, 0, 0.0, 0.0,
                0.0, nameStudent2, surName2,course2);
    }

    HomeWorkStudent() {
        //пустой конструкторб не принемает некаких параметров
    }
}

class HomeWorkStudentTest {
    public static void main(String[] args) {

        HomeWorkStudent st1 = new HomeWorkStudent();
        HomeWorkStudent st2 = new HomeWorkStudent(2, 1586, 12.5, 20.,
                56., "Ivan", "Ivanov","Math");
        HomeWorkStudent st3 = new HomeWorkStudent(3, "Ivanka","bogdan","Economy");

        System.out.println(st1.nameStudent);
        System.out.println(st2.nameStudent);
        System.out.println(st3.nameStudent);
    }
}