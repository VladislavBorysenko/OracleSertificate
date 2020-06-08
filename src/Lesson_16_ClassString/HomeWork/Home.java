package Lesson_16_ClassString.HomeWork;

public class Home {
    public static void main(String[] args) {
        String text = "ya@yahoo.com; on@mail.ru; ona@gmail.com;";
        String[] mail = text.split(";");
        for (int i = 0; i < mail.length; i++) {
            String txt = mail[i];
            int a = txt.indexOf('@');
            int b = txt.indexOf('.');
            txt = txt.substring(a+1, b);
            System.out.println(txt);
        }


    }

}



