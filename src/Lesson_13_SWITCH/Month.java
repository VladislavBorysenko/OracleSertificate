package Lesson_13_SWITCH;

public class Month {
    int month;

    public Month(int month) {
        this.month = month;
    }

    public static void main(String[] args) {

        Month mt = new Month(2);
        switch (mt.month){
            case 1:
                System.out.println("Yanvar 31 den");
                break;
            case 2:
                System.out.println("Fevral 28 dney");
                break;
            case 3:
                System.out.println("Mart 31 den");
                break;
            case 4:
                System.out.println("Aprel 30 dney");
                break;
            case 5:
                System.out.println("May 31 den");
                break;
            case 6:
                System.out.println("Iyn 30 dney");
                break;
            case 7:
                System.out.println("Iyl 31 den");
                break;
            case 8:
                System.out.println("Avgust 31 den");
                break;
            case 9:
                System.out.println("Sentyabr 30 dney");
                break;
            case 10:
                System.out.println("Oktyabr 31 den");
                break;
            case 11:
                System.out.println("Noyabr 30 dney");
                break;
            case 12:
                System.out.println("Dekabr 31 den");
                break;
            default:
                System.out.println("Takogo mesaca ne suchestvuet");
        }

    }
}
