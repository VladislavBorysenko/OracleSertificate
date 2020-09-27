package Lessons_27_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {

    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test9.txt");
            System.out.println("fis1 created...");
            try {
                fis2 = new FileInputStream("test10.txt");

            } catch (FileNotFoundException e) {
                System.out.println("File test10 not found");

            }
        } catch (FileNotFoundException e) {
            System.out.println("File test9 not found");
        } finally {
            System.out.println("eto vneshniy finally block");

            try {
                fis1.close();
                fis2.close();
            } catch (IOException e) {
                System.out.println("Naideno iskluchenie v finally bloke");
            }
        }
    }

    public static void main(String[] args) {
        Test11 t=new Test11();
        t.abc();
    }
}