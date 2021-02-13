package lesson_12_if_ifElse.HomeWork;

import lesson_11_Argument_of_methods.Student;

public class StudentTest {

    static void comparison(Student s1, Student s2){
        if (s1.equals(s2)){
            System.out.println("Студенты ровны");
        }else {
            System.out.println("Студенты не ровны");
        }
    }

    void cocomparison2(Student s1, Student s2){
        if (s1.course>s2.course ){
            if (s1.grade>s2.grade){
                System.out.println(s1.name+" учиться на старшем курсе, и у него лучше успеваемость");
            }else {
                System.out.println(s1.name+" учиться на старшем курсе но у него хуже успиваемость");
            }
        }else
            System.out.println(s2.name+ " Учиста на старшем курсе");

        }



    public static void main(String[] args) {
        Student s1 = new Student("Ivan",3,8);
        Student s2 = new Student("Bolvan",2,9);
        comparison(s1,s2);
        StudentTest st=new StudentTest();
        st.cocomparison2(s1,s2);
    }
}
