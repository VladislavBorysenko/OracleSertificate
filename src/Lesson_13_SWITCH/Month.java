package Lesson_13_SWITCH;

public class Month {
    int month;

    public Month(int month) {
        this.month = month;
    }

    public static void main(String[] args) {

        Month mt = new Month(2);
        switch (mt.month){
            case 2:
                System.out.println("Количество дней в месяце 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Количество дней в месяце 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                System.out.println("Количество дней в месяце 31");
            default:
                System.out.println("Takogo mesaca ne suchestvuet");
        }

    }
}
