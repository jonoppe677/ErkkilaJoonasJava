public class OnlineCourse extends Course{
    public String osoite;

    //Metodi opiskelijan lisäämiseen kurssille
    public void lisääOpiskelija(Student opiskelija) {
        opiskelijaLista.add(opiskelija);
    }

    //Metodi opiskelijan poistamiseen kurssilta
    public void poistaOpiskelija(Student opiskelija) {
        opiskelijaLista.remove(opiskelija);
    }

    //Aliluokan getterit ja setterit
    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }
    public String getOsoite() {
        return osoite;
    }

    //Siisti kuvaus kurssista
    @Override
    public String toString() {
        return kurssiNimi + " - " + opettajaNimi + " - " + osoite;
    }
}
