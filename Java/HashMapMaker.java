import java.util.Scanner;
import java.io.*;

public class HashMapMaker {

    /**
     * A simple program that creates a HashMap<String, String> from a csv file or any text file with fields separated by whitespace.
     * @name HashMapMaker
     * @author tcarisland
     * @date 11. jul. 2016
     * 
     */
    
    public static void main(String args[]) {
	try {
	    Scanner in = new Scanner(new File(args[0]));
	    PrintWriter out = new PrintWriter(new File(args[1]));
	    out.println("private static final Map<String, String> m = new HashMap<String, String>() {{");
	    while(in.hasNextLine()) {
		String pair[] = in.nextLine().split("\\s+");
		if(pair.length > 1)
		    out.println("put (\"" + pair[0] + "\", \"" + pair[1] + "\");");
	    }
	    in.close();
	    out.println("}};");
	    out.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
}
