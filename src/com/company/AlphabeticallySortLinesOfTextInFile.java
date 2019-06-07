package fileRead;

import java.rmi.server.ObjID;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

import static java.util.Collections.*;

public class AlphabeticallySortLinesOfTextInFile { // creating public class

    public static void main(String[] args) {

        List<String> line1 = new LinkedList<String>();
        line1.add(0, "How");
        line1.add(1, "doth");
        line1.add(2, "the");
        line1.add(3, "little");
        line1.add(4, "crocodile");

        List<String> line2 = new LinkedList<String>();
        line2.add(0, "Improve");
        line2.add(1, "his");
        line2.add(2, "shining");
        line2.add(3, "tail");

        List<String> line3 = new LinkedList<String>();
        line3.add(0, "And");
        line3.add(1, "pour");
        line3.add(2, "the");
        line3.add(3, "waters");
        line3.add(4, "of");
        line3.add(5, "the");
        line3.add(6, "Nile");

        List<String> line4 = new LinkedList<String>();
        line4.add(0, "On");
        line4.add(1, "every");
        line4.add(2, "golden");
        line4.add(3, "scale!");


        System.out.print(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4);
        System.out.printf("\n");
        
        String[] test1 = new String[]{"doth", "his", "pour", "every"};

        Arrays.sort(test1, String.CASE_INSENSITIVE_ORDER);

        for (int a = 0; a < test1.length; a++) {
            System.out.println(test1[a]);


        }
    }
}