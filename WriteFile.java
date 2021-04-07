import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class WriteFile{
    public static void main(String[] args){
        /*try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/

        try{
            File myText = new File("filename.txt");
            Scanner myReader = new Scanner(myText);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } 
        catch(FileNotFoundException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
        
        
      
    }
}