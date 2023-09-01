public abstract class KlasaAbstrakcyjna {

    int pole;

    public int metodaNieabstrakcyjna () {
        int i;
        System.out.println("Metoda nieabstrakcyjna w klasie abstrakcyjnej");
        return i = 121;
    }

    public abstract String napisAbstrakcyjny();

}
