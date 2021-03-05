package managers;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Scanner;

public class FileManager {
    private Gson gson = new Gson();

    //добавить обработку ошибки с выводом сообщений???
    public void WriteFile(String collection) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("groupsCollection.json");
        PrintWriter pw = new PrintWriter(fos);
        pw.write(gson.toJson(collection));
    }

    public void ReadFile(String Collection) throws FileNotFoundException {
        //
    }

    @Override
    public String toString() {
        String descr = "FileManager (class for managing files)";
        return descr;
    }
}
