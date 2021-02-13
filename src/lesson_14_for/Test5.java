package lesson_14_for;

public class Test5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

          if (i == 87) {
                // break;//останавливает цикл
                continue; //переходим на следующий итерейшон. Не спускаемся вниз
            }

            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                break;
            }if (i%55==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
