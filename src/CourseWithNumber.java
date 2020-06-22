import java.util.HashMap;
import java.util.Map;

public class CourseWithNumber {
    private  Map<String,Double> courseAndNumberList = new HashMap<>();

    public CourseWithNumber(Map<String,Double> courseAndNumberList) {
        this.courseAndNumberList = courseAndNumberList;
    }

    public Map<String, Double> getCourseAndNumberList() {
        return new HashMap<>(courseAndNumberList);
    }
}
