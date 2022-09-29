public class PlovnoVozilo extends Vozilo{

    String nazivPlovnogVozila;

    public PlovnoVozilo(String serijskiBroj, int godinaProizvodnje, int brojKvarova, boolean ispravnost, String nazivPlovnogVozila) {
        super(serijskiBroj, godinaProizvodnje, brojKvarova, ispravnost);
        this.nazivPlovnogVozila=nazivPlovnogVozila;
    }

    @Override
    public String ispis() {
        super.ispis();
        return super.ispis() + ", Tip vozila: " + nazivPlovnogVozila;
    }
}
