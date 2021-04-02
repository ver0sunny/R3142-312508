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
    public static void writeToFile(LinkedList<StudyGroup> collection) {
//        if (uploadedFile != null) {
        try (FileOutputStream fos = new FileOutputStream("groupsCollection.json")) {
            PrintWriter pw = new PrintWriter(fos);
            pw.write(gson.toJson(collection));
            pw.close();
        } catch (IOException exception) {
        }
    }


    public LinkedList<StudyGroup> readFile() {
        Scanner sc = new Scanner(System.in);

        LinkedList<StudyGroup> collection;
        Type type = new TypeToken<LinkedList<StudyGroup>>() {}.getType();
        collection = gson.fromJson(sc.nextLine().trim(), type);

        return collection;
    }

    @Override
    public String toString() {
        String descr = "FileManager (class for managing files)";
        return descr;
    }
}

