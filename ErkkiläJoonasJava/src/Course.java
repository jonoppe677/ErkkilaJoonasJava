import java.util.ArrayList;
public class Course {

    ArrayList<Student> opiskelijaLista;
    public static int count = 0;
    public String kurssiNimi;
    public String opettajaNimi;
    public String opiskelija;
    private int id;

    //Luokan Course konstruktori
    public Course() {
        this.kurssiNimi = "Ei asetettu";
        this.opettajaNimi = "Ei asetettu";
        opiskelijaLista = new ArrayList<Student>();
        setId(++count);
    }

    //Tulostetaan lista kurssille osallistuvista opiskelijoista
    public void näytäOpiskelijat() {
            System.out.println(" ");
            System.out.println("Kurssin " + kurssiNimi + " opiskelijat: ");
        for (Student opiskelija : opiskelijaLista) {
            System.out.println(opiskelija);
    }
            System.out.println(" ");
    }

    //Luokan setterit ja getterit
    public String getOpettaja() {
        return opettajaNimi;
    }
    public void setOpettaja(String opettajaNimi) {
        this.opettajaNimi = opettajaNimi;
    }

    public String getKurssi() {
        return kurssiNimi;
    }
    public void setKurssi(String kurssiNimi) {
        this.kurssiNimi = kurssiNimi;
    }

    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }


}
