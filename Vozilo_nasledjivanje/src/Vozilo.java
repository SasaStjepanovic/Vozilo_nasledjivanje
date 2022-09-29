public class Vozilo {
    public String serijskiBroj;
    protected int godinaProizvodnje;
    protected int brojKvarova;
    protected boolean ispravnost;

    public Vozilo(String serijskiBroj, int godinaProizvodnje, int brojKvarova, boolean ispravnost) {
        this.serijskiBroj = serijskiBroj;
        this.godinaProizvodnje = godinaProizvodnje;
        this.brojKvarova = brojKvarova;
        this.ispravnost = ispravnost;
    }

    public String ispis(){
        return "Serijski broj: " + serijskiBroj + " Godina proizvodnje: " +
                godinaProizvodnje + ", Broj kvarova: " + brojKvarova + ",";
    }

    public boolean ispravnostVozila(){
        if (brojKvarova>0){
            ispravnost = false;
            System.out.println("Vozilo => " + ispis() + "\n" + "Nije u ispravnom stanju" + "\n" + "_____________________________________________________________________________________________");
        }
        else {
            ispravnost = true;
            System.out.println("Vozilo => " + ispis() + "\n" + "U ispravnom stanju je" + "\n" + "_____________________________________________________________________________________________");
        }
        return ispravnost;
    }
}
