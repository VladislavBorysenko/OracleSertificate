package lesson_27_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
    void abc() throws FileNotFoundException {

     File file = new File("test9.txt");
     FileInputStream fis = new FileInputStream(file);
        System.out.println("OK");
    }

    void def() throws FileNotFoundException {
abc();
    }

    public static void main(String[] args) {

        Test4 test = new Test4();
        try {
            test.def();
        } catch (FileNotFoundException e) {

            System.out.println("Exception poyman");
            System.out.println(e);
            System.out.println(e.getMessage());
          // e.printStackTrace();
        }
    }
}
