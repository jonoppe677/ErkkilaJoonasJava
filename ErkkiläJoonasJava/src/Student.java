public class Student extends CourseService{

    public static int count = 0;
    public String etunimi;
    public String sukunimi;
    private int id;

    //Luokan Student konstruktori
    public Student(String etunimi, String sukunimi) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        setId(++count);
    }

    //getteri ja setteri luodun olion id:lle
    public int getId() {
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }

    //Palauttaa opiskelijan tiedot siististi
    @Override
    public String toString() {
        return sukunimi + " " + etunimi;
    }
}
