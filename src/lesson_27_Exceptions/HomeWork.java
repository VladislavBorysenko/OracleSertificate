package lesson_27_Exceptions;

public class HomeWork {
    public static void main(String[] args) {
        Tiger1 tiger = new Tiger1();
        tiger.eat("myaso");
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            } catch (NeVodaException e){
                System.out.println(e.getMessage());
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Eto inner finally block");
            }
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NeMyasoException extends RuntimeException {
    public NeMyasoException(String message) {
        super(message);
    }
}

class NeVodaException extends Exception {
    public NeVodaException(String message) {
        super(message);
    }
}

class Tiger1 {
    void eat(String food) {
        if (food.equalsIgnoreCase("myaso")) {
            System.out.println("Tigr est myaso");
        } else throw new NeMyasoException("Tigr ne est " + food);
    }

    void drink(String drink) throws NeVodaException {
        if (drink.equalsIgnoreCase("voda")) {
            System.out.println("Tigr pyet vodu");
        } else throw new NeVodaException("Tigr ne pyet" + drink);
    }
}