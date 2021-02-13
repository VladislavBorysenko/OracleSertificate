package lesson_29_Lyambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test6 {
    public static void main(String[] args) {
        ArrayList<lesson_29_Lyambda.Student1> studentArrayList=new ArrayList<>();
        lesson_29_Lyambda.Student1 s1= new lesson_29_Lyambda.Student1("Ivan",'m',20,3,7.3);
        lesson_29_Lyambda.Student1 s2= new lesson_29_Lyambda.Student1("Denis",'m',18,1,9.9);
        lesson_29_Lyambda.Student1 s3= new lesson_29_Lyambda.Student1("Masha",'w',22,5,2.6);
        lesson_29_Lyambda.Student1 s4= new lesson_29_Lyambda.Student1("Pasha",'m',19,2,9.3);
        lesson_29_Lyambda.Student1 s5= new lesson_29_Lyambda.Student1("Lena",'w',20,3,5.3);
        lesson_29_Lyambda.Student1 s6= new lesson_29_Lyambda.Student1("Tanya",'w',21,4,8.3);
        lesson_29_Lyambda.Student1 s7= new lesson_29_Lyambda.Student1("Dasha",'w',19,2,5.3);
        lesson_29_Lyambda.Student1 s8= new lesson_29_Lyambda.Student1("Jheka",'m',18,1,8.0);


        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);
        studentArrayList.add(s5);
        studentArrayList.add(s6);
        studentArrayList.add(s7);
        studentArrayList.add(s8);

       Student1.StudentInfo1 si=new Student1.StudentInfo1();
       for (Student1 s: studentArrayList){
           System.out.println(s.name);
       }
        System.out.println("____________________________________________________________________________________");
       studentArrayList.removeIf(x->x.name.endsWith("a"));
        for (Student1 s:studentArrayList
             ) {
            System.out.println(s.name);
        }


//        si.testStudents(studentArrayList, (Student1 st)->{return st.avgGrade>8.3;});
//        System.out.println("_______________________________________________________________________________________");
//        si.testStudents(studentArrayList,  (Student1 st)->{return st.avgGrade>4.3;});
//        System.out.println("_______________________________________________________________________________________");
//        si.testStudents(studentArrayList,  (Student1 st)->{return st.avgGrade>8.0;});
//        System.out.println("_______________________________________________________________________________________");
//        si.testStudents(studentArrayList,   st-> st.avgGrade>5.7);
//        System.out.println("_______________________________________________________________________________________");
//        si.testStudents(studentArrayList, (Lesson_29_Lyambda.Student1 st)->{return st.avgGrade>10;});
//        System.out.println("_______________________________________________________________________________________");
//        si.testStudents(studentArrayList, (Lesson_29_Lyambda.Student1 st)->{return st.avgGrade>7.2 && st.age<23;});
    }
}

class Student1 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student1(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

static class StudentInfo1 {


    void testStudents(ArrayList<Student1> aL, Predicate <Student1> sc){
        for (Student1 s:aL) {
            if (sc.test(s)) {
                printStudent(s);
            }

        }
    }
    void printStudent(Student1 student) {
        System.out.println("Info: " + student.name + "\n sex: " + student.sex + "\n age: " + student.age + "\n course: " + student.course
                + "\n avg grade" + student.avgGrade + "\n___________________________________________________________________");
    }


}

}