package assignment.io;

import java.util.ArrayList;
import java.util.List;

public class GpaCalcualtion {
    private List<String> allStudentResult = null;

    public GpaCalcualtion() {
        this.allStudentResult = new ArrayList<>();
    }

    public void resultCalculation(List<String> studentDetails, List<String> headInfo) {
        int size = studentDetails.size() / headInfo.size() - 1;
        int sz = (headInfo.size() + 2);

        while (size > 0) {
            double result = 0;
            float ck = 0f;
            byte count = 0;
            int limit = sz + 4;

            String studentInfo = null;
            String resultInfo = null;

            String courseInfo ="------------------------------------------\n"+
                    "Subject | " + " Marks | " + " Grade point | " + " Grade |";
            courseInfo = courseInfo + "\n------------------------------------------";

            for (int i = sz, j = 2; i < limit; i++, j++) {
                ck = getGradePoint(Double.valueOf(studentDetails.get(i)));
                courseInfo = courseInfo + "\n" + headInfo.get(j) + " |" +
                        studentDetails.get(i) + " | " + ck + " | " + grade(ck) + " |";
                courseInfo = courseInfo + "\n------------------------------------------";

                if (ck == 0f) {
                    count++;
                }
                result = result + ck;
            }
            result = result / 4;

            if (count >= 1) {
                resultInfo = "GPA " + result + " Fail due to requir " + count + " subject grade below the  pass";
            } else {
                resultInfo = "GPA " + result;
            }

            studentInfo = "Student Name: " + studentDetails.get(sz - 1) + " Student Id: " + studentDetails.get(sz - 2);
            this.allStudentResult.add((studentInfo + "\n" + courseInfo + "\n" + resultInfo));

            sz = limit + 2;
            size--;
        }
    }

    public String grade(float number) {
        String gp = null;
        if (number == 4.0f) {
            gp = "A+";
        } else if (number == 3.5f) {
            gp = "A";
        } else if (number == 3.5f) {
            gp = "A";
        } else if (number == 3.0f) {
            gp = "A-";
        } else if (number == 2.5f) {
            gp = "B";
        } else if (number == 2.0f) {
            gp = "C";
        } else if (number == 1.0f) {
            gp = "D";
        } else if (number == 0.0f) {
            gp = "F";
        }
        return gp;
    }

    public float getGradePoint(double number) {
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

    public List<String> getAllStudentResult() {
        return new ArrayList<>(allStudentResult);
    }
}
