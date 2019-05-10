import java.util.ArrayList;

public class Hus {

    private String adress;
    private int inkopspris;
    private ArrayList<Lagenhet> lagenhetsLista = new ArrayList<>();

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getInkopspris() {
        return inkopspris;
    }

    public void setInkopspris(int inkopspris) {
        this.inkopspris = inkopspris;
    }

    public ArrayList<Lagenhet> getLagenhetsLista() {
        return lagenhetsLista;
    }

    public void setLagenhetsLista(ArrayList<Lagenhet> lagenhetsLista) {
        this.lagenhetsLista = lagenhetsLista;
    }

    public Lagenhet vilkenLagenhetHyrHyrestagaren(String pnr) {

        for(Lagenhet l : lagenhetsLista) {
            if(l.hittaHyrestagare(pnr) != null) {
                return l;
            }
        }
        return null;
    }

    public void laggTillLagenhet(Lagenhet lagenhet) {
        lagenhetsLista.add(lagenhet);
    }

    public Lagenhet hittaLagenhet(int iNr) {

        for(Lagenhet l : lagenhetsLista) {
            if(l.getNummer() == iNr) {
                return l;
            }
        }
        return null;
    }

    public ArrayList<Hyrestagare> allaHyrestagareMedHyraÖver(int belopp) {
        ArrayList<Hyrestagare> tmpList = new ArrayList<>();

        for(Lagenhet l : lagenhetsLista) {
            if(l.getHyra() > belopp) {
                for(Hyrestagare h : l.getHyrestagarLista()) {
                    tmpList.add(h);
                }
                //en annan lösning är addAll den ser ut såhär
                //tmpList.addAll(l.getHyrestagarLista());
            }
        }
        return tmpList;
    }
}
