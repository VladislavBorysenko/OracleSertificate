package lesson_20_ArrayList;

import java.util.Arrays;

public class Test8 {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5,6};
        int[] array2={1,2,3,5};

        char[]array3={'p','r','v','e','t'};
        char[]array4={'p','r','v','i','v','k','a'};
        char[]array5={'p','r','v','i','v','k','a'};
        System.out.println(Arrays.compare(array1,array2));
        System.out.println(Arrays.compare(array3,array4));
        System.out.println(Arrays.mismatch(array3,array4));
        System.out.println(Arrays.mismatch(array5,array4));
    }
}
