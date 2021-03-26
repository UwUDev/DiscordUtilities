package me.uwu.saver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DscUtils {
    public static String getToken(){
        String t = null;
        try {
            File myObj = new File("test");
            Scanner myReader = new Scanner(myObj);
            t = myReader.nextLine();
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return t;
    }
}
