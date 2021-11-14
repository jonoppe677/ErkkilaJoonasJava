public class LocalCourse extends Course{
    public String luokkatila;
    public int luokanKoko = 20;
    public int oppilaitaLuokassa = 0;
    public boolean mahtuuko;

    //Lisätessä oppilaita aliluokkaan LocalCourse, tarkistetaan ensin että mahtuuko luokkatilaan enempää.
    //Jos mahtuu, lisätään opiskelija kurssille. Muutoin ilmoitetaan kenelle tila ei riittänyt.
    public void lisääOpiskelija(Student opiskelija) {
    if(luokanKoko > oppilaitaLuokassa){
        mahtuuko = true;
        opiskelijaLista.add(opiskelija);
        ++oppilaitaLuokassa;
    }
        else {
        mahtuuko = false;
        System.out.println("Opiskelija " + opiskelija + " ei mahtunut enään kurssille " + kurssiNimi + ".");
    }
    }

    //Metodi opiskelijan poistamiseen kurssilta
    public void poistaOpiskelija(Student opiskelija) {
        opiskelijaLista.remove(opiskelija);
    }

    //getterit ja setterit luokkatilan lisäämiseen
    public void setLuokkatila(String luokkatila) {
        this.luokkatila = luokkatila;
    }
    
    public String getLuokkatila() {
        return luokkatila;
    }

    //Siisti kuvaus kurssista
    @Override
    public String toString() {
        return kurssiNimi + " - " + opettajaNimi + " - " + luokkatila;
    }
}
