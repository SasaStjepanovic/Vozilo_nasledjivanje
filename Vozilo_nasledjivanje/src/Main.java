public class Main {
    public static void main(String[] args) {
        DrumskoVozilo drumskoVozilo = new DrumskoVozilo("KI2982832", 2013, 12, false, "Kamioncic");
        PlovnoVozilo plovnoVozilo = new PlovnoVozilo("PJ2982832", 2003, 0, false, "Brodic");

        drumskoVozilo.ispravnostVozila();
        plovnoVozilo.ispravnostVozila();



    }
}