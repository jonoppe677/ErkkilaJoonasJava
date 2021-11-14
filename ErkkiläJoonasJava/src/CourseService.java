import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

    public class CourseService implements ICourseService {

        List<Student> oppilaat = new ArrayList<>();
        List<Course> kurssit = new ArrayList<>();

        //Säädin näitä vaikka kuinka kauan enkä millään saanut päähäni että miten tämä
        //kuuluisi tehdä. Tässä keskeneräinen väkerrykseni

        @Override
        public List<Student> getStudents() {
            return oppilaat;
        }

        @Override
        public List<Course> getCourses() {
            return kurssit;
        }

        @Override
        public Student getStudentById(UUID studentId) {
            for (Student oppilas : oppilaat) {
                if(oppilas.getStudentId().equals(studentId)) {
                    return oppilas;
                }
            }
            return null;
        }

        @Override
        public Course getCourseById(UUID kurssiId) {
            for (Course kurssi : kurssit) {
                if(kurssi.kurssiId.equals(kurssiId)) {
                    return kurssi;
                }
            }
            return null;
        }

        @Override
        public List<Course> getCoursesOfStudent() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public boolean addStudentToCourse() {
            
            return false;
        }

}
