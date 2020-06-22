import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String id;
    private String email;
    private CourseWithNumber courseWithNumber;

    public Student(String name, String id, String email, CourseWithNumber courseWithNumber) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.courseWithNumber = courseWithNumber;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public CourseWithNumber getCourseWithNumber() {
        return courseWithNumber;
    }
}
