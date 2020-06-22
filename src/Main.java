import java.awt.geom.GeneralPath;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        GapCalculator gpaCalculator = new GapCalculator();
        File file = new File("C:\\Users\\khair\\Desktop\\Java Assingment\\IO\\result.txt");
        for(Student student: gpaCalculator.getStudentList()){
            String result = gpaCalculator.gpaCalcuation(student.getCourseWithNumber().getCourseAndNumberList());
            //System.out.println(result);
           // System.out.println(student.getName()+" "+student.getCourseWithNumber().getCourseAndNumberList());
            String fullInfo ="Student Name: "+student.getName() +" Course Info: "+student.getCourseWithNumber().getCourseAndNumberList()+"\n"+result;
            creatFile(file, fullInfo);
        }
    }
    public static void creatFile(File file, String result){
        BufferedWriter bufferedWriter = null;

            try {
                if(!file.exists()){
                    file.createNewFile();
                }
                bufferedWriter = new BufferedWriter(new FileWriter(file,true));
                bufferedWriter.write(result);
                bufferedWriter.newLine();
                bufferedWriter.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if(bufferedWriter != null){
                    try {
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
    }
}
