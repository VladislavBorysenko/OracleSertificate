package lesson_27_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("Privet");
        try {
            File f = new File("test .txt");
            FileInputStream fis = new FileInputStream(f);

        } catch (FileNotFoundException e) {
            System.out.println("Exception poiman");
            System.out.println("peremennaya a v catch bloke = " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("eto block finally");
            System.out.println("peremennaya v final blocke = " + a);
            //return 9;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());

    }
}
