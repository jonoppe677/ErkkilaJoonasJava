import java.util.List;

public interface ICourseService {
    
List<Student> getStudents();

List<Course> getCourses();

Student getStudentById();

Course getCourseById();

List<Course> getCoursesOfStudent();

boolean addStudentToCourse();

}
