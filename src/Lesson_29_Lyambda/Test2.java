package Lesson_29_Lyambda;

import java.util.ArrayList;

public class Test2 {

}

//class Student1 {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    public Student1(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//class StudentInfo1 {
//
//    public static void main(String[] args) {
//        ArrayList<Student1> studentArrayList=new ArrayList<>();
//        Student1 s1= new Student1("Ivan",'m',20,3,7.3);
//        Student1 s2= new Student1("Denis",'m',18,1,9.9);
//        Student1 s3= new Student1("Masha",'w',22,5,2.6);
//        Student1 s4= new Student1("Pasha",'m',19,2,9.3);
//        Student1 s5= new Student1("Lena",'w',20,3,5.3);
//        Student1 s6= new Student1("Tanya",'w',21,4,8.3);
//        Student1 s7= new Student1("Dasha",'w',19,2,5.3);
//        Student1 s8= new Student1("Jheka",'m',18,1,8.0);
//
//
//        studentArrayList.add(s1);
//        studentArrayList.add(s2);
//        studentArrayList.add(s3);
//        studentArrayList.add(s4);
//        studentArrayList.add(s5);
//        studentArrayList.add(s6);
//        studentArrayList.add(s7);
//        studentArrayList.add(s8);
//
//        StudentInfo1 si=new StudentInfo1();
//        FindStudentsOverGrade fsog=new FindStudentsOverGrade();
//        FindStudentsUnderGrade fsug=new FindStudentsUnderGrade();
//        FindStudentsOverAge fsoa=new FindStudentsOverAge();
//        FindStudentsBySex fsbs=new FindStudentsBySex();
//        FindStudentsMixCondition fsmc=new FindStudentsMixCondition();
//
//        si.testStudents(studentArrayList, fsog);
//        System.out.println("_______________________________________________________________________________________");
//        si.testStudents(studentArrayList, fsug);
//        System.out.println("_______________________________________________________________________________________");
//        si.testStudents(studentArrayList, fsoa);
//        System.out.println("_______________________________________________________________________________________");
//        si.testStudents(studentArrayList, fsbs);
//        System.out.println("_______________________________________________________________________________________");
//        si.testStudents(studentArrayList, fsmc);
//        System.out.println("_______________________________________________________________________________________");
//    }
//    void testStudents(ArrayList<Student1> aL, StudentsChecks sc){
//        for (Student1 s:aL) {
//            if (sc.Test(s)){
//                printStudent(s);
//            }
//
//        }
//    }
//    void printStudent(Student1 student) {
//        System.out.println("Info: " + student.name + "\n sex: " + student.sex + "\n age: " + student.age + "\n course: " + student.course
//                + "\n avg grade" + student.avgGrade + "\n___________________________________________________________________");
//    }
//
//
//}
//
//interface StudentsChecks{
//    boolean Test(Student1 student1);
//}
//
//class FindStudentsOverGrade implements StudentsChecks{
//
//    @Override
//    public boolean Test(Student1 student1) {
//        return student1.avgGrade>8.5;
//    }
//}
//class FindStudentsOverAge implements StudentsChecks{
//
//    @Override
//    public boolean Test(Student1 student1) {
//        return student1.age>20;
//    }
//}
//class FindStudentsUnderGrade implements StudentsChecks{
//
//    @Override
//    public boolean Test(Student1 student1) {
//        return student1.age<30;
//    }
//}
//class FindStudentsBySex implements StudentsChecks{
//
//    @Override
//    public boolean Test(Student1 student1) {
//        return student1.sex=='w';
//    }
//}
//class FindStudentsMixCondition implements StudentsChecks{
//
//    @Override
//    public boolean Test(Student1 student1) {
//        return student1.avgGrade>7 && student1.age<20 && student1.sex=='m';
//    }
//}