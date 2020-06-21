package Lesson_19_varargs_forea;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {0, 6, 5, 4};
        int sum = 0;
        //вывидем сумму элементов массива
        for (int a : array
        ) {
            sum += a;
        }
        System.out.println(sum);
    }
}
