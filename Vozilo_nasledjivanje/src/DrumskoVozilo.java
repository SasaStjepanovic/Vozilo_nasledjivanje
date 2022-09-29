public class DrumskoVozilo extends Vozilo {
    static String nazivDrumskogVozila;

    public DrumskoVozilo(String serijskiBroj, int godinaProizvodnje, int brojKvarova, boolean ispravnost, String nazivDrumskogVozila) {
        super(serijskiBroj, godinaProizvodnje, brojKvarova, ispravnost);
        this.nazivDrumskogVozila=nazivDrumskogVozila;
    }

    @Override
    public String ispis() {
        super.ispis();
        return super.ispis() + ", Tip vozila: " + nazivDrumskogVozila;
    }
}
