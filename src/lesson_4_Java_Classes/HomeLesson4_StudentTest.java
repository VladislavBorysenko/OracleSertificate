package lesson_4_Java_Classes;

class Student {

    int idTicket;
    int year;
    double averageRatingOfMath;
    double averageRatingOfEconomy;
    double averageRatingOfForeignLanguage;

    String nameStudent;
    String surName;


    double sredneeArifmeticheskoe(){
        double srednee = (averageRatingOfEconomy+averageRatingOfMath+averageRatingOfForeignLanguage)/3;
        System.out.println(nameStudent+" Srednee Ariphmetichnoe :"+ srednee);
        return srednee;
    }

}

public class HomeLesson4_StudentTest {

    double sredArifmOcenka(Student st){
        double sred=(st.averageRatingOfEconomy+st.averageRatingOfMath+st.averageRatingOfForeignLanguage)/3;
        System.out.println(st.nameStudent+" "+sred);
        return sred;

    }
    public static void main(String[] args) {

        Student micle = new Student();
        micle.idTicket = 1;
        micle.year = 2020;
        micle.averageRatingOfEconomy = 12;
        micle.averageRatingOfForeignLanguage = 8;
        micle.averageRatingOfMath = 7;
        micle.surName = "Egorov";
        micle.nameStudent = "Micle";

        Student sergey = new Student();
        sergey.idTicket = 2;
        sergey.year = 2020;
        sergey.averageRatingOfEconomy = 10;
        sergey.averageRatingOfForeignLanguage = 6;
        sergey.averageRatingOfMath = 9;
        sergey.surName = "Dugin";
        sergey.nameStudent = "Serge";

        Student andrey = new Student();
        andrey.idTicket = 3;
        andrey.year = 2020;
        andrey.averageRatingOfEconomy = 7;
        andrey.averageRatingOfForeignLanguage = 12;
        andrey.averageRatingOfMath = 10;
        andrey.surName = "Simikin";
        andrey.nameStudent = "Andrey";


        sergey.sredneeArifmeticheskoe();

        //Если есть класс, то мі можем создать и обьект єтого класса
        //создаем обьект класса которому пренадлежит метод
        HomeLesson4_StudentTest st=new HomeLesson4_StudentTest();//создаем обьект класса HomeLesson4_StudentTest
        st.sredArifmOcenka(andrey);


    }

}

