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
                Scanner fileIn = new Scanner(new File(ReadFour.class.getResource("input.txt").getFile()));

                while (fileIn.hasNext()) {
                    int lineIn = fileIn.nextInt();
                        sum += lineIn;
                    System.out.println("Running total: " + sum);
                }
            }
            catch (IOException e) {
                System.out.println("File not found");
            }
        }
}