package lesson_26_Equals_ToString;

public class Test3 {
    void  abc(int i) {
        System.out.println("int");
    }
    void  abc(byte b) {
        System.out.println("byte");
    }
    void  abc(long l) {
        System.out.println("long");
    }

    void def(Object o){
        System.out.println("Object");
    }
    void def(String s){
        System.out.println("string");
    }

    void ghi(int a, int b){
        System.out.println("Hello1");
    }
    void ghi(long a, long b){
        System.out.println("Hello2");
    }
    void ghi(Integer a, Integer b){
        System.out.println("Hello3");
    }
    void ghi(int... a){
        System.out.println("Hello4");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(5);
        t.def("Hello");
        t.ghi(5,3);
    }
}
