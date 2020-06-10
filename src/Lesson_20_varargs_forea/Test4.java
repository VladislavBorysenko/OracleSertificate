package Lesson_20_varargs_forea;

public class Test4 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Sidorov", "Petrov"};
        String[] exams = {"Mat analiz", " Philosophy"};
        for (String s1 : students) {
            for (String s2:exams) {
                System.out.println(s1+" "+s2);
            }

        }

    }
}
