package lesson_9_Variables;

public class Car {
    String color;
    String engine;
    static int count;

    int a;

    public static void changeA(int b){
        Car car=new Car("Green","V6");
        car.a=b;

        //таким образом что бы обратиться к к нестатической переменной а, в статическом методе
        //нам необходимо в этом методе создать обьект. Но наш обьект становиться локальной переменной
    }

    public Car(String colorCar, String engineCar){
        count++;
        color=colorCar;
        engine=engineCar;

    }

    public void showColor(){
        System.out.println("Cvet mschini: "+color);
        changeColor("black");
    }

    public void changeColor(String newColor){
        String a=newColor;
        System.out.println("Cvet machini izmenilsa");
        int cena=5000;
        color=newColor;
        cena+=1000;
    }
}
