package Lessons_27_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {
    void abc() throws FileNotFoundException {
        File file = new File("test9.txt");
        FileInputStream fis = new FileInputStream(file);
//        try {
//
//        } catch (FileNotFoundException e) {
//            System.out.println("exception :" + e);
//
//        }
    }

    void def(){
        System.out.println( "privet");
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("bil poiman exception :"+e);
        }
    }

    public static void main(String[] args) {


        System.out.println("Vsem horoshego dnya");

        System.out.println("prosto cod");
    }
}
