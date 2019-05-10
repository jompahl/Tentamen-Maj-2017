public class Test {

    public static void main(String[] args) {
        Hus hus = new Hus();

        hus.setAdress("Kakelvägen 6B");
        hus.setInkopspris(1000000);

        Lagenhet l1 = new Lagenhet();
        Lagenhet l2 = new Lagenhet();

        l1.setNummer(11);
        l1.setHyra(6900);
        l1.setYta(70);
        l2.setNummer(12);
        l2.setHyra(8800);
        l2.setYta(95);

        Hyrestagare h1 = new Hyrestagare();
        Hyrestagare h2 = new Hyrestagare();
        Hyrestagare h3 = new Hyrestagare();
        Hyrestagare h4 = new Hyrestagare();

        h1.setNamn("Magnus Magnusson");
        h1.setPersonnummer("111");
        h2.setNamn("Anna Magnusson");
        h2.setPersonnummer("222");
        h3.setNamn("Olle Stensson");
        h3.setPersonnummer("333");
        h4.setNamn("Greta Stensson");
        h4.setPersonnummer("444");

        l1.setHus(hus);
        l2.setHus(hus);
        hus.laggTillLagenhet(l1);
        hus.laggTillLagenhet(l2);

        l1.laggTillHyrestagare(h1);
        l1.laggTillHyrestagare(h2);
        l2.laggTillHyrestagare(h3);
        l2.laggTillHyrestagare(h4);
        h1.setLagenhet(l1);
        h2.setLagenhet(l1);
        h3.setLagenhet(l2);
        h4.setLagenhet(l2);

        for(Hyrestagare h : hus.allaHyrestagareMedHyraÖver(8000)) {
            System.out.println(h.getNamn() + " " + h.getPersonnummer());
        }

        System.out.println(hus.vilkenLagenhetHyrHyrestagaren("111").getNummer());
    }
}
