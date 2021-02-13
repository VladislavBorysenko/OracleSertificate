package lesson_13_SWITCH;

public class Test1 {
}
class Student{
    double grade;

    public Student(double grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st=new Student(11);

        if (st.grade==2){
            System.out.println("Student dvoishnok");
        }else if (st.grade==3){
            System.out.println("Student troishnik");
        }else if (st.grade==4){
            System.out.println("student horishist");
        }else if (st.grade==5){
            System.out.println("Student horishist");
        }else {
            System.out.println("ocenka ne verna");
        }

        switch ((int) st.grade){
            case 2:
                System.out.println("student dvoishnik");
                break;
            case 3:
                System.out.println("student troishnik");
                break;
            case 4:
                System.out.println("student horoshist");
                break;
            case 5:
                System.out.println("student tnlichnik");
                break;
            default:
                System.out.println("ocenka ne vernaya");
                break;
        }
    }
}