public class KlasaZwykla extends KlasaAbstrakcyjna implements TestowyInterface, DrugiInterface {
    private int pole = 10;

    public void metodaKlasa () {
        System.out.println("Metoda wykonująca czynności w klasie zwykłej");
    }

    @Override
    public String napisAbstrakcyjny() {
        return "Napis dodany w klasie zwykłej dziedziczącej po abstrakcyjnej";
    }

    @Override
    public String metodaInterfejsu() {
        return "String zdefiniowany w klasie zwykłej, po zaimplementowaniu metody z TestowegoInterfejsu";
    }


    @Override
    public double metodaDrugiegoInterfejsu(double a) {
        double c = Math.sqrt(a);
        return c;
    }

    @Override
    public String stringDrugiegoInterfejsu() {
        return "String przesłonięty";
    }
}
