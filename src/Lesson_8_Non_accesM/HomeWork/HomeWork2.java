package Lesson_8_Non_accesM.HomeWork;

public class HomeWork2 {
    static final double Pi = 3.14;

    public double sRound(int r) {
        return Pi * r * r;
    }

    public static double lRound(int r) {
        return 2 * Pi * r;
    }

    public void roundInfo(int r) {
        System.out.println("Radius cruga raven: " + r);
        System.out.println("Ploshad cruga ravna: " + sRound(r));
        System.out.println("Dlina okrugnosti ravna: " + lRound(r));
    }
}

class Test1 {
    public static void main(String[] args) {
        double plR;
        int r=3;
        HomeWork2 hm = new HomeWork2();
        plR=hm.sRound(r);
        System.out.println(plR);

        System.out.println(HomeWork2.lRound(r));

        hm.roundInfo(r);

    }
}
