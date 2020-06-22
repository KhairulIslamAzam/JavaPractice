import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GapCalculator {
    private static Set<Student> studentList = new HashSet<>();
    private static Map<String,Double> number = null;

    public String gpaCalcuation(Map<String, Double> number) {
        int size = number.size();
        double result = 0;
        float ck = 0f;
        byte count = 0;
        for (Map.Entry<String, Double> subjectNumber : number.entrySet()) {
            ck = getGrade(subjectNumber.getValue());
            if(ck == 0f){
                count = 1;
                break;
            }
            result = result + ck;
            //ck = failCk(subjectNumber.getValue());
        }
        result =  result / size;
        if(count == 0){
            return "Total grade: "+result;
        }
        return  "Total grade: "+result+" Fail due to requir one or many subject grade below the  pass";
    }

    public float getGrade(double number) {
        float grade = 0f;
        if (number >= 80 && number <= 100) {
            grade = 4.0f;
        } else if (number >= 70 && number < 80) {
            grade = 3.5f;
        } else if (number >= 65 && number < 70) {
            grade = 3.0f;
        } else if (number >= 60 && number < 65) {
            grade = 2.5f;
        } else if (number >= 50 && number < 60) {
            grade = 2.0f;
        } else if (number >= 40 && number < 50) {
            grade = 1.0f;
        } else if (number < 40) {
            grade = 0.0f;
        }
        return grade;
    }

    public  Set<Student> getStudentList() {
        return new HashSet<>(studentList);
    }

    {
        number = new HashMap<>();
        number.put("Physics",80.0);
        number.put("Math",70.0);
        number.put("Chemistry",73.5);
        number.put("ICT",80.0);
        number.put("Bangla",80.0);
        Student karim = new Student("Karim","C12344","abc@gmail.com",
                new CourseWithNumber(number));
        studentList.add(karim);

        number = new HashMap<>();
        number.put("Physics",50.0);
        number.put("Math",70.0);
        number.put("Chemistry",55.0);
        number.put("ICT",80.0);
        number.put("Bangla",70.0);
        Student Rarim = new Student("Rarim","C12345","abc@gmail.com",
                new CourseWithNumber(number));
        studentList.add(Rarim);

        number = new HashMap<>();
        number.put("Physics",30.0);
        number.put("Math",70.0);
        number.put("Chemistry",55.0);
        number.put("ICT",80.0);
        number.put("Bangla",70.0);
        Student Rasel = new Student("Rasel","C12345","abc@gmail.com",
                new CourseWithNumber(number));
        studentList.add(Rasel);

    }

}
