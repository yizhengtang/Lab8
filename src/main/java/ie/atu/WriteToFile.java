package ie.atu;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {
        File myFile = new File ("Text.txt");

        try {
            FileWriter addText = new FileWriter(myFile, true);

            addText.write("Hello\n");
            addText.write("My name is Yi Zheng Tang.\n");
            addText.write("This is FileWriter method.");
            addText.close();
            System.out.println("Text added to file successfully!");

        }

        catch (IOException e)
        {
            System.out.println("Error while adding text to the file.");
        }
    }
}
