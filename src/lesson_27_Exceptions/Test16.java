package lesson_27_Exceptions;

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
        Teacher t1=new Teacher();
        Teacher[]array2={t,t1};
        Employee []array1={d,t};
       // Teacher t2=(Teacher)array1[0];
       Samolet s=new Samolet();
      Integer.parseInt("44ab",16);
    }
public static void craetePsw(String pswd)   {
        if (pswd.length()<6)throw new IllegalArgumentException("Dlina parolya slishkom malenkaya");
        if (pswd.length()>12)throw new IllegalArgumentException("Dlina parolya slishkom bolshaya");
        else System.out.println("Parol prinyat");
}

}


class Employee{}
class Doctor extends Employee{}
class Teacher extends Employee{}

class Samolet{
    String sostoyanie="V ozhidanii";//v ojidanii, v vozduhe, polet otmenen

    public void letet(){
        sostoyanie="v vozduhe";

        System.out.println("Samolet letit");
    }

    public void ozhidat(){
        if (sostoyanie.equals("v vozduhe")){
            throw new IllegalStateException("Samolet uzhe v vozduhe");
        }
        sostoyanie="V ozhidanii";
        System.out.println("Samolet v ozhidanii poleta");
    }

    public void otmenitPolet(){
        if (sostoyanie.equals("v vozduhe")){
        throw new IllegalStateException("Samolet uzhe v vozduhe");
    }
        sostoyanie="Polet otmenen";
        System.out.println("Polet otmenen");
    }
}