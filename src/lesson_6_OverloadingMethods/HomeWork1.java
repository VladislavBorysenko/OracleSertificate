package lesson_6_OverloadingMethods;

public class HomeWork1 {

    int sum() {
        System.out.println(0);
        return 0;
    }

    int sum(int a) {
        System.out.println(a);
        return a;
    }

    int sum(int a1, int b1) {
        int res=a1+b1;
        System.out.println(res);
        return res;
    }

    int sum(int a2, int b2, int c2) {
        int res=a2+b2+c2;
        System.out.println(res);
        return res;
    }

    int sum(int a3, int b3, int c3, int d3) {
        int res=a3+b3+c3+d3;
        System.out.println(res);
        return res;
    }

}

class HomeWork1Test {
    public static void main(String[] args) {
        HomeWork1 hm = new HomeWork1();
        int res = hm.sum();
        hm.sum();
        hm.sum(1);
        hm.sum(1,3);
        hm.sum(1,3,5);
        hm.sum(1,3,5,7);
    }
}
