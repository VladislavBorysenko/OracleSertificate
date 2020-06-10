package Lesson_20_varargs_forea;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Privet");
        StringBuilder sb2 = new StringBuilder("Poka");
        StringBuilder sb3 = new StringBuilder("Ok");
        StringBuilder[] array = {sb1, sb2, sb3};
        for (StringBuilder sb : array
        ) {
            sb.append(" java");
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
