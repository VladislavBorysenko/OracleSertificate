public class GdeMenyaNaebali {
    public static void main(String[] args) {
        int stavka=17500;
        final double NALOG=19.5;
        double zp=stavka-((stavka/100)*NALOG);
        System.out.println("Moya zarabatnaya plata po dokumenam"+zp);
       double zpK=zp-(zp/100)*25;
        System.out.println("Moya zarabatnaya plata vo vremya karantina "+zpK);
        double pererabotki=zpK/160;
        System.out.println("Zarplata za chac v karantine "+pererabotki);
    }
}
