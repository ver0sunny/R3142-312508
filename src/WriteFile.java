import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonParseException;

public class WriteFile {
    private Gson gson = new Gson();

    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("groupsCollection.json");
        PrintWriter pw = new PrintWriter(fos);

        pw.println("I am very lost");
        pw.close();

    }
}

