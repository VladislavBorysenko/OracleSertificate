package lesson_5_Methods;

public class Methods {
    int summa(int a, int b, int c) {

        int result = a + b + c;
        return result;
    }
    int srednee(int a1,int b1,int c1){
        int result2=summa(a1,b1,c1)/3;
        return result2;
    }
}
class Test{
    public static void main(String[] args) {
        Methods sum= new Methods();
        int z=sum.summa(1,5,7);
        System.out.println(z);
        System.out.println(sum.srednee(5,2,8));
    }
}