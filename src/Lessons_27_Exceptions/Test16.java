package Lessons_27_Exceptions;

import java.util.ArrayList;

public class Test16 {


    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("1");
        list.add("2");
        int a=3;
//        if (list.size()>a-1){
//            System.out.println(list.get(a-1));
//        }else {
//            System.out.println("dannogo indeksa ne suchestvuet");}

        Doctor d=new Doctor();
        Teacher t=new Teacher();
        Employee []array1={d,t};
        Teacher t2=(Teacher)array1[0];
    }
}
class Employee{}
class Doctor extends Employee{}
class Teacher extends Employee{}