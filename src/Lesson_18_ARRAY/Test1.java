package Lesson_18_ARRAY;

public class Test1 {
    public static void main(String[] args) {
        char[][][] arrChar = {{{'a', 'b'}, {'c', 'd'}, {'e', 'f'}}, {{'g', 'h'}, {'i', 'j'}, {'k', 'l'}}};
        System.out.println(arrChar[1][1][1]);

        int[] array1;
        String[] array2;
        double[][] array3;
        int[][] arr10;

        array1 = new int[8];
        array2 = new String[3];
        array3 = new double[4][2];
        arr10 = new int[3][];

        array2[0] = "privet";
        array2[1] = "poka";
        array2[2] = "ok";

        array3[0][0] = 3.14;
        array3[2][1] = 4.5;

        double[] array5;
        array5 = new double[2];
        array5[0]=2.5;
        array5[1]=3.5;

        array3[1]=array5;//заполнили одномерный массив в многомерном мосиве массивом array5
    }
}
