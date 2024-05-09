import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/Data.txt";

        try {// Specify the file name or path
            FileReader fr = new FileReader(fileName);
            BufferedReader bf = new BufferedReader(fr);

           String line = bf.readLine();
           ArrayList<String> list = new ArrayList<>();
           String[] parts = line.split(", \n");
           for(String temp: parts)
           {
             list.add(temp);
           }

           int size = list.size();
            System.out.println("Total words in the data file are: " +size);

            //list.remove(3);
           // list.remove("\"tall\"");


           for(String temp : list)
               System.out.println(temp);
           //System.out.println(bf.readLine());
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        }
        catch(IOException e)
        {
            System.out.println("IO exception");
        }


    }
}
