import java.util.ArrayList;

public class Lagenhet {

    private int nummer;
    private int hyra;
    private int yta;
    private Hus hus;
    private ArrayList<Hyrestagare> hyrestagarLista = new ArrayList<>();

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public int getHyra() {
        return hyra;
    }

    public void setHyra(int hyra) {
        this.hyra = hyra;
    }

    public int getYta() {
        return yta;
    }

    public void setYta(int yta) {
        this.yta = yta;
    }

    public Hus getHus() {
        return hus;
    }

    public void setHus(Hus hus) {
        this.hus = hus;
    }

    public ArrayList<Hyrestagare> getHyrestagarLista() {
        return hyrestagarLista;
    }

    public void setHyrestagarLista(ArrayList<Hyrestagare> hyrestagarLista) {
        this.hyrestagarLista = hyrestagarLista;
    }

    public Hyrestagare hittaHyrestagare(String pnr) {

        for(Hyrestagare h : hyrestagarLista) {
            if(h.getPersonnummer().equals(pnr)) {
                return h;
            }
        }
        return null;
    }

    public void laggTillHyrestagare(Hyrestagare person) {
        hyrestagarLista.add(person);
    }
}
