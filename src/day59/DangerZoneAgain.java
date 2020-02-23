package day59;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DangerZoneAgain {


    /*
    * Handle or Declare are the way to deal with Checked Exception
    * if you are sure the method will never actually throw the exception
    * it is good to just declare it to go through compiler to make it happy
    * if here is actually a chance for the exception might left unhandled
    * its good to wrap up under try catch
    * */

    public static void main(String[] args) throws IOException, InterruptedException {


        //static method can directly been called in static method

        //calling a method that declare to throws checked exception

        try {
            readMyFile();
        }catch (FileNotFoundException e){
            System.out.println("Handling here , Just moving on");
        }

        //Thread class is coming from java.lang package
        Thread.sleep(3000);
        System.out.println("The End");

    }


    // document this method to tell the caller, the file you are about to read might not exist,
    // and handle the consequences yourself, the exception type already exists for this type of situation is called
    //FileNotFoundException from java.util package


    public static void readMyFile() throws IOException {

        List<String> allLines = Files.readAllLines(Paths.get("src/ErfansInputFile"));
        System.out.println("allLines = " + allLines);
        System.out.println("Reading the file in my computer. ");

        throw new FileNotFoundException("Kaboom, file is not found!!!");
    }
}
