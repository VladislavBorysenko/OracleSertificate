package Lesson_18_ARRAY;
//сравнени массивов
public class Test5 {
    public static void main(String[] args) {
        int []array1={1,4,7,9,5,3};
        int []array2={1,4,7,9,5,3};
        int []array3=array2;
        array1[2]=5;
        array1[5-2]=6;
        array1[array1.length]=5;
        System.out.println(array1==array2);
        System.out.println(array3==array2);
    }
}
