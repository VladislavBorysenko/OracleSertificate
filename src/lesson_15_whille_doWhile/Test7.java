package lesson_15_whille_doWhile;

public class Test7 {
    public static void main(String[] args) {
        int money=100;
        do {
            System.out.println("Делайте ставку");
            System.out.println("----------------------------");
            System.out.println(" Вы проиграли");
        money-=10;
        }while (money>50);
    }
}
