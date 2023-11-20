package ie.atu;

import java.io.*;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the file name to open: ");
        String fileName = scanner.nextLine();

        try (Scanner inputFile = new Scanner (new File(fileName)))
        {
            while (inputFile.hasNext())
            {
                String str = inputFile.nextLine();
                System.out.println(str);
            }
        }

        catch (FileNotFoundException e)
        {
            System.out.println("File name not found .");
        }
    }
}
