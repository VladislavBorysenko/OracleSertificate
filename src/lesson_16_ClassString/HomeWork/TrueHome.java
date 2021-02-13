package lesson_16_ClassString.HomeWork;

public class TrueHome {

    public static void email(String s) {
        int a = 0;//позиция символа @
        int b = 0;//позиция символа .
        int c = 0;//позиция символа ;

        while (c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        String text = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
        email(text);
    }
}
