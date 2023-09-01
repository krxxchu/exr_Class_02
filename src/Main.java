public class Main {
    public static void main(String[] args) {

        KlasaZwykla obiektKlasaZwykla = new KlasaZwykla() {
            @Override
            public void metodaKlasa() {
                System.out.println("Anonimowa Klasa: metoda");
            }

            @Override
            public String metodaInterfejsu() {
                return "Napis z anoniomwej klasy - metody interfejsu";
            }
        };

        /* nie można tworzyć bezpośrednio obiektu z Interfejsu, lecz w klasie anonimowej implementujemy interfejsy,
 przesłaniamy metody oraz nadajemy im funkcjonalność, oraz tworzymy obiekt */

         KlasaAbstrakcyjna obiektKlasaAbstrakcyjna = new KlasaAbstrakcyjna() {

            @Override
            public String napisAbstrakcyjny() {
                return "Druga utworzona klasa anonimowa i utoworzony w niej napisAbstrakcyjny ";
            }

            DrugiInterface obiektDrugiegoInterfejsu = new DrugiInterface() {
                @Override
                public double metodaDrugiegoInterfejsu(double a) {
                    double k = Math.round(a);
                    return k;
                }

                @Override
                public String stringDrugiegoInterfejsu() {
                    return null;
                }
            };


        };

    }
}