import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

 
public class Clause {
    //set of integers
    static List<Integer> clause = new ArrayList<Integer>();
    public static List<String> getFirstLine = new ArrayList<String>();
    public static int numOfVariables;
    public static int numOfClauses;

    public static void readFile(String fileName) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        try {
            String line = br.readLine();
        
            while ((line = br.readLine()) != null) {
              
               
                if (line.startsWith("p")) {
                    String firstLine = line;
                    String[] splitFirstLine = firstLine.split(" ");
                    for (String x : splitFirstLine) {
                        // System.out.println(x);
                        numOfVariables = Integer.parseInt(splitFirstLine[2]);
                        numOfClauses = Integer.parseInt(splitFirstLine[3]);

                        //WHY DOES THIS PRINT OUT MULTIPLE TIMES?
                        System.out.println(numOfVariables);
                        System.out.println(numOfClauses);
                        }
                }
        
                //   removes the comments
                if (!line.startsWith("c") && !line.startsWith("p")) {
                    System.out.println(line);
                    //NEXT STEPS
                    // define the clause here
                    // say when clause ends
                    // add them to some data structure
                    // print them out like a cnf?
                    
                }

               
                
            }
        } finally {
            br.close();
        }
    }

    public static void main(String[] args) throws IOException {
        readFile("aim-50-1_6-yes1-4.cnf");

    }


}
