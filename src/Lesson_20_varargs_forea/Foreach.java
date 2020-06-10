package Lesson_20_varargs_forea;

public class Foreach {
    public static void main(String[] args) {
        int[]array={0,4,5,6};
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }

        for (int a:array
             ) {
            System.out.println(a+" ");
            
        }
    }
}
