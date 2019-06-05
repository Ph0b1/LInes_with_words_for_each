package fileRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlphabeticallySortLinesOfTextInFile { // creating public class

    public static void main(String[] args) throws Exception {

        String inputFile = "input.txt"; //Set a string for a input from read file.
        String outputFile = "output.txt"; // Set a string for output file created.

        FileReader fileReader = new FileReader(inputFile); // Setting where the data will be taken from.
        BufferedReader bufferedReader = new BufferedReader(fileReader); // Reading an input file.
        String inputLine; // Initializing a string for read lines.
        List<String> lineList = new ArrayList<String>();
        while ((inputLine = bufferedReader.readLine()) != null) { // reading file till the end.
            lineList.add(inputLine);
        }
        fileReader.close(); // Close the read file and saving resources.

        Collections.sort(lineList); // Sorting all lines in alphabetical order.

        FileWriter fileWriter = new FileWriter(outputFile); // Spesifing the output file where sorted lines will be inputted.
        PrintWriter out = new PrintWriter(fileWriter);
        for (String outputLine : lineList) {
            out.println(outputLine);
        }
        out.flush(); // 
        out.close();
        fileWriter.close();

    }
}