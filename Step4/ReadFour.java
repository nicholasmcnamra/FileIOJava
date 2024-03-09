package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args) {
            // Print out a running total of all the
            // values in the input file.
            int sum = 0;
            try {
                Scanner fileIn = new Scanner(new File("input.txt"));

                while (fileIn.hasNext()) {

                    String lineIn = fileIn.nextLine();
                    String[] input = lineIn.split(",");
                    for (int i = 0; i < input.length; i ++) {
                        sum += Integer.parseInt(input[i]);
                    }
                    System.out.println(sum);
                }
            }
            catch (IOException e) {
                System.out.println("File not found.");
            }
        }
}