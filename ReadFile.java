import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class ReadFile {
    public static void main(String[] args){

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
