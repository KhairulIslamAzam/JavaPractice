package assignment.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<String> studentDetails = new ArrayList<>();
    public static List<String> allStudentResult = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        GpaCalcualtion gpaCalcualtion = new GpaCalcualtion();
        FileManager fileManager = new FileManager();

        studentDetails = fileManager.readFile();
        List<String> headInfo = studentDetails.subList(0, 6);

        gpaCalcualtion.resultCalculation(studentDetails,headInfo);
        allStudentResult =gpaCalcualtion.getAllStudentResult();
        main.creatFile(allStudentResult,studentDetails,fileManager);

    }
    public void creatFile(List<String> allStudentResult,List<String> studentDetails, FileManager fileManager){
        File file = null;

        for(int i =0,j=6; i<allStudentResult.size(); i++, j = j+6) {
            String path = "C:\\Users\\khair\\Desktop\\Java Assingment\\IOAssingment\\Output\\" + studentDetails.get(j) + ".txt";
            file = new File(path);
            fileManager.creatFile(file, allStudentResult.get(i));
        }
    }
}
