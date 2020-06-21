package Lesson_19_varargs_forea;

public class Test5 {
    public static void main(String[] args) {
        int[][]array={{1,2,5},{3,5,6},{-6,4,9}};
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
        //вывод массива через foreach
        for (int[]array2:array
             ) {
            for (int a:array2
                 ) {
                System.out.println(a+" ");
            }
            
        }
    }
}
