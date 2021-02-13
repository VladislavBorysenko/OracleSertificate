package lesson_16_ClassString;

public class Test6 {
    public static void main(String[] args) {
String s1="Kak sebya chuvstvuesh?";
String s2="Hello word";
String s3=s1.concat(s2).trim().replace("word","mir").substring(6,10);
        System.out.println(s3);
        System.out.println(s1.substring(s1.indexOf('c')));
    }
}
