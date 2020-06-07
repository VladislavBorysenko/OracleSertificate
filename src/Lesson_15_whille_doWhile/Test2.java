package Lesson_15_whille_doWhile;

public class Test2 {
    public static void main(String[] args) {
        int money=100;
        while (money>0){
            System.out.println("Delayte stavku");
            System.out.println("Vu proigrali");
            System.out.println("Vash balans :"+money);

            money=money-10;
            if (money==0) System.out.println("Na vashe chetu ne ostalos deneg");
        }
        System.out.println(money);
    }
}
