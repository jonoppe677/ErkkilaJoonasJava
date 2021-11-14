import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

    //Luodaan etäkurssi
    OnlineCourse Matikka = new OnlineCourse();
    Matikka.setKurssi("Matematiikka");
    Matikka.setOpettaja("Pirkko");
    Matikka.setOsoite("www.zoom.com");

    //Luodaan lähikurssi
    LocalCourse Fysiikka = new LocalCourse();
    Fysiikka.setKurssi("Fysiikka");
    Fysiikka.setOpettaja("Jukka");
    Fysiikka.setLuokkatila("Monitoimitila");

    //Luodaan opiskelijoita
    Student s1 = new Student("Jaska", "Jokunen");
    Student s2 = new Student("Matti", "Meikäläinen");  
    Student s3 = new Student("Aku", "Ankka");
    Student s4 = new Student("Iines", "Ankka");
    Student s5 = new Student("Jack", "Sparrow");
    Student s6 = new Student("Matt", "Stonie");
    Student s7 = new Student("Jesse", "Pynnönen");  
    Student s8 = new Student("Maija", "Maijanen");
    Student s9 = new Student("Ukko", "Metso");
    Student s10 = new Student("Rose", "Jack");
    Student s11 = new Student("Muumi", "Peikko");
    Student s12 = new Student("Hatti", "Vatti");  
    Student s13 = new Student("Tyrion", "Lannister");
    Student s14 = new Student("Andy", "Dwyer");
    Student s15 = new Student("Mouse", "Rats");
    Student s16 = new Student("Jeesus", "Kristus");
    Student s17 = new Student("Geraldt", "Rivia");  
    Student s18 = new Student("Allah", "Mohammed");
    Student s19= new Student("Hessu", "Hopo");
    Student s20 = new Student("Rosh", "Tein");
    Student s21 = new Student("Robo", "Cop");  
    Student s22 = new Student("Benedict", "Cumberbatch");
    Student s23 = new Student("Niilo", "Kosola");
    Student s24 = new Student("Mamma", "Mia");

    //Lisätään opiskelijoita etäkurssille
    Matikka.lisääOpiskelija(s1);
    Matikka.lisääOpiskelija(s2);
    Matikka.lisääOpiskelija(s3);
    Matikka.lisääOpiskelija(s4);
    Matikka.lisääOpiskelija(s5);
    
    //Näytetään etäkurssille osallistuvat opiskelijat ja kurssin tiedot
    System.out.println(Matikka);
    Matikka.näytäOpiskelijat();

    //Lisätään opiskelijoita lähikurssille
    Fysiikka.lisääOpiskelija(s1);
    Fysiikka.lisääOpiskelija(s2);
    Fysiikka.lisääOpiskelija(s3);
    Fysiikka.lisääOpiskelija(s4);
    Fysiikka.lisääOpiskelija(s5);
    Fysiikka.lisääOpiskelija(s6);
    Fysiikka.lisääOpiskelija(s7);
    Fysiikka.lisääOpiskelija(s8);
    Fysiikka.lisääOpiskelija(s9);
    Fysiikka.lisääOpiskelija(s10);
    Fysiikka.lisääOpiskelija(s11);
    Fysiikka.lisääOpiskelija(s12);
    Fysiikka.lisääOpiskelija(s13);
    Fysiikka.lisääOpiskelija(s14);
    Fysiikka.lisääOpiskelija(s15);
    Fysiikka.lisääOpiskelija(s16);
    Fysiikka.lisääOpiskelija(s17);
    Fysiikka.lisääOpiskelija(s18);
    Fysiikka.lisääOpiskelija(s19);
    Fysiikka.lisääOpiskelija(s20);
    Fysiikka.lisääOpiskelija(s21);
    Fysiikka.lisääOpiskelija(s22);
    Fysiikka.lisääOpiskelija(s23);
    Fysiikka.lisääOpiskelija(s24);
    
    //Näytetään Fysiikka kurssille osallistuvat opiskelijat ja kurssin tiedot
    Fysiikka.näytäOpiskelijat();
    System.out.println(Fysiikka);

    CourseService i = new CourseService();


    i.oppilaat.add(s1);

    i.getStudents();

    
}
}
