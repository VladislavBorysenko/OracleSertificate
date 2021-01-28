package Lesson_27_Exceptions;

import java.io.*;




public class Test7 {
    public static void main(String[] args) {
        StringBuilder result=new StringBuilder("");
        try {
            File f=new File("test7.txt");
            System.out.println("obiekt file f sozdalsa");
            FileInputStream fis=new FileInputStream(f);
            System.out.println("stream sozdalsa");
            int count=0;
            while (true) {
                count++;
                result.append(fis.read());
                System.out.println("informaciya chitaetsya...");
                if (count==3) {
                    fis.close();
                }
            }

        }catch (FileNotFoundException e){
            System.out.println("Exception 1");
        }catch (IOException e){
            System.out.println("Exception 2");
        }finally {
            System.out.println("eto finally");
        }
    }
}
