package lesson_8_Non_accesM;

public class Test1 {
    public final int a;//a=10;

    Test1() {
        a = 10;//Внутри каждого конструктора необходимо инициализировать нашу константу
    }

    Test1(boolean b) {
        a = 15;//Внутри каждого конструктора необходимо инициализировать нашу константу
    }

    public void abc(short s) {
        byte b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        // t.a=t.a*2;-выдает ошибку так как переменная t является константой
        System.out.println(t.a);

        t.abc((short) 5);
    }
}
