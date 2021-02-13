package lesson_27_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Poiman exception 1");
        }
        catch (RuntimeException e){
            System.out.println("Poiman exception 4");
 //       }
//        catch (NullPointerException e) {
//            System.out.println("Poiman exception 2");
        }catch (IOException e){
            System.out.println("Poiman exception 3");
        }
        catch (Exception e){
            System.out.println("Poiman exception 5");
        }catch (Throwable e){
            System.out.println("Poiman exception 6");
        }
    }
}
