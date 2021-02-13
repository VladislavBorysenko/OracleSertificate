package lesson_18_ARRAY;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {

        int array1[]={1,43,6,7,8,43,5,7,9};
        for (int i = 0; i <array1.length ; i++) {

            System.out.println(array1[i]);

        }

        Arrays.sort(array1);
        for (int i = 0; i <array1.length ; i++) {
            System.out.print(array1[i]+" ");
        }

        int index1=Arrays.binarySearch(array1,8);
       // System.out.println(index1);
    }
}
