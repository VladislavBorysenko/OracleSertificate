package Lesson_23_Overriding_Hiding_Final;

public class Test6 {
}

class Animal {
    static String showName() {
        return "some Animal";
    }

    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}

class Mouse extends Animal {

    static String showName() {
        return "Jerry";
    }
    void showInfoAboutMouse(){
        System.out.println("Name of mouse: "+showName());
    }

    public static void main(String[] args) {
        Animal a = new Mouse();
        a.showInfoAboutAnimal();
        Mouse m=new Mouse();
        m.showInfoAboutAnimal();
        m.showInfoAboutMouse();
    }
}