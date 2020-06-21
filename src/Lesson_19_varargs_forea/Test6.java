package Lesson_19_varargs_forea;

public class Test6 {
    public static void main(String[] args) {
        int[]array={4,5,7,0};
        for (int i = 0; i <array.length ; i++) {
            array[i]+=2;
           // System.out.println(array[i]);
            array[i]=3;
            System.out.println(array[i]);
        }
        String[]array2={"privet","poka","ok"};
        for (String s:array2
             ) {
            s = new String("hello");
        }
            for (int i = 0; i <array2.length ; i++) {
                System.out.println(array2[i]);
            }

    }
}
