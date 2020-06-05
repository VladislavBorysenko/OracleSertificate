package Lesson_8_Non_accesM;

//Static
public class Student {

    String name;
    int course;
    static int count;//добавив static аша переменная становится переменной класса, а не обьект

    int a;

    Student(String name1, int course1) {
        count++;//счетчик наших студентов
        name = name1;
        course = course1;
        System.out.println("Студент #" + count + " создан");
    }

    public static void showCount() {
        System.out.println("Vsego sozdano studentov: " + count);//Данный метод мы можем вызывать не создава обьекта класса
    }

    public void showInfo() {

        System.out.println("Welcome to this student class!");
    }

    public static void showInfo1() {

        System.out.println("Welcome to this class!");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() { //Статический метод не зависит от обьекта
        count++;
        Student st = new Student("Ivan", 2);
        //Для того что бы использовать не static переменную
        // в статическом методе, нам необходимо в методе создать обьект данного класса,
        //а затем на нем использовать нашу переменную
        st.a++;
    }


    public static void main(String[] args) {
        Student st1 = new Student("Vlad", 2);
        Student st2 = new Student("Vova", 1);
        Student st3 = new Student("Slava", 3);
        Student st4 = new Student("Stas", 4);
        Student st5 = new Student("Dima", 2);

        System.out.println(st3.name);
        System.out.println(count);
        System.out.println(st2.count);
        System.out.println(st3.count);

        showCount();

        st5.showCount();//Хоть метод showCount не является методом обьекта st5, данный обьект может его вызывать
        //так как st5 является обьектом класса Student так как и метод showCount

        st1.showInfo();//Не static візівается на обьекте
        showInfo1();//static вызывается в том же классе, но без обьекта

    }
}
