package Lesson_16_ClassString;

//будем искать заглавную букву в тексте, после того как мы её найдем, выводим текст с новой строки начиная с этой буквы
public class Test7 {
    public static void main(String[] args) {
        String s1 = "Вопросов полон мир, - кто даст на них ответ? Брось этим мучиться, пока ты в цвете лет. ут, на земле, " +
                "вином создай эдем, - в небесный Не то ты попадешь, не то, мой милый, нет.";
        String s2 = s1.toUpperCase();
        char c1;
        char c2;
        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if (c1 != ',' && c1 != ':' && c1 != ' ' && c1 != '.' && c1 != '-' && c1 != '?' && c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();
    }
}
