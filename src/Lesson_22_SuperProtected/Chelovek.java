package Lesson_22_SuperProtected;

public class Chelovek {
    final String pol;
    private int vozrast;
    private int ves;
    private StringBuilder name;

    public Chelovek(String pol) {
        this.pol = pol;
    }



    public StringBuilder getName() {
        StringBuilder sb=new StringBuilder(name);
        return sb;
    }



    public void setName(StringBuilder name) {
        this.name = name;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i>0){
            vozrast=i;
        }
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int i) {
      if (i>0){
         ves=i;
      }
    }


}

class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName(new StringBuilder("Petya"));
        c.setVes(20);
        c.setVozrast(15);
        System.out.println(c.getName()+" "+c.getVes());
    }
}
