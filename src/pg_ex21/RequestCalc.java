package pg_ex21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RequestCalc {
	public static void main(String[] args) {
		final int GYOU = 10000;
		String[][] rec;
		rec = new String[GYOU][80];

        try{
        	BufferedReader reader = new BufferedReader(new FileReader("record"));
        	int i=0;
        	String line;
        	while ((line = reader.readLine()) != null) {
    			System.out.println(line);
//        		rec[i][80]=line;
//       		i++;
        	}
        	reader.close();
        } catch (IOException e) {
			System.out.println(e);
		}



	}
}
