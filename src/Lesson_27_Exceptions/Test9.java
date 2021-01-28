package Lesson_27_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("test .txt");
            FileInputStream fis = new FileInputStream(f);

        } catch (FileNotFoundException e) {
            System.out.println("Exception poiman i nemnogo obrabotan");
            throw e;
        } finally {
            System.out.println("eto block finally");

        }

    }

    void  method(){
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Polnaya obrabotka exceptiona");
        }
    }

//    void def() {
//        try {
//            int[] a = {1, 2, 3};
//            System.out.println(a[3]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception poiman i nemnogo obrabotan");
//            throw e;
//        } finally {
//            System.out.println("eto block finally");
//        }
//    }

    public static void main(String[] args) {

    }
}
