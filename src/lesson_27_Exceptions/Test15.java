package lesson_27_Exceptions;

public class Test15 {
    void marafon(int temperaturaVozduha, int tempBega) throws PodvernutNoguException {
        if (tempBega>12){
            throw new PodvernutNoguException("temp bega bul slishkom visokii: "+tempBega);
        }
        if (temperaturaVozduha>32){
            throw new SveloMishcuExceptio();
        }
        System.out.println("Vu probezhali marafon");
    }

    public static void main(String[] args) {
        Test15 test15=new Test15();
        try {
            test15.marafon(15,15);
        } catch (PodvernutNoguException e) {
            System.out.println( e.getMessage());
        }
        finally {
            System.out.println("V lubom sluchae vu poluchite gramotu");
        }
    }
}

class PodvernutNoguException extends Exception {
    PodvernutNoguException(String message) {
        super(message);
    }

    public PodvernutNoguException() {
    }
}

class SveloMishcuExceptio extends RuntimeException {
    SveloMishcuExceptio(String message){
        super(message);
    }
    public SveloMishcuExceptio(){}
}
