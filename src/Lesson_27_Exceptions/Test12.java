package Lesson_27_Exceptions;

public class Test12 {
   static void abc() {
       int[] arr = {1, 2, 3};
       try {
           System.out.println(arr[5]);
       } catch (ArrayIndexOutOfBoundsException e) {
           String s = null;
           try {
               System.out.println(s.length());
           } catch (NullPointerException e2) {
               System.out.println("Poyman null pointer exception");
           }
       }
   }
        public static void main (String[]args){
            abc();
        }

    }