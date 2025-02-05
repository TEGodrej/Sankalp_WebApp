package io.gavl.SankalpWeb.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
    private static Properties prop = new Properties(); 

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\testing.engineer\\OneDrive - GODREJ INDUSTRIES LIMITED\\Desktop\\TestData\\SankalpPropertyFile.txt");
            prop.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String value = getProperty("yourKey");  
        System.out.println("Value: " + value);
    }

    public static String getProperty(String key) {
        String value = prop.getProperty(key); 
        return value;
    }
}


