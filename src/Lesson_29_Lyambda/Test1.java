package Lesson_29_Lyambda;

import java.util.ArrayList;

public class Test1 {
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student student) {
        System.out.println("Info: " + student.name + "\n sex: " + student.sex + "\n age: " + student.age + "\n course: " + student.course
                + "\n avg grade" + student.avgGrade+"\n___________________________________________________________________");
    }

    void printStudentsOverGrade(ArrayList<Student> arrayList, double avgGrade) {
        for (Student s : arrayList
        ) {
            if (s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentUnderGrade(ArrayList<Student> arrayList, double avgGrade) {
        for (Student s : arrayList
        ) {
            if (s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentUnderAge(ArrayList<Student> arrayList, int age) {
        for (Student s : arrayList
        ) {
            if (s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentOverAge(ArrayList<Student> arrayList, int age) {
        for (Student s : arrayList
        ) {
            if (s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentSex(ArrayList<Student> arrayList, char sex) {
        for (Student s : arrayList
        ) {
            if (s.sex==sex) {
                printStudent(s);
            }
        }
    }

    void printStudentsMixConditions(ArrayList<Student> arrayList,double avgGrade, char sex, int age){
        for (Student s:arrayList
             ) {
            if (s.avgGrade>avgGrade && s.age<age && s.sex==sex){
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student>studentArrayList=new ArrayList<>();
        Student s1=new Student("Ivan",'m',20,3,7.3);
        Student s2=new Student("Denis",'m',18,1,1.3);
        Student s3=new Student("Masha",'w',22,5,2.6);
        Student s4=new Student("Pasha",'m',19,2,9.3);
        Student s5=new Student("Lena",'w',20,3,5.3);
        Student s6=new Student("Tanya",'w',21,4,8.3);
        Student s7=new Student("Dasha",'w',19,2,5.3);
        Student s8=new Student("Jheka",'m',18,1,8.0);

        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);
        studentArrayList.add(s5);
        studentArrayList.add(s6);
        studentArrayList.add(s7);
        studentArrayList.add(s8);

        StudentInfo info=new StudentInfo();
        info.printStudent(s1);
        info.printStudentOverAge(studentArrayList, 20);
        

    }
}