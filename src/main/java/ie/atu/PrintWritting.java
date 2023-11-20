package ie.atu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.File;

public class PrintWritting {
    public static void main(String[] args) {
        File myFile = new File ("PrintWrite.txt");

        try (PrintWriter text = new PrintWriter (new FileWriter (myFile, true)))
        {
            text.println("Hello.");
            text.println("My name is Yi Zheng Tang, Michael.");
            text.println("This is PrintWriter method.");

            System.out.println("Text added into text file successfully!");
        }

        catch (IOException e)
        {
            System.out.println("Error occurred while adding text to the text file.");
        }
    }
}
