package managers;

import collectionInfo.StudyGroup;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class FileManager {
    private static Gson gson = new Gson();
//    private String uploadedFile;

//    public FileManager(String uploadedFile) {
//        this.uploadedFile = uploadedFile;
//    }

    //добавить обработку ошибки с выводом сообщений???
    public void writeToFile(LinkedList<StudyGroup> collection) {
//        if (uploadedFile != null) {
        try (FileOutputStream fos = new FileOutputStream("groupsCollection.json")) {
            PrintWriter pw = new PrintWriter(fos);
            pw.write(gson.toJson(collection));
            pw.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


    public static LinkedList<StudyGroup> readFile() throws FileNotFoundException {
        File filename = new File("groupsCollection.json");
        Scanner sc = new Scanner(filename);
        LinkedList<StudyGroup> collection;
        collection = gson.fromJson(sc.nextLine().trim());
        return collection;

    }

    @Override
    public String toString() {
        String descr = "FileManager (class for managing files)";
        return descr;
    }
}

