package Task4.ReadFromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    private String[] array = new String[6];
    private String line = null;

    public String[] getArray(String location){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(location));
            int i = 0;

            while((line = bufferedReader.readLine())!= null){
                array[i++] = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return array;
    }
}
