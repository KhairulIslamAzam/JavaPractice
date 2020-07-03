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

public class FileManager {
    public void creatFile(File file, String result) {
        BufferedWriter bufferedWriter = null;

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(result);
            bufferedWriter.newLine();
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public List<String> readFile() {
        List<String> fullInfo = null;
        try {
            File file = new File("C:\\Users\\khair\\Desktop\\Java Assingment\\IOAssingment\\Input\\marks.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            fullInfo = new ArrayList<>();
            String[] info = null;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split(",");
                fullInfo.addAll(Arrays.asList(info));
            }
            //fullInfo = Arrays.asList(info);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fullInfo;
    }
}
