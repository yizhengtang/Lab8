package ie.atu;
import java.io.File;
import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CreateFile {
    public static void main(String[] args) {

        String fileName = "TextFile.txt";

        File myFile = new File (fileName);

        try
        {
            if (myFile.createNewFile())
            {
                System.out.println("File Created Successfully at " + myFile.getAbsolutePath());
            }
            else
            {
                System.out.println("File already exists at " + myFile.getAbsolutePath());
            }
        }

        catch (IOException e)
        {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}