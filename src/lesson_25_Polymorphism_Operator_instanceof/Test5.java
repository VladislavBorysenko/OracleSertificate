package lesson_25_Polymorphism_Operator_instanceof;

public class Test5 {
    public static void main(String[] args) {
        String [] array1={"privet","poka"};
        Object[] array2=array1;
        String []array3= (String[]) array2;
       // array3[0]=new StringBuilder("ok");
        array2[0]=new StringBuilder("ok");
    }
}
